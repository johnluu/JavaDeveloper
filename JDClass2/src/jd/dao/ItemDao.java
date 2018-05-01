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
			stmt = conn.prepareStatement(OracleQueries.GETALLITEMS);
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
	
	public Integer addItem(Item i) throws SQLException {
		Integer ID = null;
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;
		String[] COL = {"item_id"};
		
		try {
			conn = OracleConnection.getConnection();
			stmt = conn.prepareStatement(OracleQueries.SAVEITEM, COL);
			stmt.setString(1, i.getItem_name());
			stmt.setInt(2, i.getQuantity_in_stock());
			stmt.setDouble(3, i.getItem_price());
			stmt.executeUpdate();
			result = stmt.getGeneratedKeys();
			
			if(result != null && result.next()) {
				ID = result.getInt(1);
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
		return ID;
	}
	
	public void delete(int id) throws SQLException {
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			conn = OracleConnection.getConnection();
			stmt = conn.prepareStatement(OracleQueries.DELETEITEM);
			stmt.setInt(1, id);
			stmt.executeUpdate();
			
			
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
		return;
	}
		
}
	

