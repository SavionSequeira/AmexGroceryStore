package carrus;

import static carrus.ItemScreen.totalPrice;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PayScreen extends javax.swing.JFrame {
    String bill;
    int totalPrice;
    static String paymentOption ="Debit/Credit Card";
    public PayScreen(int totalPrice,String bill) {
        this.bill = bill;
        this.totalPrice = totalPrice;
        initComponents();
        payScreenTotalLabel.setText("Total : "+totalPrice+"₹");
        jp2.setVisible(true);
        jp1.setVisible(false);
        jp3.setVisible(false);
        setColour(debitCardTab);
        jLabel4.setForeground(Color.white);
    }
    void emailSender(String Recepient){
        new SendHTMLEmail(Recepient,bill,totalPrice);
    }
    void separatorResetter(){
        jSeparator4.setBackground(Color.white);
        jSeparator5.setBackground(Color.white);
        jSeparator6.setBackground(Color.white);
        jSeparator7.setBackground(Color.white);
        jSeparator4.setForeground(Color.white);
        jSeparator5.setForeground(Color.white);
        jSeparator6.setForeground(Color.white);
        jSeparator7.setForeground(Color.white);
        jSeparator8.setBackground(Color.white);
        jSeparator8.setForeground(Color.white);
        jSeparator9.setBackground(Color.white);
        jSeparator9.setForeground(Color.white);
        jSeparator1.setBackground(Color.white);
        jSeparator1.setForeground(Color.white);
        jSeparator2.setBackground(Color.white);
        jSeparator2.setForeground(Color.white);
        jSeparator3.setBackground(Color.white);
        jSeparator3.setForeground(Color.white);
        jSeparator10.setBackground(Color.white);
        jSeparator10.setForeground(Color.white);
        jSeparator11.setBackground(Color.white);
        jSeparator11.setForeground(Color.white);
        jSeparator12.setBackground(Color.white);
        jSeparator12.setForeground(Color.white); 
        jSeparator13.setBackground(Color.white);
        jSeparator13.setForeground(Color.white);
        jSeparator14.setBackground(Color.white);
        jSeparator14.setForeground(Color.white);
    }
    boolean detailChecker(){
        int flag = 0;
        if(emailIdLabelPaymentScreen.getText().equals("Email ID") || emailIdLabelPaymentScreen.getText().equals("")){
            jSeparator13.setBackground(Color.red);
            jSeparator13.setForeground(Color.red);
            flag = 1;
        }
        if(phoneNoLabelPaymentScreen.getText().equals("Phone No :") || phoneNoLabelPaymentScreen.getText().equals("")){
            jSeparator14.setBackground(Color.red);
            jSeparator14.setForeground(Color.red);
            flag=1;
        }
        switch (paymentOption) {
            case "Debit/Credit Card":
                System.out.println(paymentOption);
                if((debitPanelCardNumberTextField5.getText().equals("")||debitPanelCardNumberTextField6.getText().equals("")
                        ||debitPanelCardNumberTextField7.getText().equals("")||debitPanelCardNumberTextField8.getText().equals(""))
                        ||(debitPanelCardNumberTextField5.getText().equals("XXXX")||debitPanelCardNumberTextField6.getText().equals("XXXX")
                        ||debitPanelCardNumberTextField7.getText().equals("XXXX")||debitPanelCardNumberTextField8.getText().equals("XXXX"))){
                    jSeparator4.setBackground(Color.red);
                    jSeparator5.setBackground(Color.red);
                    jSeparator6.setBackground(Color.red);
                    jSeparator7.setBackground(Color.red);
                    jSeparator4.setForeground(Color.red);
                    jSeparator5.setForeground(Color.red);
                    jSeparator6.setForeground(Color.red);
                    jSeparator7.setForeground(Color.red);
                    flag = 1;
                }   if(debitPanelExpiryTextField1.getText().equals("")||debitPanelExpiryTextField1.getText().equals("MM/YY")){
                    jSeparator8.setBackground(Color.red);
                    jSeparator8.setForeground(Color.red);
                    flag = 1;
                }   if(debitPanelCVVTextField1.getPassword().equals("")||debitPanelCVVTextField1.getPassword().equals("***")){
                    jSeparator9.setBackground(Color.red);
                    jSeparator9.setForeground(Color.red);
                    flag = 1;
                }
               break;
            case "Google Pay":
                System.out.println(paymentOption);
                if(debitPanelCardNumberTextField1.getText().equals("Enter UPI ID")||
                        debitPanelCardNumberTextField1.getText().equals("")){
                    jSeparator1.setBackground(Color.red);
                    jSeparator1.setForeground(Color.red);
                    flag = 1;
                }   if(debitPanelCardNumberTextField2.getText().equals("Enter Amount")||
                        debitPanelCardNumberTextField2.getText().equals("")){
                    jSeparator2.setBackground(Color.red);
                    jSeparator2.setForeground(Color.red);
                    flag = 1;
                }   if(debitPanelCardNumberTextField3.getText().equals("***")||
                        debitPanelCardNumberTextField3.getText().equals("")){
                    jSeparator3.setBackground(Color.red);
                    jSeparator3.setForeground(Color.red);
                    flag = 1;
                }
                 break;
            case "Paytm":
                System.out.println(paymentOption);
                if(debitPanelCardNumberTextField9.getText().equals("Mobile Number")||
                        debitPanelCardNumberTextField9.getText().equals("")){
                    jSeparator10.setBackground(Color.red);
                    jSeparator10.setForeground(Color.red);
                    flag = 1;
                }   if(debitPanelCardNumberTextField10.getText().equals("Amount")||
                        debitPanelCardNumberTextField10.getText().equals("")){
                    jSeparator11.setBackground(Color.red);
                    jSeparator11.setForeground(Color.red);
                    flag = 1;
                }   if(debitPanelCardNumberTextField11.getText().equals("Comments")||
                        debitPanelCardNumberTextField11.getText().equals("")){
                    jSeparator12.setBackground(Color.red);
                    jSeparator12.setForeground(Color.red);
                    flag = 1;
                }
                break;
            default:
                break;
        }
        if(flag==0){
            return true;
        }
        return false;
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        payScreenPayementLabel = new javax.swing.JLabel();
        debitCardTab = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        googlePayTab = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        paytmTab = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        payScreenVisaLogo = new javax.swing.JLabel();
        payScreenGoogleLogo = new javax.swing.JLabel();
        payScreenPaytmLogo = new javax.swing.JLabel();
        payScreenTotalLabel = new javax.swing.JLabel();
        payScreenVisaLogo1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        phoneNoLabelPaymentScreen = new javax.swing.JTextField();
        emailIdLabelPaymentScreen = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jp1 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        debitPanelCardNumberTextField1 = new javax.swing.JTextField();
        debitPanelCardNumberTextField2 = new javax.swing.JTextField();
        debitPanelCardNumberTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        googlePayPanelGoogleLogo = new javax.swing.JLabel();
        jp2 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        debitPanelMasterCardLogo1 = new javax.swing.JLabel();
        debitPanelVisaCardLogo1 = new javax.swing.JLabel();
        debitPanelRupayCardLogo1 = new javax.swing.JLabel();
        debitPanelCardNumberTextField5 = new javax.swing.JTextField();
        debitPanelCardNumberTextField6 = new javax.swing.JTextField();
        debitPanelCardNumberTextField7 = new javax.swing.JTextField();
        debitPanelCardNumberTextField8 = new javax.swing.JTextField();
        debitPanelExpiryDateLabel1 = new javax.swing.JLabel();
        debitPanelCVVLabel1 = new javax.swing.JLabel();
        debitPanelCVVTextField1 = new javax.swing.JPasswordField();
        debitPanelExpiryTextField1 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jp3 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        debitPanelCardNumberTextField9 = new javax.swing.JTextField();
        debitPanelCardNumberTextField10 = new javax.swing.JTextField();
        debitPanelCardNumberTextField11 = new javax.swing.JTextField();
        paytmPanelPaytmLogo = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(64, 71, 109));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        payScreenPayementLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        payScreenPayementLabel.setForeground(new java.awt.Color(64, 71, 109));
        payScreenPayementLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        payScreenPayementLabel.setText("Payment");

        debitCardTab.setBackground(new java.awt.Color(255, 255, 255));
        debitCardTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                debitCardTabMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(64, 71, 109));
        jLabel4.setText("Debit/Credit");

        javax.swing.GroupLayout debitCardTabLayout = new javax.swing.GroupLayout(debitCardTab);
        debitCardTab.setLayout(debitCardTabLayout);
        debitCardTabLayout.setHorizontalGroup(
            debitCardTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(debitCardTabLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel4)
                .addContainerGap(87, Short.MAX_VALUE))
        );
        debitCardTabLayout.setVerticalGroup(
            debitCardTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(debitCardTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        googlePayTab.setBackground(new java.awt.Color(255, 255, 255));
        googlePayTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                googlePayTabMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(64, 71, 109));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("GooglePay");

        javax.swing.GroupLayout googlePayTabLayout = new javax.swing.GroupLayout(googlePayTab);
        googlePayTab.setLayout(googlePayTabLayout);
        googlePayTabLayout.setHorizontalGroup(
            googlePayTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(googlePayTabLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        googlePayTabLayout.setVerticalGroup(
            googlePayTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(googlePayTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addContainerGap())
        );

        paytmTab.setBackground(new java.awt.Color(255, 255, 255));
        paytmTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paytmTabMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(64, 71, 109));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Paytm");

        javax.swing.GroupLayout paytmTabLayout = new javax.swing.GroupLayout(paytmTab);
        paytmTab.setLayout(paytmTabLayout);
        paytmTabLayout.setHorizontalGroup(
            paytmTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paytmTabLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        paytmTabLayout.setVerticalGroup(
            paytmTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paytmTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        payScreenVisaLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrus/res/american_express_50px.png"))); // NOI18N

        payScreenGoogleLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrus/res/google_50px.png"))); // NOI18N

        payScreenPaytmLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrus/res/paytm1_50px.png"))); // NOI18N

        payScreenTotalLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        payScreenTotalLabel.setForeground(new java.awt.Color(64, 71, 109));
        payScreenTotalLabel.setText("Total");

        payScreenVisaLogo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrus/res/visa1_50px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(payScreenPayementLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(debitCardTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(googlePayTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(paytmTab, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(payScreenVisaLogo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(payScreenVisaLogo1)
                        .addGap(18, 18, 18)
                        .addComponent(payScreenGoogleLogo)
                        .addGap(18, 18, 18)
                        .addComponent(payScreenPaytmLogo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(payScreenTotalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(payScreenPayementLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(debitCardTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(googlePayTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paytmTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(payScreenTotalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(payScreenGoogleLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(payScreenVisaLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(payScreenPaytmLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(payScreenVisaLogo1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(64, 71, 109));

        phoneNoLabelPaymentScreen.setBackground(new java.awt.Color(64, 71, 109));
        phoneNoLabelPaymentScreen.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        phoneNoLabelPaymentScreen.setForeground(new java.awt.Color(255, 255, 255));
        phoneNoLabelPaymentScreen.setText("Phone No :");
        phoneNoLabelPaymentScreen.setBorder(null);
        phoneNoLabelPaymentScreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNoLabelPaymentScreenActionPerformed(evt);
            }
        });

        emailIdLabelPaymentScreen.setBackground(new java.awt.Color(64, 71, 109));
        emailIdLabelPaymentScreen.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        emailIdLabelPaymentScreen.setForeground(new java.awt.Color(255, 255, 255));
        emailIdLabelPaymentScreen.setText("Email ID");
        emailIdLabelPaymentScreen.setBorder(null);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(67, 71, 109));
        jButton1.setText("Pay");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(emailIdLabelPaymentScreen, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                    .addComponent(jSeparator13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(phoneNoLabelPaymentScreen, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                    .addComponent(jSeparator14))
                .addGap(47, 47, 47)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailIdLabelPaymentScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneNoLabelPaymentScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jp1.setLayout(new java.awt.CardLayout());

        jPanel9.setBackground(new java.awt.Color(64, 71, 109));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pay");

        debitPanelCardNumberTextField1.setBackground(new java.awt.Color(64, 71, 109));
        debitPanelCardNumberTextField1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        debitPanelCardNumberTextField1.setForeground(new java.awt.Color(255, 255, 255));
        debitPanelCardNumberTextField1.setText("Enter UPI ID");
        debitPanelCardNumberTextField1.setBorder(null);

        debitPanelCardNumberTextField2.setBackground(new java.awt.Color(64, 71, 109));
        debitPanelCardNumberTextField2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        debitPanelCardNumberTextField2.setForeground(new java.awt.Color(255, 255, 255));
        debitPanelCardNumberTextField2.setText("Enter Amount");
        debitPanelCardNumberTextField2.setBorder(null);

        debitPanelCardNumberTextField3.setBackground(new java.awt.Color(64, 71, 109));
        debitPanelCardNumberTextField3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        debitPanelCardNumberTextField3.setForeground(new java.awt.Color(255, 255, 255));
        debitPanelCardNumberTextField3.setText("***");
        debitPanelCardNumberTextField3.setBorder(null);

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("UPI PIN");

        googlePayPanelGoogleLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrus/res/google1_50px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(296, 296, 296)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(debitPanelCardNumberTextField1)
                            .addComponent(debitPanelCardNumberTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2)
                            .addComponent(jSeparator3)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(debitPanelCardNumberTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(370, 370, 370)
                        .addComponent(googlePayPanelGoogleLogo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)))
                .addContainerGap(295, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(googlePayPanelGoogleLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(debitPanelCardNumberTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(debitPanelCardNumberTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(debitPanelCardNumberTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        jp1.add(jPanel9, "card2");

        jp2.setLayout(new java.awt.CardLayout());

        jPanel10.setBackground(new java.awt.Color(64, 71, 109));

        debitPanelMasterCardLogo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrus/res/mastercard.png"))); // NOI18N

        debitPanelVisaCardLogo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrus/res/credit-card-visa.png"))); // NOI18N

        debitPanelRupayCardLogo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        debitPanelRupayCardLogo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrus/res/rupay (1).png"))); // NOI18N

        debitPanelCardNumberTextField5.setBackground(new java.awt.Color(64, 71, 109));
        debitPanelCardNumberTextField5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        debitPanelCardNumberTextField5.setForeground(new java.awt.Color(255, 255, 255));
        debitPanelCardNumberTextField5.setText("XXXX");
        debitPanelCardNumberTextField5.setBorder(null);

        debitPanelCardNumberTextField6.setBackground(new java.awt.Color(64, 71, 109));
        debitPanelCardNumberTextField6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        debitPanelCardNumberTextField6.setForeground(new java.awt.Color(255, 255, 255));
        debitPanelCardNumberTextField6.setText("XXXX");
        debitPanelCardNumberTextField6.setBorder(null);

        debitPanelCardNumberTextField7.setBackground(new java.awt.Color(64, 71, 109));
        debitPanelCardNumberTextField7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        debitPanelCardNumberTextField7.setForeground(new java.awt.Color(255, 255, 255));
        debitPanelCardNumberTextField7.setText("XXXX");
        debitPanelCardNumberTextField7.setBorder(null);

        debitPanelCardNumberTextField8.setBackground(new java.awt.Color(64, 71, 109));
        debitPanelCardNumberTextField8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        debitPanelCardNumberTextField8.setForeground(new java.awt.Color(255, 255, 255));
        debitPanelCardNumberTextField8.setText("XXXX");
        debitPanelCardNumberTextField8.setBorder(null);

        debitPanelExpiryDateLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        debitPanelExpiryDateLabel1.setForeground(new java.awt.Color(255, 255, 255));
        debitPanelExpiryDateLabel1.setText("EXPIRY DATE");

        debitPanelCVVLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        debitPanelCVVLabel1.setForeground(new java.awt.Color(255, 255, 255));
        debitPanelCVVLabel1.setText("CVV");

        debitPanelCVVTextField1.setBackground(new java.awt.Color(64, 71, 109));
        debitPanelCVVTextField1.setForeground(new java.awt.Color(255, 255, 255));
        debitPanelCVVTextField1.setText("***");
        debitPanelCVVTextField1.setBorder(null);

        debitPanelExpiryTextField1.setBackground(new java.awt.Color(64, 71, 109));
        debitPanelExpiryTextField1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        debitPanelExpiryTextField1.setForeground(new java.awt.Color(255, 255, 255));
        debitPanelExpiryTextField1.setText("MM/YY");
        debitPanelExpiryTextField1.setBorder(null);
        debitPanelExpiryTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                debitPanelExpiryTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jSeparator4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator7))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addComponent(debitPanelMasterCardLogo1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(debitPanelVisaCardLogo1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(debitPanelRupayCardLogo1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addComponent(debitPanelCardNumberTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(debitPanelCardNumberTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(debitPanelCardNumberTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(debitPanelCardNumberTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(227, Short.MAX_VALUE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator8)
                                .addComponent(debitPanelExpiryDateLabel1))
                            .addComponent(debitPanelExpiryTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(224, 224, 224)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(debitPanelCVVLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(debitPanelCVVTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(debitPanelMasterCardLogo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(debitPanelVisaCardLogo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(debitPanelRupayCardLogo1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(debitPanelCardNumberTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(debitPanelCardNumberTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(debitPanelCardNumberTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(debitPanelCardNumberTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator4)
                    .addComponent(jSeparator5)
                    .addComponent(jSeparator6)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(debitPanelExpiryDateLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(debitPanelCVVLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(debitPanelExpiryTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(debitPanelCVVTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(146, Short.MAX_VALUE))
        );

        jp2.add(jPanel10, "card2");

        jp3.setLayout(new java.awt.CardLayout());

        jPanel11.setBackground(new java.awt.Color(64, 71, 109));

        debitPanelCardNumberTextField9.setBackground(new java.awt.Color(64, 71, 109));
        debitPanelCardNumberTextField9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        debitPanelCardNumberTextField9.setForeground(new java.awt.Color(255, 255, 255));
        debitPanelCardNumberTextField9.setText("Mobile Number");
        debitPanelCardNumberTextField9.setBorder(null);

        debitPanelCardNumberTextField10.setBackground(new java.awt.Color(64, 71, 109));
        debitPanelCardNumberTextField10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        debitPanelCardNumberTextField10.setForeground(new java.awt.Color(255, 255, 255));
        debitPanelCardNumberTextField10.setText("Amount");
        debitPanelCardNumberTextField10.setBorder(null);

        debitPanelCardNumberTextField11.setBackground(new java.awt.Color(64, 71, 109));
        debitPanelCardNumberTextField11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        debitPanelCardNumberTextField11.setForeground(new java.awt.Color(255, 255, 255));
        debitPanelCardNumberTextField11.setText("Comments");
        debitPanelCardNumberTextField11.setBorder(null);

        paytmPanelPaytmLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrus/res/paytm_90px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator10)
                    .addComponent(paytmPanelPaytmLogo)
                    .addComponent(debitPanelCardNumberTextField9, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                    .addComponent(debitPanelCardNumberTextField10)
                    .addComponent(debitPanelCardNumberTextField11)
                    .addComponent(jSeparator11)
                    .addComponent(jSeparator12))
                .addContainerGap(292, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(paytmPanelPaytmLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(debitPanelCardNumberTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(debitPanelCardNumberTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(debitPanelCardNumberTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(124, Short.MAX_VALUE))
        );

        jp3.add(jPanel11, "card2");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jp3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jp3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jp1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   public void setColour(JPanel p)
{
    p.setBackground(new Color(64,71,109)); 
}  
    public void resetColour(JPanel p1)
{
    p1.setBackground(new Color(255,255,255)); 
} 
    private void debitCardTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_debitCardTabMouseClicked
        // TODO add your handling code here:
        separatorResetter();
        jp2.setVisible(true);
        setColour(debitCardTab);
        jLabel4.setForeground(Color.white);
        resetColour(googlePayTab);
        jLabel5.setForeground(new Color(64,71,109));
        resetColour(paytmTab);
        jLabel6.setForeground(new Color(64,71,109));
        jp1.setVisible(false);
        jp3.setVisible(false);
        paymentOption= "Debit/Credit Card";
    }//GEN-LAST:event_debitCardTabMouseClicked

    private void googlePayTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_googlePayTabMouseClicked
        // TODO add your handling code here:
        separatorResetter();
        jp1.setVisible(true);
       
        setColour(googlePayTab);
        jLabel5.setForeground(Color.white);
        resetColour(debitCardTab);
        jLabel4.setForeground(new Color(64,71,109));
        resetColour(paytmTab);
        jLabel6.setForeground(new Color(64,71,109));
        jp2.setVisible(false);
        jp3.setVisible(false);
        paymentOption= "Google Pay";
    }//GEN-LAST:event_googlePayTabMouseClicked

    private void paytmTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paytmTabMouseClicked
        // TODO add your handling code here:
        separatorResetter();
        jp3.setVisible(true);
        setColour(paytmTab);
        jLabel6.setForeground(Color.white);
        resetColour(debitCardTab);
        jLabel4.setForeground(new Color(64,71,109));
        resetColour(googlePayTab);
        jLabel5.setForeground(new Color(64,71,109));
        jp1.setVisible(false);
        jp2.setVisible(false);
        paymentOption= "Paytm";
    }//GEN-LAST:event_paytmTabMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        String emailId = emailIdLabelPaymentScreen.getText();
        String phoneNo = phoneNoLabelPaymentScreen.getText();
        SqlFunctions ss = new SqlFunctions();
        separatorResetter();
        if(detailChecker()==true){
            ss.updateQuantityItemTable();
            ss.updatePaymentOption(paymentOption);
            ss.updateEmailId(emailId);
            ss.updatePhoneNo(phoneNo);
            ss.updateCartTotal(totalPrice);
            ss.updateCartStatus("Paid");
            emailSender(emailId);
            FinalScreen fs = new FinalScreen();    
            fs.setVisible(true); 
            fs.pack();
            fs.setLocationRelativeTo(null);
            fs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
            
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void phoneNoLabelPaymentScreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNoLabelPaymentScreenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNoLabelPaymentScreenActionPerformed

    private void debitPanelExpiryTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_debitPanelExpiryTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_debitPanelExpiryTextField1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel debitCardTab;
    private javax.swing.JLabel debitPanelCVVLabel1;
    private javax.swing.JPasswordField debitPanelCVVTextField1;
    private javax.swing.JTextField debitPanelCardNumberTextField1;
    private javax.swing.JTextField debitPanelCardNumberTextField10;
    private javax.swing.JTextField debitPanelCardNumberTextField11;
    private javax.swing.JTextField debitPanelCardNumberTextField2;
    private javax.swing.JTextField debitPanelCardNumberTextField3;
    private javax.swing.JTextField debitPanelCardNumberTextField5;
    private javax.swing.JTextField debitPanelCardNumberTextField6;
    private javax.swing.JTextField debitPanelCardNumberTextField7;
    private javax.swing.JTextField debitPanelCardNumberTextField8;
    private javax.swing.JTextField debitPanelCardNumberTextField9;
    private javax.swing.JLabel debitPanelExpiryDateLabel1;
    private javax.swing.JTextField debitPanelExpiryTextField1;
    private javax.swing.JLabel debitPanelMasterCardLogo1;
    private javax.swing.JLabel debitPanelRupayCardLogo1;
    private javax.swing.JLabel debitPanelVisaCardLogo1;
    private javax.swing.JTextField emailIdLabelPaymentScreen;
    private javax.swing.JLabel googlePayPanelGoogleLogo;
    private javax.swing.JPanel googlePayTab;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JPanel jp1;
    private javax.swing.JPanel jp2;
    private javax.swing.JPanel jp3;
    private javax.swing.JLabel payScreenGoogleLogo;
    private javax.swing.JLabel payScreenPayementLabel;
    private javax.swing.JLabel payScreenPaytmLogo;
    private javax.swing.JLabel payScreenTotalLabel;
    private javax.swing.JLabel payScreenVisaLogo;
    private javax.swing.JLabel payScreenVisaLogo1;
    private javax.swing.JLabel paytmPanelPaytmLogo;
    private javax.swing.JPanel paytmTab;
    private javax.swing.JTextField phoneNoLabelPaymentScreen;
    // End of variables declaration//GEN-END:variables
}
