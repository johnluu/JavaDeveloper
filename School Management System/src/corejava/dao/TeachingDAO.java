package corejava.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import corejava.models.Instructor;
import corejava.models.Student;
import corejava.models.Teaching;
import corejava.systemsinterfaces.TeachingDAOI;
import corejava.utils.OracleQueries;

public class TeachingDAO implements TeachingDAOI{

	@Override
	public int registerInstructorToCourse(int course_id, int instructor_id) {

		Connection conn = null;
		PreparedStatement stmt = null;
		int result = 0;
		
		try {
			conn = OracleConnection.getConnection();
			stmt = conn.prepareStatement(OracleQueries.REGISTERINSTRUCTORTOCOURSE);
			stmt.setInt(1, course_id);
			stmt.setInt(2, instructor_id);
			result = stmt.executeUpdate();
			
	
			
		} catch (ClassNotFoundException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}

	@Override
	public List<Teaching> getInstructorsCourses() {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;
		List<Teaching> teachingList = new ArrayList<Teaching>();
		
		try {
			conn = OracleConnection.getConnection();
			stmt = conn.prepareStatement(OracleQueries.GETINSTRUCTORCOURSES);
			result = stmt.executeQuery();
			
			while(result.next())
			{
				teachingList.add(new Teaching(result.getString(1),result.getDouble(2),result.getString(3),result.getString(4)));
				
			}
			
			
			
		} catch (ClassNotFoundException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

		return teachingList;
		
	}

}
