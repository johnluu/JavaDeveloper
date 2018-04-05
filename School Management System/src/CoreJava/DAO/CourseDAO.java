package CoreJava.DAO;

import CoreJava.Models.Course;
import CoreJava.Models.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CourseDAO {
	
final String currPath = System.getProperty("user.dir");
final String location = currPath +  "\\Courses.csv";
	
    public List<Course> getAllCourses(){
    	

    	List<Course> courses = new ArrayList<Course>();


    	try {
    		File file = new File(location);
			Scanner scan = new Scanner(file);

			while(scan.hasNextLine())
			{
			String s[] = scan.nextLine().split(",");
			courses.add(new Course(Integer.parseInt(s[0]),s[1],s[2]));
			}
			
			scan.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found in " + this.getClass().getName() );
		}
    	
    	 catch (Exception e) {
 			System.out.println("Error in " + this.getClass().getName() );
 		}
    	

    	return courses;
    	
    }
}
