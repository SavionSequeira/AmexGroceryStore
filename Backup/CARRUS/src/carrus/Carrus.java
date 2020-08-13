package carrus;

public class Carrus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           java.awt.EventQueue.invokeLater(() -> {
               new WelcomeScreen().setVisible(true);
           });

    }
}
    


