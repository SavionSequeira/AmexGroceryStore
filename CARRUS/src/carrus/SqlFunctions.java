/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrus;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
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
    ResultSet itemSearch(String itemToBeSearched){
        try{
            rs = stmt.executeQuery("Select ShopID from shop_item where item_no = (Select item_no from item where item_name='"+itemToBeSearched+"')");
        }
        catch(Exception e){
            
        }
        return rs;
    }
}
