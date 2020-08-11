/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrus;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author guita
 */
public class SqlSingletonConnection {

   
    private SqlSingletonConnection(){
        
    }
    private static Connection conn;
    
    private static String host="jdbc:mysql://localhost:3306/amex";
    //enter your username
    private static String username = "root";
    //enter your password
    private static String password ="root@0412";
    public static Connection getConnection() {
        try
        {
            
            Class.forName("com.mysql.jdbc.driver");
            conn = DriverManager.getConnection( host, username, password );
            System.out.println("Connected");
        }
        catch(Exception err)
        {
            System.out.println("Error occured :" + err);
        }
        
        return conn;
    }
  
    
}
