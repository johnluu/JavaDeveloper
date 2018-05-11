package qofd.Dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import qofd.SystemInterfaces.UserWatchingDAOI;
import qofd.Utils.OracleQueries;

public class UserWatchingDAO implements UserWatchingDAOI {

	@Override
	public boolean watch(boolean iswatching, int userid, int questionid) {
		
		Connection conn = null;
		PreparedStatement stmt = null;
		PreparedStatement stmt2 = null;
		
		int result = 0;
		String query;
		String query2;
		
		if(iswatching)
		{
			query = OracleQueries.UNWATCHQUESTION;
			query2 = OracleQueries.DECWATCH;
		}
		else
		{
			query = OracleQueries.WATCHQUESTION;
			query2 = OracleQueries.INCWATCH;
		
		}
		try {
			conn = OracleConnection.getConnection();
			stmt = conn.prepareStatement(query);
			stmt2 = conn.prepareStatement(query2);
			
			stmt.setInt(1, userid);
			stmt.setInt(2, questionid);
			stmt2.setInt(1, questionid);
			
			result = stmt.executeUpdate();
			stmt2.executeUpdate();
			
		} catch (ClassNotFoundException | IOException | SQLException e) {
			e.printStackTrace();
		}
		
		return result > 0;
	}

	@Override
	public boolean istWatching(int userid, int questionid) {
			
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;
		boolean isWatching = false;
		
		try {
			conn = OracleConnection.getConnection();
			stmt = conn.prepareStatement(OracleQueries.ISWATCHING);
			stmt.setInt(1, userid);
			stmt.setInt(2, questionid);
			result = stmt.executeQuery();
			
			if(result.next())
				isWatching = true;
			
		} catch (ClassNotFoundException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
		return isWatching;
	}

}
