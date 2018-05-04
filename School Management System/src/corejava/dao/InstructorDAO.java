package corejava.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import corejava.models.Instructor;
import corejava.systemsinterfaces.InstructorDAOI;
import corejava.utils.OracleQueries;

public class InstructorDAO implements InstructorDAOI {

	@Override
	public List<Instructor> getAllInstructors() {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;
		List<Instructor> instructorList = new ArrayList<Instructor>();
		
		try {
			conn = OracleConnection.getConnection();
			stmt = conn.prepareStatement(OracleQueries.GETALLINSTRUCTOR);
			result = stmt.executeQuery();
			
			while(result.next())
			{
				instructorList.add(new Instructor(result.getInt(1),result.getString(2),result.getString(3),result.getString(4),result.getInt(5),result.getString(6)));
				
			}
			
			
			
		} catch (ClassNotFoundException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

		return instructorList;
	}

	@Override
	public Instructor getInstructorByGmail(String email) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;
		Instructor i = null;
		
		
		try {
			conn = OracleConnection.getConnection();
			stmt = conn.prepareStatement(OracleQueries.GETINSTRUCTORBYGMAIL);
			stmt.setString(1, email);
			result = stmt.executeQuery();
			
			if(result.next())
			{
				i = new Instructor(result.getInt(1),result.getString(2),result.getString(3),result.getString(4),result.getInt(5),result.getString(6));
						
			}
		} catch (ClassNotFoundException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return i;
	}

	public String validateUser(Instructor ins, String password) {
		{
			if(! ins.getPass().equals(password))
				return "Wrong Credentials";
			
			else
			{
				if(ins.getInstructor_role() == 1)
					return "Admin";
					else 
						return "Instructor";
			}
			
			
		}
	}
	
	
	
}
