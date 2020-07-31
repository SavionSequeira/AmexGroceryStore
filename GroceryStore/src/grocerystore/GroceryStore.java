/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grocerystore;
 import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author guita
 */
public class GroceryStore {

    /**
     * @param args the command line arguments
     */ public static Connection con;
	public static Statement stmt;
    public static String query = " select username,password from userdetails";
    	public static void establishsqlconnection()
	{
	try{  
			
			con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/grocerystore","root","root@0412");   
			stmt=con.createStatement();  
		}
		catch(Exception e){
			
                }
  
        
 
    }
        
        public static void disconnectsqlconnection() 
	{
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void get()
	{
		
		String usecheck = null,passcheck = null;
	
		
		try {
			ResultSet rs = stmt.executeQuery("create table test(phone int(10))");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	
		
	}

        
       public static void main(String[] args) {   
           
           establishsqlconnection();
				get();
				//disconnectsqlconnection();
       }
       
}
        
