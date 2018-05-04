package corejava.systemsinterfaces;

import java.util.List;

import corejava.models.Teaching;

public interface TeachingDAOI {

	public int registerInstructorToCourse(int course_id, int instructor_id);
	public List<Teaching> getInstructorsCourses();
}
