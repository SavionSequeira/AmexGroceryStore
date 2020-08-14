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
    private static String password ="1234";
    public static Connection getConnection() {
        try
        {
            
            Class.forName("com.mysql.jdbc.Driver");
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



      /*   try{  
    Class.forName("com.mysql.jdbc.Driver");  
    Connection con=DriverManager.getConnection(  
    "jdbc:mysql://localhost:3306/amex","root","root@0412");  
    //here sonoo is database name, root is username and password  
    Statement stmt=con.createStatement();  
    ResultSet rs=stmt.executeQuery("select * from item");  
    while(rs.next())  
    System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3));  
    con.close();  
    }catch(Exception e){ System.out.println(e);}  
    }  */
        
