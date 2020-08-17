package carrus;
import javax.swing.*;  
import java.awt.Color;
import java.sql.Connection;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
public final class SearchScreen extends javax.swing.JFrame {

    ShortestPath s = new ShortestPath();
    Object[][] resultSet;
    String[] colHeads = {""};
    public ArrayList<Integer> shopId= new ArrayList<>();
    ListSelectionModel listSelectionModel;
    private Connection con;
    private Statement stmt;
    private ResultSet rs;
    int value;
    boolean kioskCheck = false;
    static String text;
    public SearchScreen() 
    {
        initComponents();
        setScrollPaneBackground();
        this.setLocationRelativeTo(null);
    }
    public String getString()
    {  
        text=SearchItem_TextField.getText();
        return text;
    }
    public String passString()
    {
        System.out.println("Call function "+ text);
        return text;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        SearchItem_TextField = new javax.swing.JTextField();
        Search_Screen_NextButton = new javax.swing.JLabel();
        searchScreenAdSpace = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        kiosk2Label = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        searchTable = new javax.swing.JTable();
        searchScreenCheckBox2 = new javax.swing.JCheckBox();
        searchScreenCheckBox1 = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        kiosk1Label = new javax.swing.JLabel();
        Search_Screen_Logo = new javax.swing.JLabel();
        warningMessage = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(64, 71, 109));

        jPanel1.setBackground(new java.awt.Color(64, 71, 109));

        SearchItem_TextField.setBackground(new java.awt.Color(64, 71, 109));
        SearchItem_TextField.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        SearchItem_TextField.setForeground(new java.awt.Color(153, 153, 153));
        SearchItem_TextField.setText("Search for Ex: Lays");
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
        searchScreenAdSpace.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrus/res/ezgif.com-resize.gif"))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(64, 71, 109));

