package cartSystem;

import java.io.FileNotFoundException;
import java.util.HashMap;

public class AppSystem extends TheSystem {
    protected AppSystem() throws FileNotFoundException {
    }
    public void display() {
        HashMap<String, Item> current = this.getItemCollection();

        current.forEach((k,item)->{
        	System.out.println("Item: " + k + "|  Desc:" + item.getItemDesc() + "|  Price:" + item.getItemPrice() + "|  Available:" + item.getAvailableQuatity() );
        	
        });
        
    }
    public Boolean add(Item item) {
    	
    	if(this.getItemCollection().containsKey(item.getItemName()))
    	{
    		System.out.println("Item [" + item.getItemName() +"] is already in the system");
    		return false;
    	}
    	else
    	{
      		
    		
    		HashMap<String, Item> newHash = this.getItemCollection();
    		newHash.put(item.getItemName(),item);
    		this.setItemCollection(newHash);
    		
    		
            this.getItemCollection().forEach((k,p)->{
            	System.out.println("Item: " + k + "|  Desc:" + p.getItemDesc() + "|  Price:" + item.getItemPrice());
            	
            });
    		
    		return true;    
    	}
    }
}
