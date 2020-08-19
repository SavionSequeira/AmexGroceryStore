package carrus;

import java.awt.Color;
import javax.swing.JFrame;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JPanel;
public class StoresScreen extends javax.swing.JFrame {

    private String item;
    private String storeScreenLabel;
    public StoresScreen(String item) {
        initComponents();
        setLabelsBlank();
        setLabels();
        this.setLocationRelativeTo(null);
        this.item = item;          //Sets the screen in the center
    }

    void setLabels()
    {
        SqlFunctions st = new SqlFunctions();
        HashMap<String,Integer> storeDist;
        storeDist=st.setMapStoreScreen();
        int shopNum=1;
        for(Map.Entry<String,Integer>iter : storeDist.entrySet()){
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
        jPanel2 = new javax.swing.JPanel();
        storesScreenStoreLabel1 = new javax.swing.JLabel();
        storesScreenDistanceLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        storesScreenStoreLabel2 = new javax.swing.JLabel();
        storesScreenDistanceLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        storesScreenStoreLabel3 = new javax.swing.JLabel();
        storesScreenDistanceLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        storesScreenStoreLabel4 = new javax.swing.JLabel();
        storesScreenDistanceLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

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

        jPanel2.setBackground(new java.awt.Color(64, 71, 109));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel2MouseExited(evt);
            }
        });

        storesScreenStoreLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        storesScreenStoreLabel1.setForeground(new java.awt.Color(255, 255, 255));
        storesScreenStoreLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        storesScreenStoreLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                storesScreenStoreLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                storesScreenStoreLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                storesScreenStoreLabel1MouseExited(evt);
            }
        });

        storesScreenDistanceLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        storesScreenDistanceLabel1.setForeground(new java.awt.Color(255, 255, 255));
        storesScreenDistanceLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(storesScreenStoreLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(storesScreenDistanceLabel1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(storesScreenStoreLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
            .addComponent(storesScreenDistanceLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(64, 71, 109));

        storesScreenStoreLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        storesScreenStoreLabel2.setForeground(new java.awt.Color(255, 255, 255));
        storesScreenStoreLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        storesScreenStoreLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                storesScreenStoreLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                storesScreenStoreLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                storesScreenStoreLabel2MouseExited(evt);
            }
        });

        storesScreenDistanceLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        storesScreenDistanceLabel2.setForeground(new java.awt.Color(255, 255, 255));
        storesScreenDistanceLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(storesScreenStoreLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(storesScreenDistanceLabel2)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(storesScreenStoreLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
            .addComponent(storesScreenDistanceLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(64, 71, 109));

        storesScreenStoreLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        storesScreenStoreLabel3.setForeground(new java.awt.Color(255, 255, 255));
        storesScreenStoreLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        storesScreenStoreLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                storesScreenStoreLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                storesScreenStoreLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                storesScreenStoreLabel3MouseExited(evt);
            }
        });

        storesScreenDistanceLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        storesScreenDistanceLabel3.setForeground(new java.awt.Color(255, 255, 255));
        storesScreenDistanceLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(storesScreenStoreLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(storesScreenDistanceLabel3)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(storesScreenStoreLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
            .addComponent(storesScreenDistanceLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(64, 71, 109));

        storesScreenStoreLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        storesScreenStoreLabel4.setForeground(new java.awt.Color(255, 255, 255));
        storesScreenStoreLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        storesScreenStoreLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                storesScreenStoreLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                storesScreenStoreLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                storesScreenStoreLabel4MouseExited(evt);
            }
        });

        storesScreenDistanceLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        storesScreenDistanceLabel4.setForeground(new java.awt.Color(255, 255, 255));
        storesScreenDistanceLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(storesScreenStoreLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(storesScreenDistanceLabel4)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(storesScreenStoreLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
            .addComponent(storesScreenDistanceLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrus/res/back_to_60px.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(Stores_Screen_Label1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 311, Short.MAX_VALUE)
                                .addComponent(Stores_Screen_Logo))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Stores_Screen_Label2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(89, 170, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(274, 274, 274))))
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
                .addGap(43, 43, 43)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
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
    public void setColour(JPanel p)
    {
        p.setBackground(new Color(26,27,65)); 
    }  
    public void resetColour(JPanel p1)
    {
        p1.setBackground(new Color(64,71,109)); 
    }
    private void storesScreenStoreLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_storesScreenStoreLabel1MouseClicked
        // TODO add your handling code here:
       getStoresScreenStoreLabel(storesScreenStoreLabel1.getText());
        int storeId;
        int price;
        HashMap<String,Integer> itemList;
        HashMap<Integer,Integer> idQuant;
        SqlFunctions itemExtractor = new SqlFunctions();
        price = itemExtractor.getPrice();
        storeId = itemExtractor.getStoreId(storeScreenLabel);
        System.out.println("Print Store id for store screen "+ storeId);
        itemList = itemExtractor.itemDisplay(storeId);
        idQuant = itemExtractor.idQuants(storeId);
        itemExtractor.updateStoreId(storeId);
        ItemScreen is = new ItemScreen(item,price,storeScreenLabel,itemList,idQuant);    
        is.setVisible(true);  
        is.pack();
        is.setLocationRelativeTo(null);
        is.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        this.dispose(); 
        
    }//GEN-LAST:event_storesScreenStoreLabel1MouseClicked

    private void storesScreenStoreLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_storesScreenStoreLabel2MouseClicked
        // TODO add your handling code here:
        getStoresScreenStoreLabel(storesScreenStoreLabel2.getText());
        int storeId;
        int price;
        HashMap<String,Integer> itemList;
        HashMap<Integer,Integer> idQuant;
        SqlFunctions itemExtractor = new SqlFunctions();
        price = itemExtractor.getPrice();
        storeId = itemExtractor.getStoreId(storeScreenLabel);
        itemList = itemExtractor.itemDisplay(storeId);
        idQuant = itemExtractor.idQuants(storeId);
        itemExtractor.updateStoreId(storeId);
        System.out.println("Print Store id for store screen "+ storeId);
        ItemScreen is = new ItemScreen(item,price,storeScreenLabel,itemList,idQuant);    
        is.setVisible(true);  
        is.pack();
        is.setLocationRelativeTo(null);
        is.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        this.dispose(); 
    }//GEN-LAST:event_storesScreenStoreLabel2MouseClicked

    private void storesScreenStoreLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_storesScreenStoreLabel3MouseClicked
        // TODO add your handling code here:
     getStoresScreenStoreLabel(storesScreenStoreLabel3.getText());
        int storeId;
        int price;
        HashMap<String,Integer> itemList;
        HashMap<Integer,Integer> idQuant;
        SqlFunctions itemExtractor = new SqlFunctions();
        price = itemExtractor.getPrice();
        System.out.println("String label check store id "+ storeScreenLabel);
        storeId = itemExtractor.getStoreId(storeScreenLabel);
        System.out.println("Store id check shop label "+ storeId);
        itemList = itemExtractor.itemDisplay(storeId);
        idQuant = itemExtractor.idQuants(storeId);
        itemExtractor.updateStoreId(storeId);
        System.out.println("Print Store id for store screen "+ storeId);
        System.out.println(idQuant);
        ItemScreen is = new ItemScreen(item,price,storeScreenLabel,itemList,idQuant);    
        is.setVisible(true);   
        is.pack();
        is.setLocationRelativeTo(null);
        is.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        this.dispose();
    }//GEN-LAST:event_storesScreenStoreLabel3MouseClicked

    private void storesScreenStoreLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_storesScreenStoreLabel4MouseClicked
        // TODO add your handling code here:
        getStoresScreenStoreLabel(storesScreenStoreLabel4.getText());
        int storeId;
        int price;
        HashMap<String,Integer> itemList;
        HashMap<Integer,Integer> idQuant;
        SqlFunctions itemExtractor = new SqlFunctions();
        price = itemExtractor.getPrice();
        System.out.println("String label check store id "+ storeScreenLabel);
        storeId = itemExtractor.getStoreId(storeScreenLabel);
        System.out.println("Store id check shop label "+ storeId);
        itemList = itemExtractor.itemDisplay(storeId);
        idQuant = itemExtractor.idQuants(storeId);
        itemExtractor.updateStoreId(storeId);
        System.out.println("Print Store id for store screen "+ storeId);
        System.out.println(idQuant);
        ItemScreen is = new ItemScreen(item,price,storeScreenLabel,itemList,idQuant);   
        is.setVisible(true);   
        is.pack();
        is.setLocationRelativeTo(null);
        is.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        this.dispose(); 
    }//GEN-LAST:event_storesScreenStoreLabel4MouseClicked

    private void jPanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseEntered
        // TODO add your handling code here:
        setColour(jPanel2);
        storesScreenStoreLabel1.setBackground(new Color(26,27,65));
        
    }//GEN-LAST:event_jPanel2MouseEntered

    private void jPanel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseExited
        // TODO add your handling code here:
        resetColour(jPanel2);
        storesScreenStoreLabel1.setBackground(new Color(64,71,109));
    }//GEN-LAST:event_jPanel2MouseExited

    private void storesScreenStoreLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_storesScreenStoreLabel1MouseEntered
        // TODO add your handling code here:
        setColour(jPanel2);
    }//GEN-LAST:event_storesScreenStoreLabel1MouseEntered

    private void storesScreenStoreLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_storesScreenStoreLabel1MouseExited
        // TODO add your handling code here:
        resetColour(jPanel2);
    }//GEN-LAST:event_storesScreenStoreLabel1MouseExited

    private void storesScreenStoreLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_storesScreenStoreLabel2MouseEntered
        // TODO add your handling code here:
        setColour(jPanel3);
    }//GEN-LAST:event_storesScreenStoreLabel2MouseEntered

    private void storesScreenStoreLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_storesScreenStoreLabel2MouseExited
        // TODO add your handling code here:
        resetColour(jPanel3);
    }//GEN-LAST:event_storesScreenStoreLabel2MouseExited

    private void storesScreenStoreLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_storesScreenStoreLabel3MouseEntered
        // TODO add your handling code here:
        setColour(jPanel4);
    }//GEN-LAST:event_storesScreenStoreLabel3MouseEntered

    private void storesScreenStoreLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_storesScreenStoreLabel3MouseExited
        // TODO add your handling code here:
        resetColour(jPanel4);
    }//GEN-LAST:event_storesScreenStoreLabel3MouseExited

    private void storesScreenStoreLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_storesScreenStoreLabel4MouseEntered
        // TODO add your handling code here:
        setColour(jPanel5);
    }//GEN-LAST:event_storesScreenStoreLabel4MouseEntered

    private void storesScreenStoreLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_storesScreenStoreLabel4MouseExited
        // TODO add your handling code here:
        resetColour(jPanel5);
    }//GEN-LAST:event_storesScreenStoreLabel4MouseExited

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        SearchScreen ss = new SearchScreen(); 
        SqlFunctions func = new SqlFunctions();
        func.storeDist.clear();
        func.sortedStoreDist.clear();
        ss.setVisible(true);   
        ss.pack();
        ss.setLocationRelativeTo(null);
        ss.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        this.dispose(); 
    }//GEN-LAST:event_jLabel2MouseClicked
    private void setLabelsBlank()
    {
        storesScreenStoreLabel1.setText("");
        storesScreenStoreLabel2.setText("");
        storesScreenStoreLabel3.setText("");
        storesScreenStoreLabel4.setText("");
        storesScreenDistanceLabel1.setText("");
        storesScreenDistanceLabel2.setText("");
        storesScreenDistanceLabel3.setText("");
        storesScreenDistanceLabel4.setText("");
    }  
        private void getStoresScreenStoreLabel(String str)
    {
        storeScreenLabel = str;
        System.out.println(storeScreenLabel);
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Stores_Screen_Animation;
    private javax.swing.JLabel Stores_Screen_Label1;
    private javax.swing.JLabel Stores_Screen_Label2;
    private javax.swing.JLabel Stores_Screen_Logo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
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
