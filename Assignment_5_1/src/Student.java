
public class Student {
private String Name;
private int Grade;
private double GPA;
	

public Student(String name, int grade, double gpa)
{
	
	Name = name;
	Grade = grade;
	GPA = gpa;

}

public Student()
{
	Name = " ";
	Grade = '0';
	GPA = 0;
}

public void studentInfo() {
	
	System.out.println("My name is " + Name +"\n"
			+ "My grade is "+ Grade +  "\n"
					+ "GPA is " + GPA);
	
	
}

public String getName() {
	return Name;
}

public void setName(String name) {
	Name = name;
}

public int getGrade() {
	return Grade;
}

public void setGrade(int grade) {
	Grade = grade;
}

public void setGPA(double gPA) {
	GPA = gPA;
}

public double getGPA() {
	
	
	
	
	return GPA;
	
	
}

}
