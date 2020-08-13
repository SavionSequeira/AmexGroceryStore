/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrus;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class SqlFunctions {
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
}