        kiosk2Label.setBackground(new java.awt.Color(64, 71, 109));
        kiosk2Label.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        kiosk2Label.setForeground(new java.awt.Color(255, 255, 255));
        kiosk2Label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kiosk2Label.setText("Kiosk2");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kiosk2Label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(kiosk2Label))
        );

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 71, 109)));

        searchTable.setBackground(new java.awt.Color(64, 71, 109));
        searchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

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
        });
        jScrollPane1.setViewportView(searchTable);

        searchScreenCheckBox2.setBackground(new java.awt.Color(0, 51, 102));
        searchScreenCheckBox2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchScreenCheckBox2MouseClicked(evt);
            }
        });

        searchScreenCheckBox1.setBackground(new java.awt.Color(0, 51, 102));
        searchScreenCheckBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchScreenCheckBox1MouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(64, 71, 109));

        kiosk1Label.setBackground(new java.awt.Color(64, 71, 109));
        kiosk1Label.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        kiosk1Label.setForeground(new java.awt.Color(255, 255, 255));
        kiosk1Label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kiosk1Label.setText("Kiosk1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(kiosk1Label)
                .addGap(0, 0, 0))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(kiosk1Label))
        );

        Search_Screen_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrus/res/29d4626c-f7fa-4de2-befb-5bf6d0b1ef01_60x60.png"))); // NOI18N

        warningMessage.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        warningMessage.setForeground(new java.awt.Color(255, 255, 255));
        warningMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(searchScreenAdSpace, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(warningMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(Search_Screen_NextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(SearchItem_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(searchScreenCheckBox1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(searchScreenCheckBox2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(114, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Search_Screen_Logo)
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Search_Screen_Logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchScreenCheckBox2)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchScreenCheckBox1)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(SearchItem_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Search_Screen_NextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(warningMessage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(searchScreenAdSpace, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrus/res/Search_Screen.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1328, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        String searchText = getString();
        System.out.println(searchText);
        SqlFunctions shopIdExtractor = new SqlFunctions();
        shopId = shopIdExtractor.itemSearch(text);
        s.setString(text);
        s.runFunctions();
        System.out.println("Search Screen ShopId check "+ shopId);
        if(!kioskCheck)
        {
            System.out.println("Please select a kiosk");
            kiosk1Label.setForeground(Color.red);
            kiosk2Label.setForeground(Color.red);
        }
        if(kioskCheck)
        {
            kiosk1Label.setForeground(Color.white);
            kiosk2Label.setForeground(Color.white);
        }
        if("Search for Ex: Lays".equals(searchText) || "".equals(searchText))
        {
            warningMessage.setText("Please enter an item");
        }
        else if(shopId.isEmpty())
        {
            warningMessage.setText("Item is not available");
        }
        else
        {
            warningMessage.setText("");
            SqlFunctions ss1 = new SqlFunctions();
            ss1.UpdateCartTable();
            ss1.updateKioskNo(value);
            if((kioskCheck && !"Search for Ex: Lays".equals(searchText) )|| (kioskCheck && !"".equals(searchText)))
            {
                StoresScreen ss = new StoresScreen(text);    
                ss.setVisible(true);  
                ss.pack();
                ss.setLocationRelativeTo(null);
                ss.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
                this.dispose(); 
            }
     
        }
    }//GEN-LAST:event_Search_Screen_NextButtonMouseClicked
    public void getShopIdList(ArrayList<Integer> shop)
    {
        System.out.println("passing shop to function "+shopId);
        shopId=shop;
        System.out.println("passing shop to function "+shopId);
    }
    private void searchScreenCheckBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchScreenCheckBox1MouseClicked
        // TODO add your handling code here:
        searchScreenCheckBox1.setSelected(true);
        searchScreenCheckBox2.setSelected(false);
        setColour(jPanel2);
        resetColour(jPanel3);
        kioskCheck=true;
        value = 2;
        s.setIndex(value);
        
    }//GEN-LAST:event_searchScreenCheckBox1MouseClicked

    private void searchScreenCheckBox2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchScreenCheckBox2MouseClicked
        // TODO add your handling code here:
        searchScreenCheckBox2.setSelected(true);
        searchScreenCheckBox1.setSelected(false);
        setColour(jPanel3);
        resetColour(jPanel2);
        kioskCheck= true;
        value = 4;
        s.setIndex(value);
    }//GEN-LAST:event_searchScreenCheckBox2MouseClicked

    private void SearchItem_TextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchItem_TextFieldKeyReleased
        // TODO add your handling code here:
        String searchKey = SearchItem_TextField.getText();
        if(searchKey.equals(""))
            {
            searchTable.setVisible(false);
            }
        else
        {
          try 
          {
            con= SqlSingletonConnection.getConnection();
            stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            String sql = "Select item_name from item where item_name like '"+ searchKey +"%'";
            rs=stmt.executeQuery(sql);
                            rs.last();
		            int r =rs.getRow();
		            resultSet = new Object[r][1];
		            rs.beforeFirst();
		            int row = 0;
		            while (rs.next())
                            {
                                String temp = rs.getString("item_name");
                                                     
		               resultSet[row][0] = temp;		                    
         	               row++;
		            }
		            
		           
            searchTable = new JTable(resultSet,colHeads);
            listSelectionModel = searchTable.getSelectionModel();
            listSelectionModel.addListSelectionListener(new SharedListSelectionHandler());
            searchTable.setSelectionModel(listSelectionModel);
            searchTable.setBackground(new Color(255, 255, 255));
        
            jScrollPane1.setViewportView(searchTable);
            jScrollPane1.getViewport().setBackground(new Color(64,71,109));
            listSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            // TODO add your handling code here:
        } catch (SQLException ex) 
        {
            Logger.getLogger(SearchScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
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
    void setScrollPaneBackground()
    {
        jScrollPane1.getViewport().setBackground(new Color(64,71,109));
    }
  
    class SharedListSelectionHandler implements ListSelectionListener {

        public void valueChanged(ListSelectionEvent e) {
            ListSelectionModel lsm = (ListSelectionModel)e.getSource();
            int firstIndex = e.getFirstIndex();
            if (!lsm.isSelectionEmpty()) 
            {
                String tableSelection;
                tableSelection = searchTable.getModel().getValueAt(firstIndex,0).toString();
                SearchItem_TextField.setText(tableSelection);
                searchTable.setVisible(false);
            }
        }
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField SearchItem_TextField;
    private javax.swing.JLabel Search_Screen_Logo;
    private javax.swing.JLabel Search_Screen_NextButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel kiosk1Label;
    private javax.swing.JLabel kiosk2Label;
    private javax.swing.JLabel searchScreenAdSpace;
    private javax.swing.JCheckBox searchScreenCheckBox1;
    private javax.swing.JCheckBox searchScreenCheckBox2;
    private javax.swing.JTable searchTable;
    private javax.swing.JLabel warningMessage;
    // End of variables declaration//GEN-END:variables
}
