package jd.utils;

public class OracleQueries {

	public final static String GETCUSTOMERBYID = "SELECT * FROM CUSTOMER "
			+ "WHERE CUSTOMER_ID= ?";
	
	public final static String SAVECUSTOMER = "INSERT INTO CUSTOMER "
			+ "(CUSTOMER_EMAIL, CUSTOMER_FNAME, CUSTOMER_LNAME) "
			+ "VALUES(?,?,?)";
	
	public final static String DELETECUSTOMER = "DELETE FROM CUSTOMER "
			+ "WHERE CUSTOMER_ID = ?";
	
	public final static String GETALLITEMS = "SELECT * FROM ITEM_TABLE ";
	
	public final static String SAVEITEM = "INSERT INTO ITEM_TABLE "
			+ "(ITEM_NAME, QUANTITY_IN_STOCK, PRICE) "
			+ "VALUES(?,?,?)";
	
	public final static String DELETEITEM = "DELETE FROM ITEM_TABLE "
			+ "WHERE ITEM_ID = ?";
	
}
