
public class Student {

protected String name;
protected int grade;
protected double gpa;


Student(){	
}

Student(String Name, int Grade, double GPA){
	
	name = Name;
	grade = Grade;
	gpa = GPA;
}

public String getName() {
	return name;
}

public int getGrade() {
	return grade;
}

public double getGpa() {
	return gpa;
}

public void setName(String name) {
	this.name = name;
}

public void setGrade(int grade) {
	this.grade = grade;
}

public void setGpa(double gpa) {
	this.gpa = gpa;
}

public void getInfo() {
	
	System.out.println("Myname is " + name + ". I'm in grade " + grade + " and i have a " + gpa + " gpa" );
}

}
