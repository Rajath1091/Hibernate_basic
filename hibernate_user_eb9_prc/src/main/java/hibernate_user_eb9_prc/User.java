package hibernate_user_eb9_prc;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

	private int id;
	private String name;
	@Id
	private String email;
	private String password;
	private String address;
	private String facebook;
	private String instagram;
	private String snapchat;
	private String whatsapp;
	private String twitter;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFacebook() {
		return facebook;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	public String getInstagram() {
		return instagram;
	}

	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}

	public String getSnapchat() {
		return snapchat;
	}

	public void setSnapchat(String snapchat) {
		this.snapchat = snapchat;
	}

	public String getWhatsapp() {
		return whatsapp;
	}

	public void setWhatsapp(String whatsapp) {
		this.whatsapp = whatsapp;
	}

	public String getTwitter() {
		return twitter;
	}

	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}

	@Override
	public String toString() {
		return "User [facebook=" + facebook + ", instagram=" + instagram + ", snapchat=" + snapchat + ", whatsapp="
				+ whatsapp + ", twitter=" + twitter + "]";
	}

}
