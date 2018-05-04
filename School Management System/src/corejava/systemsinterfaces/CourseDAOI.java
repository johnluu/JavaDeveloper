package corejava.systemsinterfaces;

import java.util.List;

import corejava.models.Course;

public interface CourseDAOI {

	public List<Course> getAllCourses();
	public List<Course> getCourseByInstructor(int instructor_id);
	
}
