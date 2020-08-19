package carrus;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SqlFunctions {
    static int cartid=1;
    static boolean firstCart=true;
    static int storeId;
    private Connection con;
    private Statement stmt;
    private ResultSet rs,rs1;
    public static HashMap<String,Integer> storeDist = new HashMap<>();
    public static HashMap<String, Integer> sortedStoreDist = new LinkedHashMap<String, Integer>(); 
    public SqlFunctions(){
    con= SqlSingletonConnection.getConnection();
        try{
            stmt=con.createStatement();
        }
        catch(SQLException e){
            System.out.println(e);
        }
    }
    ArrayList itemSearch(String itemToBeSearched){
        ArrayList<Integer> shopId = new ArrayList<>();
        try{
            rs = stmt.executeQuery("Select ShopID from shop_item where item_no = (Select item_no from item where item_name='"+itemToBeSearched+"')");
            while(rs.next())  
                shopId.add(rs.getInt(1)); 
        }
        catch(SQLException e){
            System.out.println(e);
        }
        return shopId;
    }
    void shopDisplay(HashMap<Integer,Integer> distShop){
        
        Iterator distIter = distShop.entrySet().iterator();
        while(distIter.hasNext()){
            Map.Entry mapElement = (Map.Entry)distIter.next();
            try{
                rs = stmt.executeQuery("Select ShopName from shop where ShopID="+mapElement.getKey());
                rs.next();
                storeDist.put(rs.getString(1), (int)mapElement.getValue());
            }
            catch(SQLException e){
                System.out.println(e);
            }  
        }
        sortHashMapValues(true);
    } 
    void sortHashMapValues(boolean order)
    {
            List<Entry<String, Integer>> list = new LinkedList<>(storeDist.entrySet());  
            Collections.sort(list, (Entry<String, Integer> o1, Entry<String, Integer> o2) -> {
                if (order)
                {
                    return o1.getValue().compareTo(o2.getValue());
                }
                else
                {
                    return o2.getValue().compareTo(o1.getValue());
                }
            });
            
           list.forEach((aa) -> {
               sortedStoreDist.put(aa.getKey(), aa.getValue());
        }); 
    }
   HashMap itemDisplay(int storeNo){
       HashMap<String,Integer> itemList = new HashMap<>();
       try{           
           rs = stmt.executeQuery("Select item_name,price from item where item_no in (select item_no from shop_item where ShopID="+storeNo+")");
           while(rs.next()){
               itemList.put(rs.getString(1),rs.getInt(2));
           }      
       }
       catch(SQLException e){
           System.out.println(e);
       }
       return itemList;
   } 
   HashMap idQuants(int storeNo)
   {
        HashMap<Integer,Integer> idQuant = new HashMap<>();
        try{
           
           rs = stmt.executeQuery("select item_no, quantity from shop_item where ShopId ="+storeNo);
           while(rs.next()){
               idQuant.put(rs.getInt(1),rs.getInt(2));
           }     
           
       }
       catch(SQLException e){
           System.out.println(e);
       }
       return idQuant;
   }  
   int getStoreId(String storeLabel)
   {
       int storeNo=0;
       System.out.println("Printing store label "+storeLabel);
       try{
            rs = stmt.executeQuery("Select ShopID from shop where ShopName ='"+storeLabel+"'");
           while(rs.next())
           {
             storeNo=rs.getInt(1);
             storeId=storeNo;
           }
       }
        catch(SQLException e){
            System.out.println(e);
       }     
       return storeNo;
   }
   int getPrice()
   {
       int price=0;
       SearchScreen ss = new SearchScreen();
       String text = ss.passString();
       try
       {
            rs = stmt.executeQuery("Select price from item where item_name ='"+text+"'");
            while(rs.next())
            {
                 price= rs.getInt(1);
            }
       }
       catch(SQLException e)
       {
           System.out.println(e);
       }
       return price;
   }
   HashMap setMapStoreScreen()
   {  
       return sortedStoreDist;
   }
   Integer itemIdChecker(String itemName){
       Integer itemID=0;
       try{
           rs = stmt.executeQuery("Select item_no from item where item_name='"+itemName+"'");
           rs.next();
           itemID = rs.getInt(1);

       }
       catch(SQLException e){
           System.out.println(e);
       }
       return itemID;
   }
   void updateQuantityAdd(int itemNo)
   {
       String query1 = "SELECT quantity_p FROM cart_item WHERE ItemId = ? and CartId = ?";
       try{
                 PreparedStatement pstmt = con.prepareStatement(query1); 
                  pstmt.setInt(1, itemNo);
                  pstmt.setInt(2, cartid);
                  rs = pstmt.executeQuery();
                  if(rs.next()==false)
                   {
                       System.out.println("First time insertion");
                       String query = " insert into cart_item(CartId, ItemId, quantity_p)" + " values (?, ?, ?)";
                             PreparedStatement preparedStmt = con.prepareStatement(query);
                             preparedStmt.setInt(1, cartid);
                             preparedStmt.setInt(2, itemNo);
                             preparedStmt.setInt(3, 1);
                             preparedStmt.execute();
                  }
                   else
                   {
                         System.out.println("First time update"); 
                         int quan = rs.getInt(1);
                         quan++;
                         String sql = "UPDATE cart_item " + "SET quantity_p = ? WHERE ItemId = ? and CartId = ?";
                         PreparedStatement preparedStmt = con.prepareStatement(sql);
                         preparedStmt.setInt(1, quan);
                         preparedStmt.setInt(2, itemNo);
                         preparedStmt.setInt(3, cartid);
                         preparedStmt.execute();  
                   }
       }
       catch(SQLException e)
       {
           System.err.println("Got an exception!");
           System.err.println(e.getMessage());
       }
   }
   
   void updateQuantitySub(int itemNo)
   {
       String query1 = "SELECT quantity_p FROM cart_item WHERE ItemId = ? and CartId = ?";
       try{
                 PreparedStatement pstmt = con.prepareStatement(query1); 
                  pstmt.setInt(1, itemNo);
                  pstmt.setInt(2, cartid);
                  rs = pstmt.executeQuery();
                  if(rs.next()==false)
                   {
                       System.out.println("Item Deleted");
                   
                  }
                   else
                   {
                        int quan = rs.getInt(1);
                        quan--;
                        if(quan==0)
                        {
                           String sql = "Delete from cart_item " + "WHERE ItemId = ? and CartId = ?";
                           PreparedStatement preparedStmt = con.prepareStatement(sql);
                           preparedStmt.setInt(1, itemNo);
                           preparedStmt.setInt(2, cartid);
                           preparedStmt.execute();
                        }
                        else
                        {
                         String sql = "UPDATE cart_item " + "SET quantity_p = ? WHERE ItemId = ? and CartId = ?";
                         PreparedStatement preparedStmt = con.prepareStatement(sql);
                         preparedStmt.setInt(1, quan);
                         preparedStmt.setInt(2, itemNo);
                         preparedStmt.setInt(3, cartid);
                         preparedStmt.execute();
                        } 
                   }
       }
       catch(SQLException e)
       {
           System.err.println("Got an exception!");
           System.err.println(e.getMessage());
       }
   }
   void UpdateCartTable()
   {
       java.util.Date date=new java.util.Date();
       java.sql.Timestamp sqlTime=new java.sql.Timestamp(date.getTime());
       System.out.println("Cart function called");
       if(firstCart)
       {
           firstCart = false;
           try{
               String sql = "Delete from cart";
                PreparedStatement preparedStmt1 = con.prepareStatement(sql);
                preparedStmt1.execute();                  
             String query1 = " insert into cart(cartId,status ,custphone,timestamp,otp,payment_option,total_payment,ShopID,KioskID,email_id)" + " values (?,?,?,?,?,?,?,?,?,?)";
                             PreparedStatement preparedStmt = con.prepareStatement(query1);
                             preparedStmt.setInt(1, cartid);
                             preparedStmt.setString(2, "In progress");
                             preparedStmt.setString(3, "9999999999");
                             preparedStmt.setTimestamp(4, sqlTime);
                             preparedStmt.setInt(5, 56094);
                             preparedStmt.setString(6, "Yet to decide");
                             preparedStmt.setDouble(7, 100.0);
                             preparedStmt.setInt(8, 0);
                             preparedStmt.setInt(9, 2);
                             preparedStmt.setString(10, "abcd@gmail.com");
                             preparedStmt.execute();
                             System.out.println("new Cart added");
                
           }
           catch(SQLException e)
           {
               System.out.println(e);
           }
       }
       else if(!firstCart)
       {
            try
            {     
                String query1 = " insert into cart(cartId,status ,custphone,timestamp,otp,payment_option,total_payment,ShopID,KioskID,email_id)" + " values (?, ?, ?,?,?,?,?,?,?,?)";
                PreparedStatement preparedStmt = con.prepareStatement(query1);
                preparedStmt.setInt(1, cartid);
                preparedStmt.setString(2, "In prog");
                preparedStmt.setString(3, "9999999999");
                preparedStmt.setTimestamp(4, sqlTime);
                preparedStmt.setInt(5, 56094);
                preparedStmt.setString(6, "Yet");
                preparedStmt.setDouble(7, 100.0);
                preparedStmt.setInt(8, 0);
                preparedStmt.setInt(9, 2);
                preparedStmt.setString(10, "abcd@gmail.com");
                preparedStmt.execute();
            }
            catch(SQLException e)
            {
                System.out.println("Cart Table Error"+e);
            }
       }
   }
   
   void updatePaymentOption(String paymentOption)
   {
      String sql = "UPDATE cart " + "SET payment_option = ? WHERE cartid = ? ";
       try 
       {
            PreparedStatement preparedStmt = con.prepareStatement(sql);
            preparedStmt.setString(1, paymentOption);
            preparedStmt.setInt(2, cartid);
            preparedStmt.execute();
       } catch (SQLException e) {
           System.out.println(e);
       }
   }
   void updateEmailId(String emailId)
   {
      String sql = "UPDATE cart " + "SET email_id = ? WHERE cartid = ? ";
       try 
       {
            PreparedStatement preparedStmt = con.prepareStatement(sql);
            preparedStmt.setString(1, emailId);
            preparedStmt.setInt(2, cartid);
            preparedStmt.execute();
       } catch (SQLException e) {
           System.out.println(e);
       }
   }
      void updatePhoneNo(String phoneNo)
   {
      String sql = "UPDATE cart " + "SET custphone = ? WHERE cartid = ? ";
       try 
       {
            PreparedStatement preparedStmt = con.prepareStatement(sql);
            preparedStmt.setString(1, phoneNo);
            preparedStmt.setInt(2, cartid);
            preparedStmt.execute();
       } catch (SQLException e) {
           System.out.println(e);
       }
   }
    void updateKioskNo(int kioskNo)
   {
      String sql = "UPDATE cart " + "SET KioskID = ? WHERE cartid = ? ";
       try 
       {
            PreparedStatement preparedStmt = con.prepareStatement(sql);
            preparedStmt.setInt(1, kioskNo);
            preparedStmt.setInt(2, cartid);
            preparedStmt.execute();
       } catch (SQLException e) {
           System.out.println(e);
       }
   }
    void updateStoreId(int sId)
   {
      String sql = "UPDATE cart " + "SET ShopID = ? WHERE cartid = ? ";
       try 
       {
            PreparedStatement preparedStmt = con.prepareStatement(sql);
            preparedStmt.setInt(1, sId);
            preparedStmt.setInt(2, cartid);
            preparedStmt.execute();
       } catch (SQLException e) {
           System.out.println(e);
       }
   }
   void updateQuantityItemTable()
   {
        try
       {
           rs = stmt.executeQuery("Select ItemId,quantity_p from cart_item where CartId ="+cartid);
            while(rs.next())
           {
                int selectedItem = rs.getInt(1);
                int selectedQuantity = rs.getInt(2); 
                String query1 = "SELECT quantity FROM shop_item WHERE item_no = ? and ShopId = ?";
                PreparedStatement preparedStmt = con.prepareStatement(query1);
                preparedStmt.setInt(1, selectedItem);
                preparedStmt.setInt(2, storeId);
                rs1 = preparedStmt.executeQuery(); 
                while(rs1.next())
                {
                    int setQuantity = rs1.getInt(1);
                    int updatedQuantity = setQuantity - selectedQuantity;
                    System.out.println("Updated quantity : " + updatedQuantity);
                    String sql = "UPDATE shop_item " + "SET quantity = ? WHERE item_no = ? and ShopID = ?";
                    PreparedStatement preparedStmt1 = con.prepareStatement(sql);
                    preparedStmt1.setInt(1, updatedQuantity);
                    preparedStmt1.setInt(2, selectedItem);
                    preparedStmt1.setInt(3, storeId);
                    preparedStmt1.execute();
                }
           }
       }
       catch(SQLException e)
       {
           System.out.println(e);
       }
   }
   void updateCartTotal(int totalPrice){
      String sql = "UPDATE cart " + "SET total_payment = ? WHERE cartid = ? ";
       try {
            PreparedStatement preparedStmt = con.prepareStatement(sql);
            preparedStmt.setInt(1, totalPrice);
            preparedStmt.setInt(2, cartid);
            preparedStmt.execute();
       } catch (SQLException e) {
           System.out.println(e);
       }
   }
    void updateOtp(int otp){
      String sql = "UPDATE cart " + "SET otp = ? WHERE cartid = ? ";
       try {
            PreparedStatement preparedStmt = con.prepareStatement(sql);
            preparedStmt.setInt(1, otp);
            preparedStmt.setInt(2, cartid);
            preparedStmt.execute();
       } catch (SQLException e) {
           System.out.println(e);
       }
   }
    void updateCartStatus(String status){
      String sql = "UPDATE cart " + "SET status = ? WHERE cartid = ? ";
       try {
            PreparedStatement preparedStmt = con.prepareStatement(sql);
            preparedStmt.setString(1, status);
            preparedStmt.setInt(2, cartid);
            preparedStmt.execute();
       } catch (SQLException e) {
           System.out.println(e);
       }
   }
   void deleteCartItem(){
       String sql = "DELETE from cart_item where CartID = ?";
       try {
            PreparedStatement preparedStmt = con.prepareStatement(sql);
            preparedStmt.setInt(1, cartid);
            preparedStmt.execute();
       } catch (SQLException e) {
           System.out.println(e);
       }
   }
}
