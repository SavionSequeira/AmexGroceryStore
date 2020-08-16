package carrus;

import java.awt.Color;
import javax.swing.JPanel;


public class PayScreen extends javax.swing.JFrame {

   
    public PayScreen(int totalPrice) {
        initComponents();
        payScreenTotalLabel.setText("Total : "+totalPrice+"₹");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        payScreenPayementLabel = new javax.swing.JLabel();
        debitCardTab = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        googlePayTab = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        paytmTab = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        payScreenTotalLabel = new javax.swing.JLabel();
        payScreenGoogleLogo = new javax.swing.JLabel();
        payScreenVisaLogo = new javax.swing.JLabel();
        payScreenPaytmLogo = new javax.swing.JLabel();
        submiteButtonPaymentScreen = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jp1 = new javax.swing.JPanel();
        debitPanelExpiryDateLabel = new javax.swing.JLabel();
        debitPanelCardNumberTextField1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        debitPanelCardNumberTextField2 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        debitPanelCardNumberTextField3 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        debitPanelCardNumberTextField4 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        debitPanelCardLabel = new javax.swing.JLabel();
        debitPanelCVVLabel = new javax.swing.JLabel();
        debitPanelExpiryTextField = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        debitPanelCVVTextField = new javax.swing.JPasswordField();
        debitPanelMasterCardLogo = new javax.swing.JLabel();
        debitPanelVisaCardLogo = new javax.swing.JLabel();
        debitPanelRupayCardLogo = new javax.swing.JLabel();
        jp2 = new javax.swing.JPanel();
        googlePayPanelUPiTextField = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        googlePayPanelUpiPinTextField = new javax.swing.JPasswordField();
        jSeparator8 = new javax.swing.JSeparator();
        googlePayPanelUpiPinLabel = new javax.swing.JLabel();
        googlePayPanelGoogleLogo = new javax.swing.JLabel();
        googlePayPanelGooglePayLabel = new javax.swing.JLabel();
        googlePayPanelAmountTextField = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        jp3 = new javax.swing.JPanel();
        paytmPanelMobileTextField = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        paytmPanelAmountTextField = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        paytmPanelCommentTextfFeld = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        paytmPanelPaytmLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(64, 71, 109));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        payScreenPayementLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        payScreenPayementLabel.setForeground(new java.awt.Color(64, 71, 109));
        payScreenPayementLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        payScreenPayementLabel.setText("Payment");

