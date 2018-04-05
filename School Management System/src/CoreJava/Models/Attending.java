package CoreJava.Models;

public class Attending {

	int courseID;
	String email;
	
	
	public Attending() {
		
		this.courseID = ' ';
		this.email = " ";
	}

	public Attending(int courseID , String email) {
		
		this.courseID = courseID;
		this.email = email;
	}
	
    public void setCourseID(int courseID){

    	this.courseID = courseID;
    	
    }

    public int getCourseID(){
    	
    	return this.courseID;

    }

    public void setStudentEmail(String studentEmail){

    	this.email = studentEmail;
    	
    }

    public String getStudentEmail(){

    	return this.email;
    }
}
