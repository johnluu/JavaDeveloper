package CoreJava.Models;

public class Student {

private String email;
private String name;
private String pass;

public Student(){
	email = "";
	name = "";
	pass = "";
	
}

public Student(String email, String name, String pass){
	this.email = email;
	this.name = name;
	this.pass = pass;
}
    public void setEmail(String email){

    	this.email = email;
    	
    }

    public String getEmail(){

    	return this.email;
    }

    public void setName(String name){

    	this.name = name;
    
    	return;
    }

    public String getName(){

    	return this.name;
  
    }

    public void setPass(String pass){

    	this.pass = pass;
    }

    public String getPass(){

    	return this.pass;
    }
}