        debitCardTab.setBackground(new java.awt.Color(255, 255, 255));
        debitCardTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                debitCardTabMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                debitCardTabMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                debitCardTabMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(64, 71, 109));
        jLabel2.setText("Debit/Credit");

        javax.swing.GroupLayout debitCardTabLayout = new javax.swing.GroupLayout(debitCardTab);
        debitCardTab.setLayout(debitCardTabLayout);
        debitCardTabLayout.setHorizontalGroup(
            debitCardTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(debitCardTabLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        debitCardTabLayout.setVerticalGroup(
            debitCardTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(debitCardTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        googlePayTab.setBackground(new java.awt.Color(255, 255, 255));
        googlePayTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                googlePayTabMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                googlePayTabMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                googlePayTabMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(64, 71, 109));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("GooglePay");

        javax.swing.GroupLayout googlePayTabLayout = new javax.swing.GroupLayout(googlePayTab);
        googlePayTab.setLayout(googlePayTabLayout);
        googlePayTabLayout.setHorizontalGroup(
            googlePayTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(googlePayTabLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        googlePayTabLayout.setVerticalGroup(
            googlePayTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(googlePayTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addContainerGap())
        );

        paytmTab.setBackground(new java.awt.Color(255, 255, 255));
        paytmTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paytmTabMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                paytmTabMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                paytmTabMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(64, 71, 109));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Paytm");

        javax.swing.GroupLayout paytmTabLayout = new javax.swing.GroupLayout(paytmTab);
        paytmTab.setLayout(paytmTabLayout);
        paytmTabLayout.setHorizontalGroup(
            paytmTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paytmTabLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        paytmTabLayout.setVerticalGroup(
            paytmTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paytmTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        payScreenTotalLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        payScreenTotalLabel.setForeground(new java.awt.Color(64, 71, 109));
        payScreenTotalLabel.setText("Total");

        payScreenGoogleLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrus/res/google_50px.png"))); // NOI18N

        payScreenVisaLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrus/res/visa1_50px.png"))); // NOI18N

        payScreenPaytmLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrus/res/paytm1_50px.png"))); // NOI18N

        submiteButtonPaymentScreen.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        submiteButtonPaymentScreen.setForeground(new java.awt.Color(64, 71, 109));
        submiteButtonPaymentScreen.setText("Submit");
        submiteButtonPaymentScreen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submiteButtonPaymentScreenMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(debitCardTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(googlePayTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(paytmTab, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(payScreenPayementLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(payScreenTotalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(submiteButtonPaymentScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(payScreenVisaLogo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(payScreenGoogleLogo)
                                .addGap(30, 30, 30)
                                .addComponent(payScreenPaytmLogo)))
                        .addGap(30, 30, 30))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(payScreenPayementLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(debitCardTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(googlePayTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paytmTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(payScreenTotalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(payScreenGoogleLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(payScreenVisaLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(payScreenPaytmLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(submiteButtonPaymentScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        jPanel3.setBackground(new java.awt.Color(64, 71, 109));
        jPanel3.setForeground(new java.awt.Color(64, 71, 109));

        jp1.setBackground(new java.awt.Color(64, 71, 109));

        debitPanelExpiryDateLabel.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        debitPanelExpiryDateLabel.setForeground(new java.awt.Color(255, 255, 255));
        debitPanelExpiryDateLabel.setText("EXPIRY DATE");

        debitPanelCardNumberTextField1.setBackground(new java.awt.Color(64, 71, 109));
        debitPanelCardNumberTextField1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        debitPanelCardNumberTextField1.setForeground(new java.awt.Color(255, 255, 255));
        debitPanelCardNumberTextField1.setText("XXXX");
        debitPanelCardNumberTextField1.setBorder(null);

        debitPanelCardNumberTextField2.setBackground(new java.awt.Color(64, 71, 109));
        debitPanelCardNumberTextField2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        debitPanelCardNumberTextField2.setForeground(new java.awt.Color(255, 255, 255));
        debitPanelCardNumberTextField2.setText("XXXX");
        debitPanelCardNumberTextField2.setBorder(null);

        debitPanelCardNumberTextField3.setBackground(new java.awt.Color(64, 71, 109));
        debitPanelCardNumberTextField3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        debitPanelCardNumberTextField3.setForeground(new java.awt.Color(255, 255, 255));
        debitPanelCardNumberTextField3.setText("XXXX");
        debitPanelCardNumberTextField3.setBorder(null);

        debitPanelCardNumberTextField4.setBackground(new java.awt.Color(64, 71, 109));
        debitPanelCardNumberTextField4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        debitPanelCardNumberTextField4.setForeground(new java.awt.Color(255, 255, 255));
        debitPanelCardNumberTextField4.setText("XXXX");
        debitPanelCardNumberTextField4.setBorder(null);

        debitPanelCardLabel.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        debitPanelCardLabel.setForeground(new java.awt.Color(255, 255, 255));
        debitPanelCardLabel.setText("CARD NUMBER");

        debitPanelCVVLabel.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        debitPanelCVVLabel.setForeground(new java.awt.Color(255, 255, 255));
        debitPanelCVVLabel.setText("CVV");

        debitPanelExpiryTextField.setBackground(new java.awt.Color(64, 71, 109));
        debitPanelExpiryTextField.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        debitPanelExpiryTextField.setForeground(new java.awt.Color(255, 255, 255));
        debitPanelExpiryTextField.setText("MM/YY");
        debitPanelExpiryTextField.setBorder(null);

        debitPanelCVVTextField.setBackground(new java.awt.Color(64, 71, 109));
        debitPanelCVVTextField.setForeground(new java.awt.Color(255, 255, 255));
        debitPanelCVVTextField.setText("***");
        debitPanelCVVTextField.setBorder(null);

        debitPanelMasterCardLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrus/res/mastercard.png"))); // NOI18N

        debitPanelVisaCardLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrus/res/credit-card-visa.png"))); // NOI18N

        debitPanelRupayCardLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        debitPanelRupayCardLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrus/res/rupay (1).png"))); // NOI18N

        javax.swing.GroupLayout jp1Layout = new javax.swing.GroupLayout(jp1);
        jp1.setLayout(jp1Layout);
        jp1Layout.setHorizontalGroup(
            jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp1Layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp1Layout.createSequentialGroup()
                        .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jp1Layout.createSequentialGroup()
                                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(debitPanelCardNumberTextField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(debitPanelCardNumberTextField2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(debitPanelCardNumberTextField3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(debitPanelExpiryDateLabel)
                            .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(debitPanelExpiryTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                .addComponent(jSeparator5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(debitPanelCVVLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(debitPanelCardNumberTextField4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(debitPanelCVVTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                                .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addContainerGap(371, Short.MAX_VALUE))
                    .addGroup(jp1Layout.createSequentialGroup()
                        .addComponent(debitPanelCardLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(debitPanelMasterCardLogo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(debitPanelVisaCardLogo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(debitPanelRupayCardLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jp1Layout.setVerticalGroup(
            jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp1Layout.createSequentialGroup()
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp1Layout.createSequentialGroup()
                        .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jp1Layout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addComponent(debitPanelCardLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(debitPanelRupayCardLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp1Layout.createSequentialGroup()
                        .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(debitPanelMasterCardLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(debitPanelVisaCardLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)))
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp1Layout.createSequentialGroup()
                        .addComponent(debitPanelCardNumberTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp1Layout.createSequentialGroup()
                        .addComponent(debitPanelCardNumberTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp1Layout.createSequentialGroup()
                        .addComponent(debitPanelCardNumberTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp1Layout.createSequentialGroup()
                        .addComponent(debitPanelCardNumberTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(debitPanelExpiryDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(debitPanelCVVLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp1Layout.createSequentialGroup()
                        .addComponent(debitPanelExpiryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(debitPanelCVVTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(157, Short.MAX_VALUE))
        );

        jp2.setBackground(new java.awt.Color(64, 71, 109));

        googlePayPanelUPiTextField.setBackground(new java.awt.Color(64, 71, 109));
        googlePayPanelUPiTextField.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        googlePayPanelUPiTextField.setForeground(new java.awt.Color(255, 255, 255));
        googlePayPanelUPiTextField.setText("Enter UPI ID");
        googlePayPanelUPiTextField.setBorder(null);
        googlePayPanelUPiTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                googlePayPanelUPiTextFieldActionPerformed(evt);
            }
        });

        googlePayPanelUpiPinTextField.setBackground(new java.awt.Color(64, 71, 109));
        googlePayPanelUpiPinTextField.setForeground(new java.awt.Color(255, 255, 255));
        googlePayPanelUpiPinTextField.setText("****");
        googlePayPanelUpiPinTextField.setBorder(null);

        googlePayPanelUpiPinLabel.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        googlePayPanelUpiPinLabel.setForeground(new java.awt.Color(255, 255, 255));
        googlePayPanelUpiPinLabel.setText("UPI PIN");

        googlePayPanelGoogleLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrus/res/google1_50px.png"))); // NOI18N

        googlePayPanelGooglePayLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 40)); // NOI18N
        googlePayPanelGooglePayLabel.setForeground(new java.awt.Color(255, 255, 255));
        googlePayPanelGooglePayLabel.setText("Pay");

        googlePayPanelAmountTextField.setBackground(new java.awt.Color(64, 71, 109));
        googlePayPanelAmountTextField.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        googlePayPanelAmountTextField.setForeground(new java.awt.Color(255, 255, 255));
        googlePayPanelAmountTextField.setText("Amount :");
        googlePayPanelAmountTextField.setBorder(null);
        googlePayPanelAmountTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                googlePayPanelAmountTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp2Layout = new javax.swing.GroupLayout(jp2);
        jp2.setLayout(jp2Layout);
        jp2Layout.setHorizontalGroup(
            jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp2Layout.createSequentialGroup()
                .addGap(252, 252, 252)
                .addGroup(jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp2Layout.createSequentialGroup()
                        .addComponent(googlePayPanelGoogleLogo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(googlePayPanelGooglePayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(googlePayPanelUpiPinLabel)
                    .addGroup(jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSeparator8, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(googlePayPanelUpiPinTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                    .addGroup(jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(googlePayPanelAmountTextField)
                            .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(googlePayPanelUPiTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                            .addComponent(jSeparator7))))
                .addContainerGap(297, Short.MAX_VALUE))
        );
        jp2Layout.setVerticalGroup(
            jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp2Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(googlePayPanelGoogleLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(googlePayPanelGooglePayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addComponent(googlePayPanelUPiTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(googlePayPanelAmountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(googlePayPanelUpiPinLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(googlePayPanelUpiPinTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        jp3.setBackground(new java.awt.Color(64, 71, 109));

        paytmPanelMobileTextField.setBackground(new java.awt.Color(64, 71, 109));
        paytmPanelMobileTextField.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        paytmPanelMobileTextField.setForeground(new java.awt.Color(255, 255, 255));
        paytmPanelMobileTextField.setText("Mobile Number");
        paytmPanelMobileTextField.setBorder(null);
        paytmPanelMobileTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paytmPanelMobileTextFieldActionPerformed(evt);
            }
        });

        paytmPanelAmountTextField.setBackground(new java.awt.Color(64, 71, 109));
        paytmPanelAmountTextField.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        paytmPanelAmountTextField.setForeground(new java.awt.Color(255, 255, 255));
        paytmPanelAmountTextField.setText("Amount : ₹");
        paytmPanelAmountTextField.setBorder(null);
        paytmPanelAmountTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paytmPanelAmountTextFieldActionPerformed(evt);
            }
        });

        paytmPanelCommentTextfFeld.setBackground(new java.awt.Color(64, 71, 109));
        paytmPanelCommentTextfFeld.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        paytmPanelCommentTextfFeld.setForeground(new java.awt.Color(255, 255, 255));
        paytmPanelCommentTextfFeld.setText("What is it for?(Optional)");
        paytmPanelCommentTextfFeld.setBorder(null);
        paytmPanelCommentTextfFeld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paytmPanelCommentTextfFeldActionPerformed(evt);
            }
        });

        paytmPanelPaytmLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrus/res/paytm_90px.png"))); // NOI18N

        javax.swing.GroupLayout jp3Layout = new javax.swing.GroupLayout(jp3);
        jp3.setLayout(jp3Layout);
        jp3Layout.setHorizontalGroup(
            jp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp3Layout.createSequentialGroup()
                .addGap(252, 252, 252)
                .addGroup(jp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(paytmPanelCommentTextfFeld)
                        .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(paytmPanelAmountTextField)
                        .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(paytmPanelMobileTextField)
                        .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(paytmPanelPaytmLogo))
                .addContainerGap(297, Short.MAX_VALUE))
        );
        jp3Layout.setVerticalGroup(
            jp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp3Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(paytmPanelPaytmLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(paytmPanelMobileTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(paytmPanelAmountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(paytmPanelCommentTextfFeld, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(190, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jp3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jp1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jp3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jp1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void debitCardTabMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_debitCardTabMouseEntered

        /*setColour(tab1);
        jLabel2.setForeground(Color.white); */
    }//GEN-LAST:event_debitCardTabMouseEntered

    private void googlePayTabMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_googlePayTabMouseEntered
        
      /*  setColour(tab2);
        jLabel3.setForeground(Color.white); */
    }//GEN-LAST:event_googlePayTabMouseEntered

    private void paytmTabMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paytmTabMouseEntered
        
        /*setColour(tab3);
        jLabel4.setForeground(Color.white);*/
    }//GEN-LAST:event_paytmTabMouseEntered

    private void debitCardTabMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_debitCardTabMouseExited
        
      /*  resetColour(tab1);
        jLabel2.setForeground(new Color(64,71,109)); */
    }//GEN-LAST:event_debitCardTabMouseExited

    private void googlePayTabMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_googlePayTabMouseExited
       
       /*  resetColour(tab2);
        jLabel3.setForeground(new Color(64,71,109)); */
    }//GEN-LAST:event_googlePayTabMouseExited

    private void paytmTabMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paytmTabMouseExited
        
       /* resetColour(tab3);
        jLabel4.setForeground(new Color(64,71,109)); */
    }//GEN-LAST:event_paytmTabMouseExited
 
    private void debitCardTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_debitCardTabMouseClicked
        // TODO add your handling code here:
        jp1.setVisible(true);
        setColour(debitCardTab);
        jLabel2.setForeground(Color.white);
        resetColour(googlePayTab);
        jLabel3.setForeground(new Color(64,71,109));
        resetColour(paytmTab);
        jLabel4.setForeground(new Color(64,71,109));
        jp2.setVisible(false);
        jp3.setVisible(false);
    }//GEN-LAST:event_debitCardTabMouseClicked

    private void googlePayTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_googlePayTabMouseClicked
        // TODO add your handling code here:
        jp2.setVisible(true);
        jp1.setVisible(true);
        setColour(googlePayTab);
        jLabel3.setForeground(Color.white);
        resetColour(debitCardTab);
        jLabel2.setForeground(new Color(64,71,109));
        resetColour(paytmTab);
        jLabel4.setForeground(new Color(64,71,109));
        jp1.setVisible(false);
        jp3.setVisible(false);
    }//GEN-LAST:event_googlePayTabMouseClicked

    private void paytmTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paytmTabMouseClicked
        // TODO add your handling code here:
        jp3.setVisible(true);
        setColour(paytmTab);
        jLabel4.setForeground(Color.white);
        resetColour(debitCardTab);
        jLabel2.setForeground(new Color(64,71,109));
        resetColour(googlePayTab);
        jLabel3.setForeground(new Color(64,71,109));
        jp1.setVisible(false);
        jp2.setVisible(false);
    }//GEN-LAST:event_paytmTabMouseClicked

    private void googlePayPanelUPiTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_googlePayPanelUPiTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_googlePayPanelUPiTextFieldActionPerformed

    private void paytmPanelMobileTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paytmPanelMobileTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paytmPanelMobileTextFieldActionPerformed

    private void paytmPanelAmountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paytmPanelAmountTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paytmPanelAmountTextFieldActionPerformed

    private void paytmPanelCommentTextfFeldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paytmPanelCommentTextfFeldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paytmPanelCommentTextfFeldActionPerformed

    private void googlePayPanelAmountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_googlePayPanelAmountTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_googlePayPanelAmountTextFieldActionPerformed

    private void submiteButtonPaymentScreenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submiteButtonPaymentScreenMouseClicked
        // TODO add your handling code here:
        
        SqlFunctions ss = new SqlFunctions();
        ss.updateQuantityItemTable();
    }//GEN-LAST:event_submiteButtonPaymentScreenMouseClicked

    void updateCartNumber()
{
    SqlFunctions ss = new SqlFunctions();
    ss.cartid++;
}
    public void setColour(JPanel p)
{
    p.setBackground(new Color(64,71,109)); 
}  
    public void resetColour(JPanel p1)
{
    p1.setBackground(new Color(255,255,255)); 
} 
 /*  public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(PayScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PayScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PayScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PayScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       /* java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PayScreen().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel debitCardTab;
    private javax.swing.JLabel debitPanelCVVLabel;
    private javax.swing.JPasswordField debitPanelCVVTextField;
    private javax.swing.JLabel debitPanelCardLabel;
    private javax.swing.JTextField debitPanelCardNumberTextField1;
    private javax.swing.JTextField debitPanelCardNumberTextField2;
    private javax.swing.JTextField debitPanelCardNumberTextField3;
    private javax.swing.JTextField debitPanelCardNumberTextField4;
    private javax.swing.JLabel debitPanelExpiryDateLabel;
    private javax.swing.JTextField debitPanelExpiryTextField;
    private javax.swing.JLabel debitPanelMasterCardLogo;
    private javax.swing.JLabel debitPanelRupayCardLogo;
    private javax.swing.JLabel debitPanelVisaCardLogo;
    private javax.swing.JTextField googlePayPanelAmountTextField;
    private javax.swing.JLabel googlePayPanelGoogleLogo;
    private javax.swing.JLabel googlePayPanelGooglePayLabel;
    private javax.swing.JTextField googlePayPanelUPiTextField;
    private javax.swing.JLabel googlePayPanelUpiPinLabel;
    private javax.swing.JPasswordField googlePayPanelUpiPinTextField;
    private javax.swing.JPanel googlePayTab;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
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
    private javax.swing.JTextField paytmPanelAmountTextField;
    private javax.swing.JTextField paytmPanelCommentTextfFeld;
    private javax.swing.JTextField paytmPanelMobileTextField;
    private javax.swing.JLabel paytmPanelPaytmLogo;
    private javax.swing.JPanel paytmTab;
    private javax.swing.JLabel submiteButtonPaymentScreen;
    // End of variables declaration//GEN-END:variables
}
