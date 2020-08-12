package carrus;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
public class Carrus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         SqlFunctions shopIdExtractor = new SqlFunctions();
         ArrayList<Integer> shopId= new ArrayList<>();
         shopId = shopIdExtractor.itemSearch("Coca Cola");
         System.out.println(shopId);

    }
}
    


