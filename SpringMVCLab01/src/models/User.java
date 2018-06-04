package models;

public class User {

	private String firstname;
	private String lastname;
	private String username;
	private String gender;
	private ContactInfo contactinfo;
	private PrivateInfo privateinfo;
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public ContactInfo getContactinfo() {
		return contactinfo;
	}
	public void setContactinfo(ContactInfo contactinfo) {
		this.contactinfo = contactinfo;
	}
	public PrivateInfo getPrivateinfo() {
		return privateinfo;
	}
	public void setPrivateinfo(PrivateInfo privateinfo) {
		this.privateinfo = privateinfo;
	}
	
	
}
