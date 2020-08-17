package carrus;
import java.util.Date;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
public class SendHTMLEmail {
    SendHTMLEmail(String Recepient,String bill,int totalPrice) {
        Properties properties = new Properties();
        properties.put("mail.smtp.auth","true");
        properties.put("mail.smtp.starttls.enable","true");
        properties.put("mail.smtp.host","smtp.gmail.com");
        properties.put("mail.smtp.port","587");
        properties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        final String username = "carrus.kiosk@gmail.com";//
        final String password = "carrus2020";
        try{
        Session session = Session.getDefaultInstance(properties, 
                             new Authenticator(){
                                protected PasswordAuthentication getPasswordAuthentication() {
                                   return new PasswordAuthentication(username, password);
                                }});
      // -- Create a new message --
        Message msg = new MimeMessage(session);
     // -- Set the FROM and TO fields --
        msg.setFrom(new InternetAddress("carrus.kiosk@gmail.com"));
        msg.setRecipient(Message.RecipientType.TO, 
                         new InternetAddress(Recepient));
        msg.setSubject("Bill From Carrus");
        msg.setContent("<html xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:o=\"urn:schemas-microsoft-com:office:office\" style=\"width:100%;font-family:Arial, sans-serif;-webkit-text-size-adjust:100%;-ms-text-size-adjust:100%;padding:0;Margin:0\">\n" +
   " <head> \n" +
   "  <meta charset=\"UTF-8\"> \n" +
   "  <meta content=\"width=device-width, initial-scale=1\" name=\"viewport\"> \n" +
   "  <meta name=\"x-apple-disable-message-reformatting\"> \n" +
   "  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"> \n" +
   "  <meta content=\"telephone=no\" name=\"format-detection\"> \n" +
   "  <title>New Template</title> \n" +
   "  <!--[if (mso 16)]>\n" +
   "    <style type=\"text/css\">\n" +
   "    a {text-decoration: none;}\n" +
   "    </style>\n" +
   "    <![endif]--> \n" +
   "  <!--[if gte mso 9]><style>sup { font-size: 100% !important; }</style><![endif]--> \n" +
   "  <!--[if gte mso 9]>\n" +
   "<xml>\n" +
   "    <o:OfficeDocumentSettings>\n" +
   "    <o:AllowPNG></o:AllowPNG>\n" +
   "    <o:PixelsPerInch>96</o:PixelsPerInch>\n" +
   "    </o:OfficeDocumentSettings>\n" +
   "</xml>\n" +
   "<![endif]--> \n" +
   "  <style type=\"text/css\">\n" +
   "@media only screen and (max-width:600px) {p, ul li, ol li, a { font-size:16px!important; line-height:150%!important } h1 { font-size:30px!important; text-align:center; line-height:120%!important } h2 { font-size:26px!important; text-align:center; line-height:120%!important } h3 { font-size:20px!important; text-align:center; line-height:120%!important } h1 a { font-size:30px!important } h2 a { font-size:26px!important } h3 a { font-size:20px!important } .es-header-body p, .es-header-body ul li, .es-header-body ol li, .es-header-body a { font-size:16px!important } .es-footer-body p, .es-footer-body ul li, .es-footer-body ol li, .es-footer-body a { font-size:16px!important } .es-infoblock p, .es-infoblock ul li, .es-infoblock ol li, .es-infoblock a { font-size:12px!important } *[class=\"gmail-fix\"] { display:none!important } .es-m-txt-c, .es-m-txt-c h1, .es-m-txt-c h2, .es-m-txt-c h3 { text-align:center!important } .es-m-txt-r, .es-m-txt-r h1, .es-m-txt-r h2, .es-m-txt-r h3 { text-align:right!important } .es-m-txt-l, .es-m-txt-l h1, .es-m-txt-l h2, .es-m-txt-l h3 { text-align:left!important } .es-m-txt-r img, .es-m-txt-c img, .es-m-txt-l img { display:inline!important } .es-button-border { display:block!important } a.es-button { font-size:20px!important; display:block!important; border-left-width:0px!important; border-right-width:0px!important } .es-btn-fw { border-width:10px 0px!important; text-align:center!important } .es-adaptive table, .es-btn-fw, .es-btn-fw-brdr, .es-left, .es-right { width:100%!important } .es-content table, .es-header table, .es-footer table, .es-content, .es-footer, .es-header { width:100%!important; max-width:600px!important } .es-adapt-td { display:block!important; width:100%!important } .adapt-img { width:100%!important; height:auto!important } .es-m-p0 { padding:0px!important } .es-m-p0r { padding-right:0px!important } .es-m-p0l { padding-left:0px!important } .es-m-p0t { padding-top:0px!important } .es-m-p0b { padding-bottom:0!important } .es-m-p20b { padding-bottom:20px!important } .es-mobile-hidden, .es-hidden { display:none!important } tr.es-desk-hidden, td.es-desk-hidden, table.es-desk-hidden { display:table-row!important; width:auto!important; overflow:visible!important; float:none!important; max-height:inherit!important; line-height:inherit!important } .es-desk-menu-hidden { display:table-cell!important } table.es-table-not-adapt, .esd-block-html table { width:auto!important } table.es-social { display:inline-block!important } table.es-social td { display:inline-block!important } }\n" +
   "#outlook a {\n" +
   "	padding:0;\n" +
   "}\n" +
   ".ExternalClass {\n" +
   "	width:100%;\n" +
   "}\n" +
   ".ExternalClass,\n" +
   ".ExternalClass p,\n" +
   ".ExternalClass span,\n" +
   ".ExternalClass font,\n" +
   ".ExternalClass td,\n" +
   ".ExternalClass div {\n" +
   "	line-height:100%;\n" +
   "}\n" +
   ".es-button {\n" +
   "	mso-style-priority:100!important;\n" +
   "	text-decoration:none!important;\n" +
   "}\n" +
   "a[x-apple-data-detectors] {\n" +
   "	color:inherit!important;\n" +
   "	text-decoration:none!important;\n" +
   "	font-size:inherit!important;\n" +
   "	font-family:inherit!important;\n" +
   "	font-weight:inherit!important;\n" +
   "	line-height:inherit!important;\n" +
   "}\n" +
   ".es-desk-hidden {\n" +
   "	display:none;\n" +
   "	float:left;\n" +
   "	overflow:hidden;\n" +
   "	width:0;\n" +
   "	max-height:0;\n" +
   "	line-height:0;\n" +
   "	mso-hide:all;\n" +
   "}\n" +
   "p.b {\n"+ 
   "word-spacing: 30px;"+
   "}"+ 
    "p.c {\n"+ 
   "word-spacing: 45px;"+
   "}"+ 
   "</style> \n" +
   " </head> \n" +
   " <body style=\"width:100%;font-family:Arial, sans-serif;-webkit-text-size-adjust:100%;-ms-text-size-adjust:100%;padding:0;Margin:0\"> \n" +
   "  <div class=\"es-wrapper-color\" style=\"background-color:#555555\"> \n" +
   "   <!--[if gte mso 9]>\n" +
   "			<v:background xmlns:v=\"urn:schemas-microsoft-com:vml\" fill=\"t\">\n" +
   "				<v:fill type=\"tile\" color=\"#555555\"></v:fill>\n" +
   "			</v:background>\n" +
   "		<![endif]--> \n" +
   "   <table class=\"es-wrapper\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;padding:0;Margin:0;width:100%;height:100%;background-repeat:repeat;background-position:center top\"> \n" +
   "     <tr style=\"border-collapse:collapse\"> \n" +
   "      <td valign=\"top\" style=\"padding:0;Margin:0\"> \n" +
   "       <table cellpadding=\"0\" cellspacing=\"0\" class=\"es-content\" align=\"center\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%\"> \n" +
   "         <tr style=\"border-collapse:collapse\"> \n" +
   "          <td align=\"center\" style=\"padding:0;Margin:0\"> \n" +
   "           <table class=\"es-content-body\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:transparent;width:600px\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\"> \n" +
   "             <tr style=\"border-collapse:collapse\"> \n" +
   "              <td align=\"left\" style=\"padding:0;Margin:0;padding-bottom:5px;padding-left:10px;padding-right:10px\"> \n" +
   "               <!--[if mso]><table style=\"width:580px\" cellpadding=\"0\" cellspacing=\"0\"><tr><td style=\"width:280px\" valign=\"top\"><![endif]--> \n" +
   "               <table class=\"es-left\" cellspacing=\"0\" cellpadding=\"0\" align=\"left\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;float:left\"> \n" +
   "                 <tr style=\"border-collapse:collapse\"> \n" +
   "                  <td class=\"es-m-p0r es-m-p20b\" valign=\"top\" align=\"center\" style=\"padding:0;Margin:0;width:280px\"> \n" +
   "                   <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px\"> \n" +
   "                     <tr style=\"border-collapse:collapse\"> \n" +
   "                      <td class=\"es-infoblock\" align=\"left\" style=\"padding:0;Margin:0;line-height:14px;font-size:12px;color:#A0A7AC\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:12px;font-family:Arial, sans-serif;line-height:14px;color:#A0A7AC\">Put your preheader text here</p></td> \n" +
   "                     </tr> \n" +
   "                   </table></td> \n" +
   "                 </tr> \n" +
   "               </table> \n" +
   "               <!--[if mso]></td><td style=\"width:20px\"></td><td style=\"width:280px\" valign=\"top\"><![endif]--> \n" +
   "               <table cellspacing=\"0\" cellpadding=\"0\" align=\"right\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px\"> \n" +
   "                 <tr style=\"border-collapse:collapse\"> \n" +
   "                  <td align=\"left\" style=\"padding:0;Margin:0;width:280px\"> \n" +
   "                   <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px\"> \n" +
   "                     <tr style=\"border-collapse:collapse\"> \n" +
   "                      <td align=\"right\" class=\"es-infoblock\" style=\"padding:0;Margin:0;line-height:14px;font-size:12px;color:#A0A7AC\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:12px;font-family:Arial, sans-serif;line-height:14px;color:#A0A7AC\"><a href=\"https://viewstripo.email\" target=\"_blank\" class=\"view\" style=\"-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:Arial, sans-serif;font-size:12px;text-decoration:none;color:#A0A7AC;line-height:18px\">SEE THIS EMAIL ONLINE</a></p></td> \n" +
   "                     </tr> \n" +
   "                   </table></td> \n" +
   "                 </tr> \n" +
   "               </table> \n" +
   "               <!--[if mso]></td></tr></table><![endif]--></td> \n" +
   "             </tr> \n" +
   "           </table></td> \n" +
   "         </tr> \n" +
   "       </table> \n" +
   "       <table class=\"es-content\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%\"> \n" +
   "         <tr style=\"border-collapse:collapse\"> \n" +
   "          <td align=\"center\" style=\"padding:0;Margin:0\"> \n" +
   "           <table class=\"es-content-body\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:#F8F8F8;width:600px\"> \n" +
   "             <tr style=\"border-collapse:collapse\"> \n" +
   "              <td style=\"Margin:0;padding-left:10px;padding-right:10px;padding-top:20px;padding-bottom:20px;background-color:#142850\" bgcolor=\"#142850\" align=\"left\"> \n" +
   "               <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px\"> \n" +
   "                 <tr style=\"border-collapse:collapse\"> \n" +
   "                  <td valign=\"top\" align=\"center\" style=\"padding:0;Margin:0;width:580px\"> \n" +
   "                   <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px\"> \n" +
   "                     <tr style=\"border-collapse:collapse\"> \n" +
   "                      <td align=\"center\" style=\"padding:0;Margin:0;font-size:0px\"><a target=\"_blank\" href=\"*|ARCHIVE|*\" style=\"-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:Arial, sans-serif;font-size:14px;text-decoration:none;color:#3CA7F1\"><img class=\"adapt-img\" src=\"https://ijmtvz.stripocdn.email/content/guids/CABINET_790a2d702ccd61b0d9f2530c1bf401e4/images/12981597654201309.png\" alt width=\"105\" style=\"display:block;border:0;outline:none;text-decoration:none;-ms-interpolation-mode:bicubic\"></a></td> \n" +
   "                     </tr> \n" +
   "                   </table></td> \n" +
   "                 </tr> \n" +
   "               </table></td> \n" +
   "             </tr> \n" +
   "             <tr style=\"border-collapse:collapse\"> \n" +
   "              <td style=\"Margin:0;padding-top:20px;padding-bottom:20px;padding-left:20px;padding-right:20px;background-color:#43476D;background-image:url(https://ijmtvz.stripocdn.email/content/guids/CABINET_790a2d702ccd61b0d9f2530c1bf401e4/images/91961597655298372.jpg);background-repeat:no-repeat;background-position:left top\" bgcolor=\"#43476d\" align=\"left\" background=\"https://ijmtvz.stripocdn.email/content/guids/CABINET_790a2d702ccd61b0d9f2530c1bf401e4/images/91961597655298372.jpg\"> \n" +
   "               <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px\"> \n" +
   "                 <tr style=\"border-collapse:collapse\"> \n" +
   "                  <td valign=\"top\" align=\"center\" style=\"padding:0;Margin:0;width:560px\"> \n" +
   "                   <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px\"> \n" +
   "                     <tr style=\"border-collapse:collapse\"> \n" +
   "                      <td align=\"center\" style=\"padding:0;Margin:0;padding-top:15px;padding-bottom:15px\"> \n" +
   "                       <div> \n" +
   "                        <h2 style=\"Margin:0;line-height:36px;mso-line-height-rule:exactly;font-family:Arial, sans-serif;font-size:30px;font-style:normal;font-weight:normal;color:#FFFFFF\"><strong>Your order is confirmed. </strong></h2> \n" +
   "                       </div></td> \n" +
   "                     </tr> \n" +
   "                   </table></td> \n" +
   "                 </tr> \n" +
   "               </table></td> \n" +
   "             </tr> \n" +
   "             <tr style=\"border-collapse:collapse\"> \n" +
   "              <td style=\"Margin:0;padding-bottom:10px;padding-left:10px;padding-right:10px;padding-top:15px;background-color:#F8F8F8\" bgcolor=\"#f8f8f8\" align=\"left\"> \n" +
   "               <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px\"> \n" +
   "                 <tr style=\"border-collapse:collapse\"> \n" +
   "                  <td valign=\"top\" align=\"center\" style=\"padding:0;Margin:0;width:580px\"> \n" +
   "                   <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px\"> \n" +
   "                     <tr style=\"border-collapse:collapse\"> \n" +
   "                      <td align=\"center\" style=\"padding:0;Margin:0\"><h2 style=\"Margin:0;line-height:29px;mso-line-height-rule:exactly;font-family:Arial, sans-serif;font-size:24px;font-style:normal;font-weight:normal;color:#191919\">"+bill+"</h2></td> \n" +
   "                     </tr> \n" +
   "                   </table></td> \n" +
   "                 </tr> \n" +
   "               </table></td> \n" +
   "             </tr> \n" +
   "             <tr style=\"border-collapse:collapse\"> \n" +
   "              <td style=\"Margin:0;padding-top:10px;padding-bottom:10px;padding-left:10px;padding-right:10px;background-color:#F8F8F8\" bgcolor=\"#f8f8f8\" align=\"left\"> \n" +
   "               <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px\"> \n" +
   "                 <tr style=\"border-collapse:collapse\"> \n" +
   "                  <td valign=\"top\" align=\"center\" style=\"padding:0;Margin:0;width:580px\"> \n" +
   "                   <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px\"> \n" +
   "                     <tr style=\"border-collapse:collapse\"> \n" +
   "                      <td bgcolor=\"#f8f8f8\" align=\"center\" style=\"Margin:0;padding-left:10px;padding-right:10px;padding-top:20px;padding-bottom:20px;font-size:0\"> \n" +
   "                       <table width=\"100%\" height=\"100%\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px\"> \n" +
   "                         <tr style=\"border-collapse:collapse\"> \n" +
   "                          <td style=\"padding:0;Margin:0;border-bottom:1px solid #191919;background:#FFFFFFnone repeat scroll 0% 0%;height:1px;width:100%;margin:0px\"></td> \n" +
   "                         </tr> \n" +
   "                       </table></td> \n" +
   "                     </tr> \n" +
   "                     <tr style=\"border-collapse:collapse\"> \n" +
   "                      <td align=\"center\" style=\"padding:0;Margin:0;padding-bottom:15px\"> \n" +
   "                       <table class=\"cke_show_border\" height=\"101\" cellspacing=\"1\" cellpadding=\"1\" border=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;width:240px\"> \n" +
   "                         <tr style=\"border-collapse:collapse\"> \n" +
   "                          <td style=\"padding:0;Margin:0\"><br></td> \n" +
   "                          <td style=\"padding:0;Margin:0;text-align:right\"><br></td> \n" +
   "                         </tr> \n" +
   "                         <tr style=\"border-collapse:collapse\"> \n" +
   "                          <td style=\"padding:0;Margin:0\"><strong>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;OTP</strong></td> \n" +
   "                          <td style=\"padding:0;Margin:0;text-align:right\"><b>1234</b></td> \n" +
   "                         </tr> \n" +
   "                         <tr style=\"border-collapse:collapse\"> \n" +
   "                          <td style=\"padding:0;Margin:0;font-size:18px;line-height:36px\">&nbsp; &nbsp; &nbsp; &nbsp;Total:</td> \n" +
   "                          <td style=\"padding:0;Margin:0;text-align:right;font-size:18px;line-height:36px\"> &#8377;"+ totalPrice+"</td> \n" +
   "                         </tr> \n" +
   "                       </table></td> \n" +
   "                     </tr> \n" +
   "                   </table></td> \n" +
   "                 </tr> \n" +
   "               </table></td> \n" +
   "             </tr> \n" +
   "           </table></td> \n" +
   "         </tr> \n" +
   "       </table> \n" +
   "       <table cellpadding=\"0\" cellspacing=\"0\" class=\"es-footer\" align=\"center\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%;background-color:transparent;background-repeat:repeat;background-position:center top\"> \n" +
   "         <tr style=\"border-collapse:collapse\"> \n" +
   "          <td align=\"center\" style=\"padding:0;Margin:0\"> \n" +
   "           <table class=\"es-footer-body\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:#242424;width:600px\"> \n" +
   "             <tr style=\"border-collapse:collapse\"> \n" +
   "              <td align=\"left\" bgcolor=\"#43476d\" style=\"padding:20px;Margin:0;background-color:#43476D\"> \n" +
   "               <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px\"> \n" +
   "                 <tr style=\"border-collapse:collapse\"> \n" +
   "                  <td valign=\"top\" align=\"center\" style=\"padding:0;Margin:0;width:560px\"> \n" +
   "                   <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px\"> \n" +
   "                     <tr style=\"border-collapse:collapse\"> \n" +
   "                      <td align=\"center\" style=\"padding:0;Margin:0;padding-top:20px;padding-bottom:20px\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:13px;font-family:Arial, sans-serif;line-height:16px;color:#EFEFEF\"><br>CARRUS</p><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:13px;font-family:Arial, sans-serif;line-height:16px;color:#EFEFEF\">Bangalore 560001</p><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:13px;font-family:Arial, sans-serif;line-height:16px;color:#EFEFEF\">carrus.kiosk@gmail.com</p></td> \n" +
   "                     </tr> \n" +
   "                     <tr style=\"border-collapse:collapse\"> \n" +
   "                      <td align=\"center\" style=\"padding:0;Margin:0\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:13px;font-family:Arial, sans-serif;line-height:20px;color:#888888\"><br></p></td> \n" +
   "                     </tr> \n" +
   "                   </table></td> \n" +
   "                 </tr> \n" +
   "               </table></td> \n" +
   "             </tr> \n" +
   "           </table></td> \n" +
   "         </tr> \n" +
   "       </table></td> \n" +
   "     </tr> \n" +
   "   </table> \n" +
   "  </div>  \n" +
   " </body>\n" +
   "</html>", "text/html");
        msg.setSentDate(new Date());
        Transport.send(msg);
       
     }catch (MessagingException e)
    {
         System.out.println("Error message" + e);}
    }
}
