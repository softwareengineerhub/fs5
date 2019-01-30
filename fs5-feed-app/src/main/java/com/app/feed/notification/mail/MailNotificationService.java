package com.app.feed.notification.mail;

import org.springframework.stereotype.Service;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

@Service
public class MailNotificationService {

    public void sendMail() {
        final String username = "fs5mailer.fs5mailer@gmail.com";
        final String password = "Kiev111111";


        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        /*Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");
*/

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    public PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("fs5mailer.fs5mailer@gmail.com"));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse("fs5mailer.fs5mailer@gmail.com"));
            message.setSubject("Employee alert Notification");
            message.setText("We have incorrect data. PLease check");

            Transport.send(message);

            System.out.println("Done");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
