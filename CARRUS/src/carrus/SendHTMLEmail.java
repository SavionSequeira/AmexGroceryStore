package carrus;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vishv
 */
import java.util.Date;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
public class SendHTMLEmail {
       SendHTMLEmail(String Recepient,String bill) {

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
     msg.setSubject("Hello");
     msg.setText("How are you");
     msg.setContent(
"<html xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:o=\"urn:schemas-microsoft-com:office:office\" style=\"width:100%;font-family:tahoma, verdana, segoe, sans-serif;-webkit-text-size-adjust:100%;-ms-text-size-adjust:100%;padding:0;Margin:0\">\n" +
" <head> \n" +
"  <meta charset=\"UTF-8\"> \n" +
"  <meta content=\"width=device-width, initial-scale=1\" name=\"viewport\"> \n" +
"  <meta name=\"x-apple-disable-message-reformatting\"> \n" +
"  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"> \n" +
"  <meta content=\"telephone=no\" name=\"format-detection\"> \n" +
"  <title>New email template 2020-08-16</title> \n" +
"  <!--[if (mso 16)]>\n" +
"    <style type=\"text/css\">\n" +
"    a {text-decoration: none;}\n" +
"    </style>\n" +
"    <![endif]--> \n" +
"  <!--[if gte mso 9]><style>sup { font-size: 100% !important; }</style><![endif]--> \n" +
"  <!--[if !mso]><!-- --> \n" +
"  <link href=\"https://fonts.googleapis.com/css?family=Poppins:400,700&display=swap\" rel=\"stylesheet\"> \n" +
"  <link href=\"https://fonts.googleapis.com/css?family=Poppins:400,500,600,700,900&display=swap\" rel=\"stylesheet\"> \n" +
"  <!--<![endif]--> \n" +
"  <!--[if gte mso 9]>\n" +
"<xml>\n" +
"    <o:OfficeDocumentSettings>\n" +
"    <o:AllowPNG></o:AllowPNG>\n" +
"    <o:PixelsPerInch>96</o:PixelsPerInch>\n" +
"    </o:OfficeDocumentSettings>\n" +
"</xml>\n" +
"<![endif]--> \n" +
"  <style type=\"text/css\">\n" +
"@media only screen and (max-width:600px) {p, ul li, ol li, a { font-size:14px!important; line-height:150%!important } h1 { font-size:28px!important; text-align:center; line-height:120%!important } h2 { font-size:24px!important; text-align:center; line-height:120%!important } h3 { font-size:18px!important; text-align:center; line-height:120%!important } h1 a { font-size:28px!important } h2 a { font-size:24px!important } h3 a { font-size:18px!important } .es-menu td a { font-size:12px!important } .es-header-body p, .es-header-body ul li, .es-header-body ol li, .es-header-body a { font-size:13px!important } .es-footer-body p, .es-footer-body ul li, .es-footer-body ol li, .es-footer-body a { font-size:11px!important } .es-infoblock p, .es-infoblock ul li, .es-infoblock ol li, .es-infoblock a { font-size:11px!important } *[class=\"gmail-fix\"] { display:none!important } .es-m-txt-c, .es-m-txt-c h1, .es-m-txt-c h2, .es-m-txt-c h3 { text-align:center!important } .es-m-txt-r, .es-m-txt-r h1, .es-m-txt-r h2, .es-m-txt-r h3 { text-align:right!important } .es-m-txt-l, .es-m-txt-l h1, .es-m-txt-l h2, .es-m-txt-l h3 { text-align:left!important } .es-m-txt-r img, .es-m-txt-c img, .es-m-txt-l img { display:inline!important } .es-button-border { display:inline-block!important } a.es-button { font-size:16px!important; display:inline-block!important } .es-btn-fw { border-width:10px 0px!important; text-align:center!important } .es-adaptive table, .es-btn-fw, .es-btn-fw-brdr, .es-left, .es-right { width:100%!important } .es-content table, .es-header table, .es-footer table, .es-content, .es-footer, .es-header { width:100%!important; max-width:600px!important } .es-adapt-td { display:block!important; width:100%!important } .adapt-img { width:100%!important; height:auto!important } .es-m-p0 { padding:0px!important } .es-m-p0r { padding-right:0px!important } .es-m-p0l { padding-left:0px!important } .es-m-p0t { padding-top:0px!important } .es-m-p0b { padding-bottom:0!important } .es-m-p20b { padding-bottom:20px!important } .es-mobile-hidden, .es-hidden { display:none!important } tr.es-desk-hidden, td.es-desk-hidden, table.es-desk-hidden { display:table-row!important; width:auto!important; overflow:visible!important; float:none!important; max-height:inherit!important; line-height:inherit!important } .es-desk-menu-hidden { display:table-cell!important } table.es-table-not-adapt, .esd-block-html table { width:auto!important } table.es-social { display:inline-block!important } table.es-social td { display:inline-block!important } }\n" +
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
".es-button-border:hover a.es-button {\n" +
"	background:#065C66!important;\n" +
"	border-color:#065C66!important;\n" +
"}\n" +
".es-button-border:hover {\n" +
"	border-color:#00f5f9 #00f5f9 #00f5f9 #00f5f9!important;\n" +
"	background:#065C66!important;\n" +
"}\n" +
"</style> \n" +
" </head> \n" +
" <body style=\"width:100%;font-family:tahoma, verdana, segoe, sans-serif;-webkit-text-size-adjust:100%;-ms-text-size-adjust:100%;padding:0;Margin:0\"> \n" +
"  <div class=\"es-wrapper-color\" style=\"background-color:#F6F6F6\"> \n" +
"   <!--[if gte mso 9]>\n" +
"			<v:background xmlns:v=\"urn:schemas-microsoft-com:vml\" fill=\"t\">\n" +
"				<v:fill type=\"tile\" color=\"#f6f6f6\"></v:fill>\n" +
"			</v:background>\n" +
"		<![endif]--> \n" +
"   <table class=\"es-wrapper\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;padding:0;Margin:0;width:100%;height:100%;background-repeat:repeat;background-position:center top\"> \n" +
"     <tr style=\"border-collapse:collapse\"> \n" +
"      <td valign=\"top\" style=\"padding:0;Margin:0\"> \n" +
"       <table class=\"es-content\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%\"> \n" +
"         <tr style=\"border-collapse:collapse\"> \n" +
"          <td style=\"padding:0;Margin:0;background-color:#1B142D\" bgcolor=\"#1b142d\" align=\"center\"> \n" +
"           <table class=\"es-content-body\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:transparent;width:600px\" cellspacing=\"0\" cellpadding=\"0\" bgcolor=\"transparent\" align=\"center\"> \n" +
"             <tr style=\"border-collapse:collapse\"> \n" +
"              <td align=\"left\" style=\"padding:0;Margin:0\"> \n" +
"               <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px\"> \n" +
"                 <tr style=\"border-collapse:collapse\"> \n" +
"                  <td valign=\"top\" align=\"center\" style=\"padding:0;Margin:0;width:600px\"> \n" +
"                   <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px\"> \n" +
"                     <tr style=\"border-collapse:collapse\"> \n" +
"                      <td style=\"padding:0;Margin:0;font-size:0px\" align=\"center\"><a target=\"_blank\" href=\"https://viewstripo.email/\" style=\"-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:tahoma, verdana, segoe, sans-serif;font-size:15px;text-decoration:underline;color:#2CB543\"><img class=\"adapt-img\" src=\"https://ivgtus.stripocdn.email/content/guids/fb536e0d-9b7f-467a-b066-314789fd02b3/images/14641597556605097.png\" alt style=\"display:block;border:0;outline:none;text-decoration:none;-ms-interpolation-mode:bicubic\" width=\"200\"></a></td> \n" +
"                     </tr> \n" +
"                   </table></td> \n" +
"                 </tr> \n" +
"               </table></td> \n" +
"             </tr> \n" +
"             <tr style=\"border-collapse:collapse\"> \n" +
"              <td style=\"Margin:0;padding-top:5px;padding-left:20px;padding-right:20px;padding-bottom:30px;background-color:#FFFFFF\" bgcolor=\"#ffffff\" align=\"left\"> \n" +
"               <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px\"> \n" +
"                 <tr style=\"border-collapse:collapse\"> \n" +
"                  <td class=\"es-m-p20b\" align=\"left\" style=\"padding:0;Margin:0;width:560px\"> \n" +
"                   <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px\"> \n" +
"                     <tr style=\"border-collapse:collapse\"> \n" +
"                      <td align=\"center\" style=\"padding:0;Margin:0;padding-bottom:5px;padding-top:10px\"><h2 style=\"Margin:0;line-height:30px;mso-line-height-rule:exactly;font-family:Poppins, sans-serif;font-size:25px;font-style:normal;font-weight:bold;color:#00413F\">"+bill+"</h2></td> \n" +
"                     </tr> \n" +
"                     <tr style=\"border-collapse:collapse\"> \n" +
"                      <td align=\"center\" style=\"padding:0;Margin:0;padding-top:10px;padding-bottom:10px\"><h2 style=\"Margin:0;line-height:30px;mso-line-height-rule:exactly;font-family:Poppins, sans-serif;font-size:25px;font-style:normal;font-weight:bold;color:#333333\">0000<br></h2></td> \n" +
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
     System.out.println("Message sent.");
  }catch (MessagingException e){ System.out.println("Erreur d'envoi, cause: " + e);}
 }
}
