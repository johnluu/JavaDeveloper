package jd.model;

public class Order {
	
	
	private Integer id;
	private Integer Item_id;
	private Integer Quantity;
	
	public Order() {}
	
	public Order(Integer id, Integer item_id, Integer quantity) {
		super();
		this.id = id;
		Item_id = item_id;
		Quantity = quantity;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getItem_id() {
		return Item_id;
	}
	public void setItem_id(Integer item_id) {
		Item_id = item_id;
	}
	public Integer getQuantity() {
		return Quantity;
	}
	public void setQuantity(Integer quantity) {
		Quantity = quantity;
	}

	
	
	
}
