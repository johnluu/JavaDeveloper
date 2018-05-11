package qofd.Dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import qofd.Models.User;
import qofd.SystemInterfaces.UserDAOI;
import qofd.Utils.OracleQueries;

public class UserDAO implements UserDAOI{

	@Override
	public boolean registerUser(String email, String password, String fname, String lname) {

		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;
		int success = 0;

		try {
			conn = OracleConnection.getConnection();
			stmt = conn.prepareStatement(OracleQueries.REGISTERUSER);
			stmt.setString(1, email);
			stmt.setString(2, password);
			stmt.setString(3, fname);
			stmt.setString(4, lname);
			success = stmt.executeUpdate();
			
		} catch (ClassNotFoundException | IOException | SQLException e) {

			e.printStackTrace();
		}

		return success>0;
	}

	@Override
	public boolean loginUser(String email, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User getUser(int userid) {

		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;
		User user = null;
		
		try {
			conn = OracleConnection.getConnection();
			stmt = conn.prepareStatement(OracleQueries.GETUSER);
			stmt.setInt(1, userid);
			result = stmt.executeQuery();
			
			if(result.next())
				user = new User(result.getInt(1),result.getString(2),result.getString(3),result.getString(4),result.getString(5));
			
		} catch (ClassNotFoundException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return user;
	}

}
