/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrus;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Font;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author shrey
 */
public class ItemScreen extends javax.swing.JFrame {

    /**
     * Creates new form ItemScreen
     */
    int i = 1;
    HashMap<javax.swing.JLabel,javax.swing.JLabel> itemLabel = new HashMap<>();
    javax.swing.JLabel itemListerName;
    javax.swing.JLabel itemListerPrice;
    public ItemScreen(String firstItem,int firstPrice,HashMap<String,Integer> itemInShop) {
        initComponents();
        
        grid = new GridBagConstraints();
        itemList.setLayout(new GridBagLayout());
        fixedItem = new javax.swing.JLabel();
        fixedPrice = new javax.swing.JLabel();
        fixedItem.setText(firstItem);
        fixedItem.setFont(new Font("Segoe UI Semibold",Font.BOLD,18));
        fixedItem.setForeground(Color.white);
        fixedPrice.setText(firstPrice+"₹");
        fixedPrice.setFont(new Font("Segoe UI Semibold",Font.BOLD,18));
        fixedPrice.setForeground(Color.white);
        grid.insets = new Insets(5,5,5,250);
        grid.gridx=0;
        grid.gridy=0;
        itemList.add(fixedItem,grid);
        grid.gridx=1;
        grid.gridy=0;
        itemList.add(fixedPrice,grid);

        for(Map.Entry<String,Integer>iter : itemInShop.entrySet()){
                if(iter.getKey().equals(firstItem)){
                    continue;
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
                }

        }
        for(Map.Entry<javax.swing.JLabel,javax.swing.JLabel> iter : itemLabel.entrySet()){
            grid.gridx=0;
            grid.gridy=i;
            itemList.add(iter.getKey(),grid);
            grid.gridx=1;
            grid.gridy=i;
            itemList.add(iter.getValue(),grid);
            i++;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        itemList = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(20, 40, 80));
        jPanel3.setForeground(new java.awt.Color(51, 51, 51));

        jPanel4.setBackground(new java.awt.Color(0, 144, 158));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 601, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 605, Short.MAX_VALUE)
        );

        itemList.setBackground(new java.awt.Color(20, 40, 80));
        itemList.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout itemListLayout = new javax.swing.GroupLayout(itemList);
        itemList.setLayout(itemListLayout);
        itemListLayout.setHorizontalGroup(
            itemListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        itemListLayout.setVerticalGroup(
            itemListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 424, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(itemList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(182, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(itemList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
   /* public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(ItemScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ItemScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ItemScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ItemScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>*/

        /* Create and display the form */
      /*  java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ItemScreen().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel itemList;
    private GridBagConstraints grid;
    private javax.swing.JLabel fixedItem;
    private javax.swing.JLabel fixedPrice;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}