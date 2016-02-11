package it.sinergis.classiMapping;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {
	
	private String username;
	private String email;
	private String category;
	private String classe;
	private String partner;
	private String userType;
	private String pilot;
	private Integer pilotCode;
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	public String getClasse() {
		return classe;
	}
	
	public void setClasse(String classe) {
		this.classe = classe;
	}
	
	public String getPartner() {
		return partner;
	}
	
	public void setPartner(String partner) {
		this.partner = partner;
	}
	
	public String getUserType() {
		return userType;
	}
	
	public void setUserType(String userType) {
		this.userType = userType;
	}
	
	public String getPilot() {
		return pilot;
	}
	
	public void setPilot(String pilot) {
		privatePilotCode(pilot);
		this.pilot = pilot;
		
	}
	
	public Integer getPilotCode() {
		return pilotCode;
	}
	
	public void setPilotCode(Integer pilotCode) {
		this.pilotCode = pilotCode;
		
	}
	
	private void privatePilotCode(String nomePilot) {
		if (nomePilot == null) {
			setPilotCode(null);
			return;
		}
		nomePilot = nomePilot.trim().toLowerCase();
		switch (nomePilot) {
		
			case "trento":
				setPilotCode(null);
				break;
			case "trentino":
				setPilotCode(8);
				break;
			case "rovereto":
				setPilotCode(2);
				break;
			case "lamia":
				setPilotCode(6);
				break;
			case "paola":
				setPilotCode(7);
				break;
			case "valdinon":
				setPilotCode(9);
				break;
			case "zagreb":
				setPilotCode(10);
				break;
			case "bassanodelgrappa":
				setPilotCode(5);
				break;
			case "ferrara":
				setPilotCode(4);
				break;
			default:
				setPilotCode(null);
				break;
		}
	}
	
}
