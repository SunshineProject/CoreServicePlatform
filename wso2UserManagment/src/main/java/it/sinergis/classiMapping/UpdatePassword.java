package it.sinergis.classiMapping;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class UpdatePassword {
	private String newPassword;
	private String oldPassword;
	
	public String getNewPassword() {
		return newPassword;
	}
	
	public void setNewPassword(String password) {
		this.newPassword = password;
	}
	
	public String getOldPassword() {
		return oldPassword;
	}
	
	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}
}
