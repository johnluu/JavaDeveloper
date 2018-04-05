package CoreJava.DAO;

import CoreJava.Models.Attending;
import CoreJava.Models.Course;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AttendingDAO {

final String currPath = System.getProperty("user.dir");
final String location = currPath +  "\\Attending.csv";
final File file = new File(location);
	
    public List<Attending> getAttending(){



    	List<Attending> attending = new ArrayList<Attending>();

    	try {

			Scanner scan = new Scanner(file);

			while(scan.hasNextLine())
			{
			String s[] = scan.nextLine().split(",");
			attending.add(new Attending(Integer.parseInt(s[0]), s[1]));
			}
			
			scan.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found in " + this.getClass().getName() );
		}
    	
    	 catch (Exception e) {
 			System.out.println("Error in " + this.getClass().getName() );
 		}
    	

    	return attending;
    		
    	
    }

    public void registerStudentToCourse(List<Attending> attending, String studentEmail, int courseID){

    	for(Attending a:attending)
    	{	
    		if(a.getCourseID() == courseID && a.getStudentEmail().equals(studentEmail))
    		{System.out.println("Already taking this course");
    		return;
    		}
    	}
    	
    	System.out.println("Registering for the course");
    	attending.add(new Attending(courseID, studentEmail));
    	saveAttending(attending);
    	return;
    			
    }

    public List<Course> getStudentCourses(List<Course> courseList, List<Attending> attending, String studentEmail){
    	List<Course> studentCourse = new ArrayList<Course>();
    	List<Integer> StudentCourseID = new ArrayList<Integer>();
    	
    	for(Attending a: attending)
    		if(a.getStudentEmail().equals(studentEmail))
    			StudentCourseID.add((a.getCourseID()));
    	
    	for(Integer s: StudentCourseID)
    		for(Course c:courseList)
    			if(s == c.getID())
    				studentCourse.add(c);
    	
    	
    	
    	return studentCourse;
    	
    }

    public void saveAttending(List<Attending> attending){

    	try {
			FileWriter writer = new FileWriter(file, false);
			for(Attending a: attending)
			{
				writer.write(a.getCourseID() + "," + a.getStudentEmail() + "\r\n");
			}
			
			writer.close();
		} catch (IOException e)  {
			System.out.println("File not found in " + this.getClass().getName() );
		}
    	
    	 catch (Exception e) {
 			System.out.println("Error in " + this.getClass().getName() );
 		}
    	
    	return;
    }

}
