package it.sinergis.sunshinesecurity;

import java.io.InputStream;
import java.io.OutputStream;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/**
 * Establish a SSL connection to a host and port, writes a byte and prints the response. See
 * http://confluence.atlassian.com/display/JIRA/Connecting+to+SSL+services
 */
public class SSLPoke {
	public static void main(String[] args) {
		String host = "sunshine-security";//:/services/SPS";
		int porta = 8243;
		if (args.length > 2) {
			System.out.println("Usage: " + SSLPoke.class.getName() + " <host> <port>");
			System.exit(1);
		}
		try {
			SSLSocketFactory sslsocketfactory = (SSLSocketFactory) SSLSocketFactory.getDefault();
			SSLSocket sslsocket = (SSLSocket) sslsocketfactory.createSocket(host, porta);
			
			InputStream in = sslsocket.getInputStream();
			OutputStream out = sslsocket.getOutputStream();
			
			// Write a test byte to get a reaction :)
			out.write(1);
			
			while (in.available() > 0) {
				System.out.print(in.read());
			}
			System.out.println("Successfully connected");
			
		}
		catch (Exception exception) {
			exception.printStackTrace();
		}
	}
}
