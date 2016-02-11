package it.sinergis.utils;

import java.io.UnsupportedEncodingException;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMail {
	public static void main(String args[]) throws UnsupportedEncodingException {
		
	}
	
	public static void sendmail(String messageText, String to) {
		Properties props = new Properties();
		props.put("mail.smtp.auth", "false");
		props.put("mail.smtp.starttls.enable", "false");
		props.put("mail.smtp.host", "172.24.200.99");
		props.put("mail.smtp.port", "25");
		Session session = Session.getInstance(props, null);
		
		try {
			
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("sunshine@security.eu"));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
			message.setSubject("sunshine: change password");
			message.setText(messageText);
			
			Transport.send(message);
			
			System.out.println("Done");
			
		}
		catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}
	
}
