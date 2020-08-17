package carrus;
import javax.swing.JFrame;
public class WelcomeScreen extends javax.swing.JFrame {
    public WelcomeScreen() {
        initComponents();
         this.setLocationRelativeTo(null); 
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Welcome_Screen_Wallpaper = new javax.swing.JLabel();
        Welcome_Screen_Logo = new javax.swing.JLabel();
        Welcome_Screen_StartButton = new javax.swing.JLabel();
        Welcome_Screen_Text = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(64, 71, 109));

        Welcome_Screen_Wallpaper.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Welcome_Screen_Wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrus/res/Welcome_Screen.png"))); // NOI18N
        Welcome_Screen_Wallpaper.setText("Welcome_Screen_Wallpaper");

        Welcome_Screen_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrus/res/29d4626c-f7fa-4de2-befb-5bf6d0b1ef01_200x200.png"))); // NOI18N
        Welcome_Screen_Logo.setText("jLabel2");

        Welcome_Screen_StartButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrus/res/Start_90px.png"))); // NOI18N
        Welcome_Screen_StartButton.setText("jLabel1");
        Welcome_Screen_StartButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Welcome_Screen_StartButtonMouseClicked(evt);
            }
        });

        Welcome_Screen_Text.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        Welcome_Screen_Text.setForeground(new java.awt.Color(255, 255, 255));
        Welcome_Screen_Text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Welcome_Screen_Text.setText("Let's Begin The Journey");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Welcome_Screen_Wallpaper, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Welcome_Screen_StartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(245, 245, 245))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Welcome_Screen_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Welcome_Screen_Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 156, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Welcome_Screen_Wallpaper, javax.swing.GroupLayout.PREFERRED_SIZE, 560, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(Welcome_Screen_Logo)
                .addGap(18, 18, 18)
                .addComponent(Welcome_Screen_StartButton)
                .addGap(37, 37, 37)
                .addComponent(Welcome_Screen_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void Welcome_Screen_StartButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Welcome_Screen_StartButtonMouseClicked
        // TODO add your handling code here:
        SearchScreen ss = new SearchScreen();    
        ss.setVisible(true);   
        ss.pack();
        ss.setLocationRelativeTo(null);
        ss.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        this.dispose(); 
    }//GEN-LAST:event_Welcome_Screen_StartButtonMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Welcome_Screen_Logo;
    private javax.swing.JLabel Welcome_Screen_StartButton;
    private javax.swing.JLabel Welcome_Screen_Text;
    private javax.swing.JLabel Welcome_Screen_Wallpaper;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
