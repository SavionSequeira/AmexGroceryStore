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
public class SqlFunctions {
    Connection con;
    Statement stmt;
    ResultSet rs;
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
}
