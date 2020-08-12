package carrus;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
public class CARRUS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    
        // TODO code application logic here
      
       // Connection conn = SqlSingletonConnection.getConnection();
        
             try{  
   
    Connection con= SqlSingletonConnection.getConnection();
    //here sonoo is database name, root is username and password  
    Statement stmt=con.createStatement();  
    ResultSet rs=stmt.executeQuery("select * from item");  
    while(rs.next())  
    System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3));  
    con.close();  
    }catch(Exception e){ System.out.println(e);}  
    }  
        /*   java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WelcomeScreen().setVisible(true);
            }
        });*/

    }
    


