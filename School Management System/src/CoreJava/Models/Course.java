package CoreJava.Models;

public class Course {

private	int id;
private	String name;
private	String instructor;
	


public Course() {
	
	this.id = ' ';
	this.name = " ";
	this.instructor = " ";
}

public Course(int id, String name, String instructor) {
	
	this.id = id;
	this.name = name;
	this.instructor = instructor;
}

    public void setID(int ID){
    	
    	this.id = ID;
    	return;

    }

    public int getID(){
    
    	return this.id;

    }

    public void setName(String name){

    	this.name = name;
    }

    public String getName(){

    	return this.name;
    }

    public void setInstructor(String instructor){

    	this.instructor = instructor;
    	return;
    }

    public String getInstructor(){

    	return this.instructor;
    }

}
