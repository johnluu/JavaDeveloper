package qofd.SystemInterfaces;

import qofd.Models.User;

public interface UserDAOI {

	public boolean registerUser (String email,String password,String fname,String lname);
	public boolean loginUser(String email,String password);
	public User getUser(int userid);
	
	
}
