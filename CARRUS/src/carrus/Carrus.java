package carrus;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
public class Carrus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         SqlFunctions shopIdExtractor = new SqlFunctions();
         ResultSet rs = shopIdExtractor.itemSearch("Coca Cola");
         try{
         while(rs.next())  
            System.out.println(rs.getInt(1)); 
         }
         catch(Exception e){
             
         }

    }
}
    


