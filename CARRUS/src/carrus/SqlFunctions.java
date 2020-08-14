/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrus;
import java.security.Timestamp;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SqlFunctions {
    static int cartid=1;
    private Connection con;
    private Statement stmt;
    private ResultSet rs;
    static HashMap<String,Integer> storeDist = new HashMap<>();
    public SqlFunctions(){
    con= SqlSingletonConnection.getConnection();
        try{
            stmt=con.createStatement();
        }
        catch(Exception e){
        }
    }
    ArrayList itemSearch(String itemToBeSearched){
        ArrayList<Integer> shopId = new ArrayList<>();
        try{
            rs = stmt.executeQuery("Select ShopID from shop_item where item_no = (Select item_no from item where item_name='"+itemToBeSearched+"')");
            while(rs.next())  
                shopId.add(rs.getInt(1)); 
        }
        catch(Exception e){
            
        }
                try{
         
         }
         catch(Exception e){
             
         }
        return shopId;
    }
    void shopDisplay(HashMap<Integer,Integer> distShop){
        
        Iterator distIter = distShop.entrySet().iterator();
        while(distIter.hasNext()){
            Map.Entry mapElement = (Map.Entry)distIter.next();
            try{
                //System.out.println("Key : "+mapElement.getKey()+" Value : "+mapElement.getValue());
                rs = stmt.executeQuery("Select ShopName from shop where ShopID="+mapElement.getKey());
                rs.next();
             //   var x = mapElement.getValue();
              //  System.out.println(rs.getString(1)+"\t\t"+mapElement.getValue());
                
                storeDist.put(rs.getString(1), (int)mapElement.getValue());
            }
            catch(Exception e){
                
            }
           
        }
       
       //  System.out.println(storeDist);
    }
   HashMap itemDisplay(int storeNo){
       HashMap<String,Integer> itemList = new HashMap<>();
 
       
       try{
           
           rs = stmt.executeQuery("Select item_name,price from item where item_no in (select item_no from shop_item where ShopID="+storeNo+")");
           while(rs.next()){
               itemList.put(rs.getString(1),rs.getInt(2));
           }     
           
       }
       catch(Exception e){
       }
       
    //   System.out.println(itemList);
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
       catch(Exception e){
       }
       
    //   System.out.println(itemList);
       return idQuant;
   }
   
   int getStoreId(String storeLabel)
   {
       int storeNo=0;
     //  System.out.println("Getstore id check " + storeLabel);
       try{
            rs = stmt.executeQuery("Select ShopID from shop where ShopName ='"+storeLabel+"'");
           
           while(rs.next())
           {
             System.out.println(rs.getInt(1));
             storeNo=rs.getInt(1);
          //   System.out.println("Store no: "+storeNo);
           }
       }
       
        catch(Exception e){
       }
      
       return storeNo;
   }
   int getPrice()
   {
       int price=0;
       SearchScreen ss = new SearchScreen();
       String text = ss.passString();
       System.out.println("Get price test "+text);
       try
       {
           rs = stmt.executeQuery("Select price from item where item_name ='"+text+"'");
            while(rs.next())
           {
       
       System.out.println(rs.getInt(1));
       price= rs.getInt(1);
           }
       }
       catch(Exception e)
       {
           
       }
       
       return price;
   }
   HashMap setMapStoreScreen()
   {
       
       return storeDist;
   }

   Integer itemIdChecker(String itemName){
       Integer itemID=0;
       try{
           rs = stmt.executeQuery("Select item_no from item where item_name='"+itemName+"'");
           rs.next();
           itemID = rs.getInt(1);

       }
       catch(Exception e){
           
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
                  //  rs = stmt.executeQuery("SELECT quantity_p FROM cart_item WHERE ItemId ="+itemNo);
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
                          //   String query = " insert into cart_item(CartId, ItemId, quantity_p)" + " values (?, ?, ?)";
                             String sql = "UPDATE cart_item " + "SET quantity_p = ? WHERE ItemId = ? and CartId = ?";
                             PreparedStatement preparedStmt = con.prepareStatement(sql);
                             preparedStmt.setInt(1, quan);
                             preparedStmt.setInt(2, itemNo);
                             preparedStmt.setInt(3, cartid);
                             preparedStmt.execute();
                            
                       
                   }
       }
       catch(Exception e)
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
                  //  rs = stmt.executeQuery("SELECT quantity_p FROM cart_item WHERE ItemId ="+itemNo);
                  if(rs.next()==false)
                   {
                       System.out.println("Item Deleted");
                   
                  }
                   else
                   {
                       
                   
                            System.out.println("First time update Sub"); 
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
       catch(Exception e)
       {
           System.err.println("Got an exception!");
      System.err.println(e.getMessage());
       }

   }
   
   
   void UpdateCartTable()
   {
       boolean firstCart =true;
       java.util.Date date=new java.util.Date();
        java.sql.Timestamp sqlTime=new java.sql.Timestamp(date.getTime());
       if(firstCart)
       {
           firstCart = false;
           
           try{
               String sql = "Delete from cart";
                PreparedStatement preparedStmt1 = con.prepareStatement(sql);
                preparedStmt1.execute();
                  
             String query1 = " insert into cart(cartId,status ,custphone,timestamp,otp,payment_option,total_payment,ShopID,KioskID)" + " values (?, ?, ?,?,?,?,?,?,?,?)";
                             PreparedStatement preparedStmt = con.prepareStatement(query1);
                             preparedStmt.setInt(1, cartid);
                             preparedStmt.setString(2, "In progress");
                             preparedStmt.setString(3, "9999999999");
                             preparedStmt.setTimestamp(4, sqlTime);
                             preparedStmt.setInt(5, 56094);
                             preparedStmt.setString(6, "Yet to Decide");
                             preparedStmt.setDouble(7, 100.0);
                             preparedStmt.setInt(8, 0);
                             preparedStmt.setInt(9, 2);
                             preparedStmt.execute();
                
           }
           catch(Exception e)
           {
               
           }
     
       }
       else
       {
                try{
           
                  
             String query1 = " insert into cart(cartId,status ,custphone,timestamp,otp,payment_option,total_payment,ShopID,KioskID)" + " values (?, ?, ?,?,?,?,?,?,?,?)";
                             PreparedStatement preparedStmt = con.prepareStatement(query1);
                             preparedStmt.setInt(1, cartid);
                             preparedStmt.setString(2, "In progress");
                             preparedStmt.setString(3, "9999999999");
                             preparedStmt.setTimestamp(4, sqlTime);
                             preparedStmt.setInt(5, 56094);
                             preparedStmt.setString(6, "Yet to Decide");
                             preparedStmt.setDouble(7, 100.0);
                             preparedStmt.setInt(8, 0);
                             preparedStmt.setInt(9, 2);
                             preparedStmt.execute();
                
           }
           catch(Exception e)
           {
               
           }
       }
   }
   
 
}
