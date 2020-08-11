package carrus;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class CARRUS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
      
        Connection conn = SqlSingletonConnection.getConnection();
        
        try{
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM ITEM");
            ResultSet result= stmt.executeQuery();
            
            while(result.next())
            {
                System.out.println(result.getString(1));
                System.out.println(result.getString(2));
 
                
            }
        }
        catch(Exception e)
        {
            
        }
        /*   java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WelcomeScreen().setVisible(true);
            }
        });*/

    }
    
}

