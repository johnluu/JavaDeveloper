package corejava.systemsinterfaces;

import java.util.List;

import corejava.models.Attending;
import corejava.models.Course;
import corejava.models.Student;

public interface AttendingDAOI {

	public int registerStudentToCourse(Student student,Course course);
	public List<Attending> getStudentCourse(int student_id);
	
}
