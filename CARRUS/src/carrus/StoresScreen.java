package carrus;

import javax.swing.JFrame;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class StoresScreen extends javax.swing.JFrame {

    private String item;
    public StoresScreen(String item) {
        initComponents();
        setLabels();
        this.setLocationRelativeTo(null);
        this.item = item;          //Sets the screen in the center
    }

    void setLabels()
    {
        SqlFunctions st = new SqlFunctions();
       
       HashMap<String,Integer> storeDist = new HashMap<>();
      
       storeDist=st.setMapStoreScreen();
       int shopNum=1;
 
          for(Map.Entry<String,Integer>iter : storeDist.entrySet()){
              
  
            
                //System.out.println("Key : "+mapElement.getKey()+" Value : "+mapElement.getValue());
              switch(shopNum)
              {
                  case 1:
                      storesScreenStoreLabel1.setText(iter.getKey());
                  storesScreenDistanceLabel1.setText(Integer.toString(iter.getValue())+("km"));
                      break;
                  case 2:
                      storesScreenStoreLabel2.setText(iter.getKey());
                     storesScreenDistanceLabel2.setText(Integer.toString(iter.getValue())+("km"));
                      break;
                  case 3:
                     storesScreenStoreLabel3.setText(iter.getKey());
                     storesScreenDistanceLabel3.setText(Integer.toString(iter.getValue())+("km"));
                     break;
                  case 4:
                      storesScreenStoreLabel4.setText(iter.getKey());
                      storesScreenDistanceLabel4.setText(Integer.toString(iter.getValue())+("km"));
                      break;
                  default:
                      System.out.println("Wrong input");
              }
              shopNum++;
            
        
           
        }
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Stores_Screen_Animation = new javax.swing.JLabel();
        Stores_Screen_Logo = new javax.swing.JLabel();
        Stores_Screen_Label2 = new javax.swing.JLabel();
        Stores_Screen_Label1 = new javax.swing.JLabel();
        storesScreenStoreLabel1 = new javax.swing.JLabel();
        storesScreenStoreLabel2 = new javax.swing.JLabel();
        storesScreenStoreLabel3 = new javax.swing.JLabel();
        storesScreenStoreLabel4 = new javax.swing.JLabel();
        storesScreenDistanceLabel1 = new javax.swing.JLabel();
        storesScreenDistanceLabel2 = new javax.swing.JLabel();
        storesScreenDistanceLabel3 = new javax.swing.JLabel();
        storesScreenDistanceLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(64, 71, 109));

        Stores_Screen_Animation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stores_Screen_Animation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrus/res/Walk & Shop.gif"))); // NOI18N

        Stores_Screen_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrus/res/29d4626c-f7fa-4de2-befb-5bf6d0b1ef01_60x60.png"))); // NOI18N

        Stores_Screen_Label2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        Stores_Screen_Label2.setForeground(new java.awt.Color(255, 255, 255));
        Stores_Screen_Label2.setText("For your item");

        Stores_Screen_Label1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 28)); // NOI18N
        Stores_Screen_Label1.setForeground(new java.awt.Color(255, 255, 255));
        Stores_Screen_Label1.setText("Nearest Stores ");

        storesScreenStoreLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        storesScreenStoreLabel1.setForeground(new java.awt.Color(255, 255, 255));
        storesScreenStoreLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        storesScreenStoreLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                storesScreenStoreLabel1MouseClicked(evt);
            }
        });

        storesScreenStoreLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        storesScreenStoreLabel2.setForeground(new java.awt.Color(255, 255, 255));
        storesScreenStoreLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        storesScreenStoreLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        storesScreenStoreLabel3.setForeground(new java.awt.Color(255, 255, 255));
        storesScreenStoreLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        storesScreenStoreLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        storesScreenStoreLabel4.setForeground(new java.awt.Color(255, 255, 255));
        storesScreenStoreLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        storesScreenDistanceLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        storesScreenDistanceLabel1.setForeground(new java.awt.Color(255, 255, 255));
        storesScreenDistanceLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        storesScreenDistanceLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                storesScreenDistanceLabel1MouseClicked(evt);
            }
        });

        storesScreenDistanceLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        storesScreenDistanceLabel2.setForeground(new java.awt.Color(255, 255, 255));
        storesScreenDistanceLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        storesScreenDistanceLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                storesScreenDistanceLabel2MouseClicked(evt);
            }
        });

        storesScreenDistanceLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        storesScreenDistanceLabel3.setForeground(new java.awt.Color(255, 255, 255));
        storesScreenDistanceLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        storesScreenDistanceLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                storesScreenDistanceLabel3MouseClicked(evt);
            }
        });

        storesScreenDistanceLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        storesScreenDistanceLabel4.setForeground(new java.awt.Color(255, 255, 255));
        storesScreenDistanceLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        storesScreenDistanceLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                storesScreenDistanceLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Stores_Screen_Animation, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(Stores_Screen_Label1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 287, Short.MAX_VALUE)
                        .addComponent(Stores_Screen_Logo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Stores_Screen_Label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(storesScreenStoreLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(storesScreenStoreLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(storesScreenStoreLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(storesScreenStoreLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(91, 91, 91)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(storesScreenDistanceLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(storesScreenDistanceLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(storesScreenDistanceLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(storesScreenDistanceLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(89, 89, 89)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stores_Screen_Animation, javax.swing.GroupLayout.PREFERRED_SIZE, 566, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Stores_Screen_Label1)
                    .addComponent(Stores_Screen_Logo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Stores_Screen_Label2)
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(storesScreenStoreLabel1)
                    .addComponent(storesScreenDistanceLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(storesScreenStoreLabel2)
                    .addComponent(storesScreenDistanceLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(storesScreenStoreLabel3)
                    .addComponent(storesScreenDistanceLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(storesScreenStoreLabel4)
                    .addComponent(storesScreenDistanceLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void storesScreenStoreLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_storesScreenStoreLabel1MouseClicked
        // TODO add your handling code here:
        HashMap<String,Integer> itemList = new HashMap<>();
        SqlFunctions itemExtractor = new SqlFunctions();
        itemList = itemExtractor.itemDisplay(3);
        ItemScreen is = new ItemScreen(item,100,itemList);    //Traces to the SignUp Page;
        is.setVisible(true);   //Sets Visibility after method is called;
        is.pack();
        is.setLocationRelativeTo(null);
        is.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Argument to Collapse Login page
        this.dispose(); //collapses the login page
        
    }//GEN-LAST:event_storesScreenStoreLabel1MouseClicked

    private void storesScreenDistanceLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_storesScreenDistanceLabel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_storesScreenDistanceLabel1MouseClicked

    private void storesScreenDistanceLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_storesScreenDistanceLabel2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_storesScreenDistanceLabel2MouseClicked

    private void storesScreenDistanceLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_storesScreenDistanceLabel3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_storesScreenDistanceLabel3MouseClicked

    private void storesScreenDistanceLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_storesScreenDistanceLabel4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_storesScreenDistanceLabel4MouseClicked

    /**
     * @param args the command line arguments
     */
   /*public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
      /*  try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StoresScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StoresScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StoresScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StoresScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       /* java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StoresScreen().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Stores_Screen_Animation;
    private javax.swing.JLabel Stores_Screen_Label1;
    private javax.swing.JLabel Stores_Screen_Label2;
    private javax.swing.JLabel Stores_Screen_Logo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel storesScreenDistanceLabel1;
    private javax.swing.JLabel storesScreenDistanceLabel2;
    private javax.swing.JLabel storesScreenDistanceLabel3;
    private javax.swing.JLabel storesScreenDistanceLabel4;
    private javax.swing.JLabel storesScreenStoreLabel1;
    private javax.swing.JLabel storesScreenStoreLabel2;
    private javax.swing.JLabel storesScreenStoreLabel3;
    private javax.swing.JLabel storesScreenStoreLabel4;
    // End of variables declaration//GEN-END:variables
}
