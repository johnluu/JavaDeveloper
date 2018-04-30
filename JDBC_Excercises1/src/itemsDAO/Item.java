package itemsDAO;

public class Item {

	private int item_ID;
	private String item_Name;
	private int quantity_In_Stock;
	private double price;
	
	Item(int id, String name, int quantity, double price){
		this.item_ID = id;
		this.item_Name = name;
		this.quantity_In_Stock = quantity;
		this.price = price;
	}
	
	Item(){};
	
	public int getItem_ID() {
		return item_ID;
	}
	public void setItem_ID(int item_ID) {
		this.item_ID = item_ID;
	}
	public String getItem_Name() {
		return item_Name;
	}
	public void setItem_Name(String item_Name) {
		this.item_Name = item_Name;
	}
	public int getQuantity_In_Stock() {
		return quantity_In_Stock;
	}
	public void setQuantity_In_Stock(int quantity_In_Stock) {
		this.quantity_In_Stock = quantity_In_Stock;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

}
