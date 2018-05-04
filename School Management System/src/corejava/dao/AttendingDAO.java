package corejava.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import corejava.customexceptions.StudentRegistrationException;
import corejava.models.Attending;
import corejava.models.Course;
import corejava.models.Instructor;
import corejava.models.Student;
import corejava.systemsinterfaces.AttendingDAOI;
import corejava.utils.OracleQueries;

public class AttendingDAO implements AttendingDAOI{

	@Override
	public int registerStudentToCourse(Student student, Course course) {
		Connection conn = null;
		PreparedStatement stmt = null;
		int result = 0;
		String[] Col = {"GPA"}; 
		
		
		try {
			if(student.getGpa() < course.getMinimum_gpa())
				throw new StudentRegistrationException("Did not meet the minimum GPA requirement");
			else
			{
			conn = OracleConnection.getConnection();
			stmt = conn.prepareStatement(OracleQueries.REGISTERSTUDENTOCOURSE);
			stmt.setInt(1, course.getCourse_id());
			stmt.setInt(2, student.getStudent_id());
			result = stmt.executeUpdate();
			}
	}
		catch (ClassNotFoundException | IOException | SQLException | StudentRegistrationException e) {
			e.printStackTrace();
		}

		return result;
	}

	@Override
	public List<Attending> getStudentCourse(int student_id) {
		
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;
		List<Attending> attendingList = new ArrayList<Attending>();
		
		
		try {
			conn = OracleConnection.getConnection();
			stmt = conn.prepareStatement(OracleQueries.GETSTUDENTCOURSE);
			stmt.setInt(1, student_id);
			result = stmt.executeQuery();
			while(result.next())
			{
				attendingList.add(new Attending(result.getString(1),result.getString(2),result.getString(3)));
						
			}
		} catch (ClassNotFoundException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

		
		return attendingList;
	}

}
