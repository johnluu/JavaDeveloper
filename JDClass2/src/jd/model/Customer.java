package jd.model;

public class Customer {

	private Integer customer_id;
	private String customer_email;
	private String customer_fname;
	private String customer_lname;
	
	public Customer(){}
	
	
	public Customer(String email, String fname, String lname)
	{
		this.customer_email = email;
		this.customer_fname = fname;
		this.customer_lname = lname;
		
	}
	
	public Customer(Integer id,String email, String fname, String lname)
	{
		this.customer_id = id;
		this.customer_email = email;
		this.customer_fname = fname;
		this.customer_lname = lname;
		
	}
	
	public Integer getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(Integer customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_email() {
		return customer_email;
	}
	public void setCustomer_email(String customer_email) {
		this.customer_email = customer_email;
	}
	public String getCustomer_fname() {
		return customer_fname;
	}
	public void setCustomer_fname(String customer_fname) {
		this.customer_fname = customer_fname;
	}
	public String getCustomer_lname() {
		return customer_lname;
	}
	public void setCustomer_lname(String customer_lname) {
		this.customer_lname = customer_lname;
	}
	
	
	
}
