package CoreJava.DAO;

import CoreJava.Models.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentDAO {
	
final String currPath = System.getProperty("user.dir");
final String location = currPath +  "\\Students.csv";
	
    public List<Student>  getStudents(){
    	
    	List<Student> student = new ArrayList<Student>();
    	
    	
    	try {
    		File file = new File(location);
			Scanner scan = new Scanner(file);

			while(scan.hasNextLine())
			{
			String s[] = scan.nextLine().split(",");
			student.add(new Student(s[0],s[1],s[2]));
			}
			
			scan.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found in " + this.getClass().getName() );
		}
    	
    	 catch (Exception e) {
 			System.out.println("Error in " + this.getClass().getName() );
 		}
    	
    	

    	
    	return student;
    	
    }

    public Student getStudentByEmail(List<Student> studentList, String studentEmail){
    	
    	for(Student s:studentList)
    		if(s.getEmail().equals(studentEmail))
    			return s;
    		
    	return null;

    }

    public boolean validateUser(List<Student> studentList, String studentEmail, String studentPass){

    	for(Student s:studentList)
    	{
    		
    		if(s.getEmail().equals( studentEmail) && s.getPass().equals(studentPass))
    			return true;
    	}
    	return false;
    
    }
}
