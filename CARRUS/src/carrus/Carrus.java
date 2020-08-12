package carrus;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
public class Carrus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         SqlFunctions shopIdExtractor = new SqlFunctions();
         //itemSearch Test
         String S = "Lays";
         ArrayList<Integer> shopId= new ArrayList<>();
         shopId = shopIdExtractor.itemSearch(S);
         System.out.println(shopId);
         //shopDisplay Test
         HashMap<Integer,Integer> distShop = new HashMap<>();
         distShop.put(1,8);
         shopIdExtractor.shopDisplay(distShop);
         

    }
}
    


