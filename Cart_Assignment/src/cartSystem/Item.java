package cartSystem;

public class Item{
    private String itemName;
    private String itemDesc;
    private Double itemPrice;
    private Integer quatity;
    private Integer availableQuatity;
    /**
     * @return the itemName
     */
  //Fill the code here

    public Item() {
    	
    	this.quatity = 1;
		
	}
    
    public Item(String itemName,String itemDesc, Double itemPrice, Integer quatity) {
    	
    	this.itemName = itemName;
    	this.itemDesc = itemDesc;
    	this.itemPrice = itemPrice;
    	this.quatity = 1;
    	this.availableQuatity = quatity;
	}

	public String getItemName() {
		return this.itemName;
	}
	
	public Double getItemPrice() {
		return itemPrice;
	}
	
	public String getItemDesc() {
		return itemDesc;
	}
	
	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
		
	}
	
	public void setItemPrice(Double itemPrice) {
		this.itemPrice = itemPrice;
		
	}
	
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Integer getQuatity() {
		return quatity;
	}
	public void setQuatity(Integer quatity) {
		this.quatity = quatity;
	}
	public Integer getAvailableQuatity() {
		return availableQuatity;
	}
	public void setAvailableQuatity(Integer availableQuatity) {
		this.availableQuatity = availableQuatity;
	}




    
}
