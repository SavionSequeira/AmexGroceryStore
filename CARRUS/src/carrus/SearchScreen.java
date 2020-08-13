
package carrus;
import javax.swing.*;  
import java.awt.Color;
import java.sql.Connection;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class SearchScreen extends javax.swing.JFrame {

     ShortestPath s = new ShortestPath();
    Object[][] resultSet;
    String[] colHeads = {"Let me guess......."};
    private Connection con;
    private Statement stmt;
    private ResultSet rs;
    boolean kioskCheck = false;
    static String text;
    public SearchScreen() {
        initComponents();
        this.setLocationRelativeTo(null); //Sets the screen in the center
    }
    public String getString()
    {
        
        text=SearchItem_TextField.getText();
        return text;
        
       // System.out.println(text);   
    }
    public String passString()
    {
        System.out.println("Call function "+ text);
        return text;
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
        searchScreenAdSpace = new javax.swing.JLabel();
        searchScreenCheckBox1 = new javax.swing.JCheckBox();
        searchScreenCheckBox2 = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        searchTable = new javax.swing.JTable();

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
        SearchItem_TextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchItem_TextFieldKeyReleased(evt);
            }
        });

        Search_Screen_NextButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrus/res/NextButoon_60px.png"))); // NOI18N
        Search_Screen_NextButton.setText("jLabel1");
        Search_Screen_NextButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Search_Screen_NextButtonMouseClicked(evt);
            }
        });

        searchScreenAdSpace.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        searchScreenAdSpace.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrus/res/amex.gif"))); // NOI18N

        searchScreenCheckBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchScreenCheckBox1MouseClicked(evt);
            }
        });

        searchScreenCheckBox2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchScreenCheckBox2MouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(64, 71, 109));

        jLabel2.setBackground(new java.awt.Color(64, 71, 109));
        jLabel2.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Kiosk1");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );

        jPanel3.setBackground(new java.awt.Color(64, 71, 109));

        jLabel3.setBackground(new java.awt.Color(64, 71, 109));
        jLabel3.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Kiosk2");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        searchTable.setBackground(new java.awt.Color(64, 71, 109));
        searchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        searchTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchTableMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                searchTableMouseReleased(evt);
            }
        });
        searchTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(searchTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Search_Screen_Wallpaper, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Search_Screen_Logo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 138, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchScreenAdSpace, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(searchScreenCheckBox1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(202, 202, 202)
                                    .addComponent(searchScreenCheckBox2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(158, 158, 158)
                                    .addComponent(Search_Screen_NextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SearchItem_TextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(98, 98, 98))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Search_Screen_Wallpaper, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Search_Screen_Logo)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(searchScreenCheckBox1)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(searchScreenCheckBox2)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(SearchItem_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Search_Screen_NextButton)
                .addGap(18, 18, 18)
                .addComponent(searchScreenAdSpace, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setColour(JPanel p)
{
    p.setBackground(new Color(0,144,158)); 
}
    public void resetColour(JPanel p1)
{
    p1.setBackground(new Color(64,71,109)); 
}
    
    
    
    private void SearchItem_TextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SearchItem_TextFieldFocusGained
        SearchItem_TextField.setText(""); //Clears Username Textfield When Comes into focus
    }//GEN-LAST:event_SearchItem_TextFieldFocusGained

    private void Search_Screen_NextButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Search_Screen_NextButtonMouseClicked
        // TODO add your handling code here:
        String text = getString();
        s.setString(text);
        s.runFunctions();
        if(kioskCheck && !"".equals(text))
        {
        StoresScreen ss = new StoresScreen(text);    //Traces to the SignUp Page;
        ss.setVisible(true);   //Sets Visibility after method is called;
        ss.pack();
        ss.setLocationRelativeTo(null);
        ss.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Argument to Collapse Login page
        this.dispose(); //collapses the login page
        }
        if(!kioskCheck)
        {
            System.out.println("Please select a kiosk");
        }
        if("".equals(text))
        {
            System.out.println("Please enter an item");
        }
    }//GEN-LAST:event_Search_Screen_NextButtonMouseClicked

    private void searchScreenCheckBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchScreenCheckBox1MouseClicked
        // TODO add your handling code here:
        searchScreenCheckBox1.setSelected(true);
        searchScreenCheckBox2.setSelected(false);
        setColour(jPanel2);
        resetColour(jPanel3);
        kioskCheck=true;
        int value = 2;
        s.setIndex(value);
        
    }//GEN-LAST:event_searchScreenCheckBox1MouseClicked

    private void searchScreenCheckBox2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchScreenCheckBox2MouseClicked
        // TODO add your handling code here:
        searchScreenCheckBox2.setSelected(true);
        searchScreenCheckBox1.setSelected(false);
        setColour(jPanel3);
        resetColour(jPanel2);
        kioskCheck= true;
        int value = 4;
         s.setIndex(value);
    }//GEN-LAST:event_searchScreenCheckBox2MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        //resetColour(jPanel1);
        //esetColour(jPanel2);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MousePressed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        //resetColour(jPanel1);
        //esetColour(jPanel2);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MousePressed

    private void searchTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTableKeyReleased
        // TODO add your handling code here:
        /* try {
            String searchKey = SearchItem_TextField.getText();
            con= SqlSingletonConnection.getConnection();
          //  java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/amex","root", "root@0412");
            stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            String sql = "Select item_name from item where item_name like '"+ searchKey +"%'";
            rs=stmt.executeQuery(sql);
           // DefaultListModel listModel = new DefaultListModel();
                            rs.last();
		            int r =rs.getRow();
		          
		            resultSet = new Object[r][1];
		            rs.beforeFirst();
		            int row = 0;
		            while (rs.next())
                            {
		            	String temp = rs.getString("item_name");
                               // rs.updateString( "item_name", pwd );                        
		               resultSet[row][0] = temp;		                    
         	                  row++;
		            }
		            
		            searchTable = new JTable(resultSet,colHeads);
		    	   searchTable.setEnabled(false);
		    	jScrollPane1.setViewportView(searchTable);
            
		
            
            System.out.println("***");
            
            
   
            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(SearchScreen.class.getName()).log(Level.SEVERE, null, ex);
        }

        // TODO add your handling code here:
        
        */
    }//GEN-LAST:event_searchTableKeyReleased

    private void SearchItem_TextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchItem_TextFieldKeyReleased
        // TODO add your handling code here:
          try {
            String searchKey = SearchItem_TextField.getText();
            con= SqlSingletonConnection.getConnection();
          //  java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/amex","root", "root@0412");
            stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            String sql = "Select item_name from item where item_name like '"+ searchKey +"%'";
            rs=stmt.executeQuery(sql);
           // DefaultListModel listModel = new DefaultListModel();
                            rs.last();
		            int r =rs.getRow();
		          
		            resultSet = new Object[r][1];
		            rs.beforeFirst();
		            int row = 0;
		            while (rs.next())
                            {
		            	String temp = rs.getString("item_name");
                               // rs.updateString( "item_name", pwd );                        
		               resultSet[row][0] = temp;		                    
         	                  row++;
		            }
		            
		            searchTable = new JTable(resultSet,colHeads);
		    	   searchTable.setEnabled(false);
                           searchTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
		    	jScrollPane1.setViewportView(searchTable);
                        
		
            
           
            
   
            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(SearchScreen.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_SearchItem_TextFieldKeyReleased

    private void searchTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchTableMouseClicked
        // TODO add your handling code here:
       
       
        int column = 1;
        int row = searchTable.getSelectedRow();
        System.out.println(row);
        
        String tableSelection = searchTable.getModel().getValueAt(row, column).toString();
        System.out.println(tableSelection);
        SearchItem_TextField.setText(tableSelection);
       
    }//GEN-LAST:event_searchTableMouseClicked

    private void searchTableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchTableMouseReleased
        // TODO add your handling code here:
        
       /*  int column = 1;
        int row = searchTable.getSelectedRow();
        System.out.println(row);
        
        String tableSelection = searchTable.getModel().getValueAt(row, column).toString();
        System.out.println(tableSelection);
        SearchItem_TextField.setText(tableSelection);*/
    }//GEN-LAST:event_searchTableMouseReleased

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
    private javax.swing.JLabel Search_Screen_Logo;
    private javax.swing.JLabel Search_Screen_NextButton;
    private javax.swing.JLabel Search_Screen_Wallpaper;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel searchScreenAdSpace;
    private javax.swing.JCheckBox searchScreenCheckBox1;
    private javax.swing.JCheckBox searchScreenCheckBox2;
    private javax.swing.JTable searchTable;
    // End of variables declaration//GEN-END:variables
}
