package corejava.mainentrypoint;

import java.util.List;

import corejava.dao.AttendingDAO;
import corejava.dao.CourseDAO;
import corejava.dao.InstructorDAO;
import corejava.dao.StudentDAO;
import corejava.dao.TeachingDAO;
import corejava.models.Attending;
import corejava.models.Course;
import corejava.models.Instructor;
import corejava.models.Student;
import corejava.models.Teaching;

public class MainTest {
	public static void main(String[] args)
	{
		
		StudentDAO SD = new StudentDAO();
		InstructorDAO iDAO = new InstructorDAO();
		CourseDAO cDAO = new CourseDAO();
		AttendingDAO aDAO = new AttendingDAO();
		TeachingDAO tDAO = new TeachingDAO();
		Student s;
		Instructor i;
		List<Instructor> iList;
		List<Course> cList;
		List<Teaching> tList;
		List<Attending> aList;

		
//		s = SD.getStudentByGmail("b@gmail.com");
//		System.out.println(s.getEmail());
//		
//		i = iDAO.getInstructorByGmail("luke@gmail.com");
//		System.out.println(i.getEmail());
//	
//		iList = iDAO.getAllInstructors();
//		
//		for(Instructor ins: iList)
//		System.out.println(ins.getEmail());

//		cList = cDAO.getCourseByInstructor(2);
//		for(Course course: cList)
//			System.out.println(course.getCourse_name());
//		
		

		
//		Student COW = SD.getStudentByGmail("b@gmail.com");
//		Course CO = new Course(3,"Science",3.2);
//			
//		
//		aDAO.registerStudentToCourse(COW, CO);
//		
//
		aList = aDAO.getStudentCourse(3);
//		
		for(Attending a: aList)
			System.out.println(a.getCourse_name());
//		
	}
}
