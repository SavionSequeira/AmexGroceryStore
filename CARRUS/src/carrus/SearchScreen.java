
package carrus;

import javax.swing.JFrame;

public class SearchScreen extends javax.swing.JFrame {

    public SearchScreen() {
        initComponents();
        this.setLocationRelativeTo(null); //Sets the screen in the center
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Search_Screen_Wallpaper = new javax.swing.JLabel();
        Search_Screen_Logo = new javax.swing.JLabel();
        SearchItem_TextField = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        Search_Screen_NextButton = new javax.swing.JLabel();
        Search_Screen_AdSpace = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(64, 71, 109));

        Search_Screen_Wallpaper.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Search_Screen_Wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrus/res/Search_Screen.png"))); // NOI18N

        Search_Screen_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrus/res/29d4626c-f7fa-4de2-befb-5bf6d0b1ef01_60x60.png"))); // NOI18N

        SearchItem_TextField.setBackground(new java.awt.Color(64, 71, 109));
        SearchItem_TextField.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        SearchItem_TextField.setForeground(new java.awt.Color(153, 153, 153));
        SearchItem_TextField.setText("Search for an item  Ex : RedBuLL");
        SearchItem_TextField.setBorder(null);
        SearchItem_TextField.setOpaque(false);
        SearchItem_TextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                SearchItem_TextFieldFocusGained(evt);
            }
        });

        Search_Screen_NextButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrus/res/NextButoon_60px.png"))); // NOI18N
        Search_Screen_NextButton.setText("jLabel1");
        Search_Screen_NextButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Search_Screen_NextButtonMouseClicked(evt);
            }
        });

        Search_Screen_AdSpace.setBackground(new java.awt.Color(121, 117, 150));
        Search_Screen_AdSpace.setFont(new java.awt.Font("Berlin Sans FB", 0, 30)); // NOI18N
        Search_Screen_AdSpace.setForeground(new java.awt.Color(255, 255, 255));
        Search_Screen_AdSpace.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Search_Screen_AdSpace.setText("Ad Space");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Search_Screen_Wallpaper, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Search_Screen_Logo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SearchItem_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Search_Screen_AdSpace, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(101, 101, 101))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(Search_Screen_NextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Search_Screen_Wallpaper, javax.swing.GroupLayout.PREFERRED_SIZE, 566, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Search_Screen_Logo)
                .addGap(118, 118, 118)
                .addComponent(SearchItem_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(Search_Screen_NextButton)
                .addGap(39, 39, 39)
                .addComponent(Search_Screen_AdSpace, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void SearchItem_TextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SearchItem_TextFieldFocusGained
        SearchItem_TextField.setText(""); //Clears Username Textfield When Comes into focus
    }//GEN-LAST:event_SearchItem_TextFieldFocusGained

    private void Search_Screen_NextButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Search_Screen_NextButtonMouseClicked
        // TODO add your handling code here:
        StoresScreen ss = new StoresScreen();    //Traces to the SignUp Page;
        ss.setVisible(true);   //Sets Visibility after method is called;
        ss.pack();
        ss.setLocationRelativeTo(null);
        ss.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Argument to Collapse Login page
        this.dispose(); //collapses the login page
    }//GEN-LAST:event_Search_Screen_NextButtonMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SearchScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField SearchItem_TextField;
    private javax.swing.JTextField Search_Screen_AdSpace;
    private javax.swing.JLabel Search_Screen_Logo;
    private javax.swing.JLabel Search_Screen_NextButton;
    private javax.swing.JLabel Search_Screen_Wallpaper;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
