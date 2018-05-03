package jd.utils;

public class OracleQueries {

	public final static String GETALLAVAILABLEITEM = "SELECT * FROM ITEM_TABLE "
			+ "WHERE QUANTITY_IN_STOCK > 0 ORDER BY ITEM_ID ASC";
	
	public final static String UPDATEITEMQUANTITY= "UPDATE ITEM_TABLE "
			+ "SET QUANTITY_IN_STOCK = QUANTITY_IN_STOCK - ? WHERE ITEM_ID = ?";
	
	public final static String CREATEORDER = "INSERT INTO ORDER_TABLE "
			+ "(ITEM_ID, QUANTITY) "
			+ "VALUES(?,?)";
}
