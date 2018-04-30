package itemsDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class itemDao {

	
public Item getItemById(int id) throws SQLException, ClassNotFoundException
{
	
	Class.forName("oracle.jdbc.driver.OracleDriver");
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String username = "john";
	String password = "password";
	Connection conn = DriverManager.getConnection(url, username, password);


	String selector = "SELECT * FROM ITEM_TABLE "
			+ "where ITEM_ID = ?" ;
	PreparedStatement stmt = conn.prepareStatement(selector);
	stmt.setInt(1, id);
	ResultSet result = stmt.executeQuery();
	
	Item item = null;
	
	if(result != null && result.next()) {
//		System.out.println("item ID : " + result.getInt(1));
//		System.out.println("item name: " +result.getString(2));
//		System.out.println("quantity: " + result.getInt(3));
//		System.out.println("price : " + result.getDouble(4));
		item = new Item( result.getInt(1),result.getString(2),result.getInt(3),result.getDouble(4));
	}
	
	return item;
}

public List<Item> getItemsCostingGreaterThan(double price) throws SQLException, ClassNotFoundException
{
	
	Class.forName("oracle.jdbc.driver.OracleDriver");
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String username = "john";
	String password = "password";
	Connection conn = DriverManager.getConnection(url, username, password);


	String selector = "SELECT * FROM ITEM_TABLE "
			+ "where PRICE >= ?" ;
	PreparedStatement stmt = conn.prepareStatement(selector);
	stmt.setDouble(1, price);
	ResultSet result = stmt.executeQuery();
	
	List<Item> itemList = new ArrayList<Item>();
	
	while(result != null && result.next()) {
//		System.out.println("item ID : " + result.getInt(1));
//		System.out.println("item name: " +result.getString(2));
//		System.out.println("quantity: " + result.getInt(3));
//		System.out.println("price : " + result.getDouble(4));
		itemList.add(new Item( result.getInt(1),result.getString(2),result.getInt(3),result.getDouble(4)));
	}
	
	return itemList;
}
	

public List<Item> getItemsinStock() throws SQLException, ClassNotFoundException
{
	
	Class.forName("oracle.jdbc.driver.OracleDriver");
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String username = "john";
	String password = "password";
	Connection conn = DriverManager.getConnection(url, username, password);


	String selector = "SELECT * FROM ITEM_TABLE "
			+ "where QUANTITY_IN_STOCK > 0" ;
	PreparedStatement stmt = conn.prepareStatement(selector);
	ResultSet result = stmt.executeQuery();
	
	List<Item> itemList = new ArrayList<Item>();
	
	while(result != null && result.next()) {
//		System.out.println("item ID : " + result.getInt(1));
//		System.out.println("item name: " +result.getString(2));
//		System.out.println("quantity: " + result.getInt(3));
//		System.out.println("price : " + result.getDouble(4));
		itemList.add(new Item( result.getInt(1),result.getString(2),result.getInt(3),result.getDouble(4)));
	}
	
	return itemList;
}



}
