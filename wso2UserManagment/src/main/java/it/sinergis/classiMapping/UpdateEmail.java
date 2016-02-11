package it.sinergis.classiMapping;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class UpdateEmail {
	private String email;
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
}
