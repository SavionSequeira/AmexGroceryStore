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
                System.out.println(rs.getString(1)+" "+mapElement.getValue());
            }
            catch(Exception e){
                
            }
        }
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
       System.out.println(itemList);
       return itemList;
   }
}
