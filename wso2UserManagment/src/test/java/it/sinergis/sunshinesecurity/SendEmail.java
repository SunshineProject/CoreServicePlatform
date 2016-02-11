package it.sinergis.sunshinesecurity;

// File Name SendEmail.java

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendEmail {
	public static void main(String[] args) {
		
		final String username = "username@gmail.com";
		final String password = "password";
		
		Properties props = new Properties();
		props.put("mail.smtp.auth", "false");
		props.put("mail.smtp.starttls.enable", "false");
		props.put("mail.smtp.host", "172.24.200.99");
		props.put("mail.smtp.port", "25");
		
		Session session = Session.getInstance(props, null);
		/*
		 * , new javax.mail.Authenticator() { });
		 */
		try {
			
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("from-email@gmail.com"));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("enrico.deguidi@gmail.com"));
			message.setSubject("Testing Subject");
			message.setText("Dear Mail Crawler," + "\n\n No spam to my email, please!");
			
			Transport.send(message);
			
			System.out.println("Done");
			
		}
		catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}
}