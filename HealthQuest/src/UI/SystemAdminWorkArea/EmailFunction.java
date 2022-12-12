/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI.SystemAdminWorkArea;
//import UI.SystemAdminWorkArea.ManageEnterpriseAdminJPanel;


import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.PasswordAuthentication;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author vivekhanagoji
 */
public class EmailFunction {

    public static void sendMail(String recepient,char[] Pass) {
        try {
            Properties pro = new Properties();
            pro.put("mail.smtp.auth", "true");
            pro.put("mail.smtp.starttls.enable", "true");
            pro.put("mail.smtp.host", "smtp.gmail.com");
            pro.put("mail.smtp.port", "587");

            final String myAccEMail = "satyam.jagtap101@gmail.com";
            final String password = "mbkhazuyzhzetnzo";

            Session ses = Session.getInstance(pro, new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(myAccEMail, password);
                }
            });

            Message msg = prepareMessage(ses, myAccEMail, recepient, Pass);

            Transport.send(msg);
            System.out.println("Message sent successfully");
        } catch (MessagingException ex) {
            Logger.getLogger(EmailFunction.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static Message prepareMessage(Session ses, String myAccEMail, String recepient, char[] pass) {
        try {
            Message message = new MimeMessage(ses);
            message.setFrom(new InternetAddress(myAccEMail));

            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
            message.setSubject(" Java Swing");
//           String password 
            message.setText("Hello User, Welcome to the Health Quest Management Systems. Your One Time Password for Login is "+String.valueOf(pass));
            return message;
        } catch (Exception ex) {
            Logger.getLogger(EmailFunction.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
