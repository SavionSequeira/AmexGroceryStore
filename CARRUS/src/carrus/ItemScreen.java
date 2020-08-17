package carrus;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Font;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
public class ItemScreen extends javax.swing.JFrame {
    void setStoreLabel(String str)
    {
           itemScreenStoreNameLabel.setText(str);
    }
    int i = 1;
    static int cartIdNumber = 0;
    static int totalPrice=0;
    HashMap<javax.swing.JLabel,javax.swing.JLabel> itemLabel = new HashMap<>();
    HashMap<javax.swing.JLabel,javax.swing.JLabel> itemQuantModifier= new HashMap<>();
    ArrayList<javax.swing.JLabel> itemQuant = new ArrayList<>();
    ArrayList<Integer> itemPrice = new ArrayList<>();
    javax.swing.JLabel itemListerName;
    javax.swing.JLabel itemListerPrice;
    javax.swing.JLabel itemListerQuantModifierPlus;
    javax.swing.JLabel itemListerQuantModifierMinus;
    javax.swing.JLabel itemListerQuant;
    ArrayList<Integer> itemIDOrdered = new ArrayList<>();
    ArrayList<Integer> itemQuantOrdered = new ArrayList<>();
    SqlFunctions sqlFunc;
    String bill;
    public ItemScreen(String firstItem,int firstPrice,String storeName,HashMap<String,Integer> itemInShop,HashMap<Integer,Integer> idQuant) {
        initComponents();
        String firstItemFunc=firstItem;
        int firstPriceFunc = firstPrice;
        String storeNameFunc = storeName;
        HashMap<String,Integer> itemInShopFunc = itemInShop;
        generateLabels(firstItemFunc,firstPriceFunc,storeNameFunc,itemInShopFunc);
        generateIdQuantOrder(firstItem,idQuant,itemLabel);
    }
    void generateIdQuantOrder(String firstItem,HashMap<Integer,Integer> idQuant,HashMap<javax.swing.JLabel,javax.swing.JLabel> itemInShop){
        Integer itemID;
        sqlFunc=new SqlFunctions();
        itemID = sqlFunc.itemIdChecker(firstItem);
        for(Map.Entry<Integer,Integer>iter1 : idQuant.entrySet()){
               if(itemID == iter1.getKey()){
                   itemIDOrdered.add(iter1.getKey());
                   itemQuantOrdered.add(iter1.getValue());
               }
        }
        for(Map.Entry<javax.swing.JLabel,javax.swing.JLabel> iter : itemInShop.entrySet()){
            System.out.println(iter.getKey().getText());
            if(iter.getKey().getText().equalsIgnoreCase(firstItem)){
                continue;
            }
            itemID = sqlFunc.itemIdChecker(iter.getKey().getText());
            for(Map.Entry<Integer,Integer>iter1 : idQuant.entrySet()){
                   if(itemID == iter1.getKey()){
                       itemIDOrdered.add(iter1.getKey());
                       itemQuantOrdered.add(iter1.getValue());
                   }
            }
        }
    }
   void generateBill(){
       int cnt = 1;
       bill=("Item&nbsp;&nbsp;&nbsp;Quantity&nbsp;&nbsp;&nbsp;Price<br>");
       if(Integer.parseInt(itemQuant.get(0).getText())>0){
              bill+= fixedItem.getText()+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+itemQuant.get(0).getText()+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+itemPrice.get(0)*Integer.parseInt(itemQuant.get(0).getText())+"<br>";     
       }
       for(Map.Entry<javax.swing.JLabel,javax.swing.JLabel> iter : itemLabel.entrySet()){
           if(Integer.parseInt(itemQuant.get(cnt).getText())>0){
               bill+= iter.getKey().getText()+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+itemQuant.get(cnt).getText()+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+itemPrice.get(cnt)*Integer.parseInt(itemQuant.get(cnt).getText())+"<br>";   
           }
           cnt++;
       }
   }  
   void generateLabels(String firstItem,int firstPrice,String storeName,HashMap<String,Integer> itemInShop)
   {
           itemScreenStoreNameLabel.setText(storeName);
           grid = new GridBagConstraints();
           itemList.setLayout(new GridBagLayout());
           fixedItem = new javax.swing.JLabel();
           fixedPrice = new javax.swing.JLabel();
           fixedItem.setText(firstItem.toUpperCase());
           fixedItem.setFont(new Font("Segoe UI Semibold",Font.BOLD,18));
           fixedItem.setForeground(Color.white);
           fixedPrice.setText(firstPrice+"₹");
           fixedPrice.setFont(new Font("Segoe UI Semibold",Font.BOLD,18));
           fixedPrice.setForeground(Color.white);
           itemPrice.add(firstPrice);
           grid.insets = new Insets(5,5,5,150);
           grid.gridx=0;
           grid.gridy=0;
           itemList.add(fixedItem,grid);
           grid.gridx=1;
           grid.gridy=0;
           itemList.add(fixedPrice,grid);
           itemListerQuantModifierPlus = new javax.swing.JLabel("+");
           itemListerQuantModifierPlus.setFont(new Font("Segoe UI Semibold",Font.BOLD,18));
           itemListerQuantModifierPlus.setForeground(Color.white);
           itemListerQuantModifierMinus = new javax.swing.JLabel("-");
           itemListerQuantModifierMinus.setFont(new Font("Segoe UI Semibold",Font.BOLD,18));
           itemListerQuantModifierMinus.setForeground(Color.white);
           itemQuantModifier.put(itemListerQuantModifierPlus,itemListerQuantModifierMinus);
           itemListerQuant = new javax.swing.JLabel();
           itemListerQuant.setText("0");
           itemListerQuant.setFont(new Font("Segoe UI Semibold",Font.BOLD,18));
           itemListerQuant.setForeground(Color.white);
           itemQuant.add(itemListerQuant);
           for(Map.Entry<String,Integer>iter : itemInShop.entrySet()){
                   if(iter.getKey().equalsIgnoreCase(firstItem)){

                   }
                   else{
                        itemListerName = new javax.swing.JLabel();
                        itemListerName.setText(iter.getKey());
                        itemListerName.setFont(new Font("Segoe UI Semibold",Font.BOLD,18));
                        itemListerName.setForeground(Color.white);
                        itemListerPrice = new javax.swing.JLabel();
                        itemListerPrice.setText(Integer.toString(iter.getValue())+"₹");
                        itemListerPrice.setFont(new Font("Segoe UI Semibold",Font.BOLD,18));
                        itemListerPrice.setForeground(Color.white);
                        itemLabel.put(itemListerName,itemListerPrice);
                        itemListerQuantModifierPlus = new javax.swing.JLabel("+");
                        itemListerQuantModifierPlus.setFont(new Font("Segoe UI Semibold",Font.BOLD,18));
                        itemListerQuantModifierPlus.setForeground(Color.white);
                        itemListerQuantModifierMinus = new javax.swing.JLabel("-");
                        itemListerQuantModifierMinus.setFont(new Font("Segoe UI Semibold",Font.BOLD,18));
                        itemListerQuantModifierMinus.setForeground(Color.white);
                        itemQuantModifier.put(itemListerQuantModifierPlus,itemListerQuantModifierMinus);
                        itemListerQuant = new javax.swing.JLabel();
                        itemListerQuant.setText("0");
                        itemListerQuant.setFont(new Font("Segoe UI Semibold",Font.BOLD,18));
                        itemListerQuant.setForeground(Color.white);
                        itemQuant.add(itemListerQuant);
                   }

           }
           for(Map.Entry<javax.swing.JLabel,javax.swing.JLabel> iter : itemLabel.entrySet()){
               grid.gridx=0;
               grid.gridy=i;
               itemList.add(iter.getKey(),grid);
               grid.gridx=1;
               grid.gridy=i;
               itemList.add(iter.getValue(),grid);
               itemPrice.add(Integer.parseInt(iter.getValue().getText().replaceAll("[\\D]", "")));
               i++;
           }
           i = 0;
           grid.insets = new Insets(5,5,5,5);
           for(Map.Entry<javax.swing.JLabel,javax.swing.JLabel> iter : itemQuantModifier.entrySet()){
               grid.gridx=2;
               grid.gridy=i;
               itemList.add(iter.getKey(),grid);
               iter.getKey().addMouseListener(new YourMouseListener(iter.getKey(),i));
               grid.gridx=3;
               grid.gridy=i;
               itemList.add(itemQuant.get(i),grid);
               grid.gridx=4;
               grid.gridy=i;
               itemList.add(iter.getValue(),grid);
               iter.getValue().addMouseListener(new YourMouseListener(iter.getValue(),i));
               i++;
           }
          
    }
   class YourMouseListener extends MouseAdapter{
   javax.swing.JLabel actionLabel;
   int quantNum;
   int quantChange;
   YourMouseListener(javax.swing.JLabel actionLabel,int i){
       this.actionLabel = actionLabel;
       quantNum = i;
   }
   @Override
   public void mousePressed(MouseEvent entered){
       if(actionLabel.getText().equals("+")){
          
          if(quantChange<itemQuantOrdered.get(quantNum)){
            quantChange = Integer.parseInt(itemQuant.get(quantNum).getText())+1;
            itemQuant.get(quantNum).setText(Integer.toString(quantChange));
            sqlFunc.updateQuantityAdd(itemIDOrdered.get(quantNum));
            totalPrice = totalPrice+itemPrice.get(quantNum);
            itemScreenTotalLabel.setText("Total : "+totalPrice+"₹");
           }
          else{
              System.out.println("No more available");
          }
       }
       else{
          quantChange = Integer.parseInt(itemQuant.get(quantNum).getText())-1;
          if(quantChange>-1){
            itemQuant.get(quantNum).setText(Integer.toString(quantChange));
            totalPrice = totalPrice-itemPrice.get(quantNum);
            itemScreenTotalLabel.setText("Total : "+totalPrice+"₹");
            sqlFunc.updateQuantitySub(itemIDOrdered.get(quantNum));
          }
          else{
            quantChange=0;
          }
       }
   }
}

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        itemList = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        itemScreenTotalLabel = new javax.swing.JLabel();
        itemScreenPayButton = new javax.swing.JButton();
        itemScreenCarrusLogo = new javax.swing.JLabel();
        itemScreenStoreNameLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(64, 71, 109));
        jPanel3.setForeground(new java.awt.Color(51, 51, 51));

        itemList.setBackground(new java.awt.Color(64, 71, 109));
        itemList.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout itemListLayout = new javax.swing.GroupLayout(itemList);
        itemList.setLayout(itemListLayout);
        itemListLayout.setHorizontalGroup(
            itemListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );
        itemListLayout.setVerticalGroup(
            itemListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 401, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(20, 40, 80));

        itemScreenTotalLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        itemScreenTotalLabel.setForeground(new java.awt.Color(255, 255, 255));
        itemScreenTotalLabel.setText("Total : 0₹");

        itemScreenPayButton.setBackground(new java.awt.Color(34, 167, 240));
        itemScreenPayButton.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        itemScreenPayButton.setForeground(new java.awt.Color(255, 255, 255));
        itemScreenPayButton.setText("Pay");
        itemScreenPayButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemScreenPayButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(itemScreenTotalLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(itemScreenPayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemScreenTotalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemScreenPayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addComponent(itemList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(itemList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, 630, 600));

        itemScreenCarrusLogo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        itemScreenCarrusLogo.setForeground(new java.awt.Color(255, 255, 255));
        itemScreenCarrusLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemScreenCarrusLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrus/res/29d4626c-f7fa-4de2-befb-5bf6d0b1ef01_200x200.png"))); // NOI18N
        itemScreenCarrusLogo.setText("jLabel3");
        getContentPane().add(itemScreenCarrusLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 210, 180));

        itemScreenStoreNameLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        itemScreenStoreNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        itemScreenStoreNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        itemScreenStoreNameLabel.setText("Store Name");
        getContentPane().add(itemScreenStoreNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 190, 70));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Seperator");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 120, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrus/res/Buy (4).png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemScreenPayButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemScreenPayButtonMouseClicked
        // TODO add your handling code here:
        generateBill();
        PayScreen tl = new PayScreen(totalPrice,bill);    
        tl.setVisible(true); 
        tl.pack();
        tl.setLocationRelativeTo(null);
        tl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose(); 
    }//GEN-LAST:event_itemScreenPayButtonMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel itemList;
    private GridBagConstraints grid;
    private javax.swing.JLabel fixedItem;
    private javax.swing.JLabel fixedPrice;
    private javax.swing.JLabel itemScreenCarrusLogo;
    private javax.swing.JButton itemScreenPayButton;
    private javax.swing.JLabel itemScreenStoreNameLabel;
    private javax.swing.JLabel itemScreenTotalLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
