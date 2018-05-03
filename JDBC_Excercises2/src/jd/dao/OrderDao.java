package jd.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import jd.model.Item;
import jd.utils.OracleQueries;

public class OrderDao {

	
	public boolean createOrder(Map<Integer,Integer> map) throws SQLException{
		Connection conn = null;
		PreparedStatement stmt = null;
		String col[] = {"ORDER_ID"};
		int success = 0;
		
		
		try {
			conn = OracleConnection.getConnection();
			stmt = conn.prepareStatement(OracleQueries.CREATEORDER,col);
			 	
			for(Map.Entry<Integer, Integer>entry: map.entrySet())
				{
				stmt.setInt(1, entry.getKey());
				stmt.setInt(2, entry.getValue());
				success = stmt.executeUpdate();
				};
				
				
				

				
			
		} catch (ClassNotFoundException | IOException | SQLException e) {
			e.printStackTrace();
		} finally {

		if(stmt != null) 
		{
			stmt.close();
		}
		if(conn != null)
		{
			conn.close();
		}
	}
		
		
		return success>0;
	}
}
