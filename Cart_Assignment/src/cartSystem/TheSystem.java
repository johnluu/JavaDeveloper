package cartSystem;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class TheSystem {
    private HashMap<String, Item> itemCollection;
    
    
    
    protected TheSystem() throws FileNotFoundException {
    	BufferedReader reader = new BufferedReader(new FileReader(System.getProperty("user.dir"  )+ "//sample.txt"));
    	
        itemCollection = new HashMap<String, Item>();
        //Fill the code here
        if(getClass().getSimpleName().equals("AppSystem"))
			try {
				String line;
				while((line = reader.readLine()) != null)
				{
					String[] lines = line.split("  ");
					System.out.println(lines[0] + " " + lines[1] + " " + lines[2] + " " + lines[3]);
					itemCollection.put(lines[0], new Item(lines[0], lines[1] , Double.parseDouble(lines[2]) , Integer.parseInt(lines[3])));
					
				}
			} 
        catch (IOException e) {
				
				e.printStackTrace();
			}
    }
    
    public HashMap<String, Item> getItemCollection(){
    	HashMap<String, Item> newMap = new HashMap<String,Item>(this.itemCollection);
    	return newMap;
    }
    
    
    public Boolean checkAvailability(Item item, Integer current) {

    	
    		if(current > itemCollection.get(item.getItemName()).getAvailableQuatity())
    			{System.out.println("System is unable to add "  + item.getQuatity() +  " "  + item.getItemName()+ "]\r\n"
    					+ "System can only add " + item.getAvailableQuatity() +" " + item.getItemName());
    			
    			return false;
    			}
    		else
    			return true;
    		
    		
      }
    
    public Boolean add(Item item) {

    	if(item == null)
    	{
    		System.out.println("ITEM DOESN'T EXIST");
    		return false;
    	}
    	if(itemCollection.containsKey(item.getItemName()))
    	{
    		if(checkAvailability(item , this.itemCollection.get(item.getItemName()).getQuatity() + 1))
    		this.itemCollection.get(item.getItemName()).setQuatity(this.itemCollection.get(item.getItemName()).getQuatity() + item.getQuatity());
    		return true;	
    	}
    	else
    	{	
    		this.itemCollection.put(item.getItemName(),item);
    	}	
    	
    	return false;
    }
    
    public Item remove(String itemName) {
    	
    	if(this.itemCollection.containsKey(itemName))
    	{Item item = this.itemCollection.get(itemName);
        this.itemCollection.remove(itemName);
        return item;
    	}
    	else
    	return null;
    	}

    public void setItemCollection(HashMap<String, Item> cols) {
    
    	this.itemCollection = cols;
    	return;
    	
    }
    
}
