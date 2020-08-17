package carrus;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
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
        catch(ClassNotFoundException | SQLException err)
        {
            System.out.println("Error occured :" + err);
        }   
        return conn;
    }    
}

