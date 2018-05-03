package jd.model;

public class Item {

	private Integer item_id;
	private String item_name;
	private Integer quantity_in_stock;
	private double item_price;
	
	
	public Item() {}
	public Item(String name,int stock, double price) {
		this.item_name = name;
		this.quantity_in_stock = stock;
		this.item_price = price;
}
	
	public Item(Integer item_id, String name,int stock, double price) {
		this.item_id = item_id;
		this.item_name = name;
		this.quantity_in_stock = stock;
		this.item_price = price;
	
}
	public Integer getItem_id() {
		return item_id;
	}
	public void setItem_id(Integer item_id) {
		this.item_id = item_id;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public Integer getQuantity_in_stock() {
		return quantity_in_stock;
	}
	public void setQuantity_in_stock(Integer quantity_in_stock) {
		this.quantity_in_stock = quantity_in_stock;
	}
	public double getItem_price() {
		return item_price;
	}
	public void setItem_price(double item_price) {
		this.item_price = item_price;
	}
}