package corejava.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import corejava.models.Student;
import corejava.systemsinterfaces.StudentDAOI;
import corejava.utils.OracleQueries;

public class StudentDAO implements StudentDAOI{

	public Student getStudentByGmail(String email) {
		
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;
		Student student = null;
		
		
		try {
			conn = OracleConnection.getConnection();
			stmt = conn.prepareStatement(OracleQueries.GETSTUDENTBYGMAIL);
			stmt.setString(1, email);
			result = stmt.executeQuery();
			
			if(result.next())
			{
				student = new Student(result.getInt(1), result.getString(2),result.getString(3),result.getDouble(4),result.getString(5),result.getInt(6));
			}
			
		} catch (ClassNotFoundException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return student;
	}
	
	public boolean validateUser(String passToValidate, String comparablePas) {
		return passToValidate.equals(comparablePas);
	}
	
}
