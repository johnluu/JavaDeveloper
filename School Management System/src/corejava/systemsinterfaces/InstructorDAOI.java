package corejava.systemsinterfaces;

import java.util.List;

import corejava.models.Instructor;

public interface InstructorDAOI {

	public List<Instructor> getAllInstructors();
	public Instructor getInstructorByGmail(String email);
}
