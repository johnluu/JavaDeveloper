package jd.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jd.model.Item;
import jd.utils.OracleQueries;

public class ItemDao {

	public List<Item> getAllItems() throws SQLException{
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;
		List<Item> itemList = new ArrayList<Item>();
		
		try {
			conn = OracleConnection.getConnection();
			stmt = conn.prepareStatement(OracleQueries.GETALLAVAILABLEITEM);
			result = stmt.executeQuery();
			while(result != null && result.next()) {
				itemList.add(new Item(result.getInt(1), result.getString(2),result.getInt(3),result.getDouble(4)));
			}
			
			
		} catch (ClassNotFoundException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			result.close();
		if(stmt != null) 
		{
			stmt.close();
		}
		if(conn != null)
		{
			conn.close();
		}
	}
		
		
		return itemList;
	}
	
	public boolean updateQuantity(int item_id, int quantity) throws SQLException{
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;
		String col[] = {"ITEM_ID"};
		int success = 0;
		
		try {
			conn = OracleConnection.getConnection();
			stmt = conn.prepareStatement(OracleQueries.UPDATEITEMQUANTITY,col);
			stmt.setInt(1, quantity);
			stmt.setInt(2, item_id);
			success = stmt.executeUpdate();
			
		
			
			
		} catch (ClassNotFoundException | IOException | SQLException e) {
			// TODO Auto-generated catch block
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
