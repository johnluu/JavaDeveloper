package cartSystem;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

public class CartSystem extends TheSystem{
    public CartSystem() throws FileNotFoundException {
    }
    public void display() {

    	double subtotal = 0;
    	
    		System.out.println("Current cart");
    	for(String key:this.getItemCollection().keySet())
    	{
    		subtotal += this.getItemCollection().get(key).getQuatity() * this.getItemCollection().get(key).getItemPrice();
    		System.out.println(this.getItemCollection().get(key).getQuatity() + " " + key);
    	}
    		System.out.println("Subtotal: " + subtotal);
    		System.out.println("Tax: " + Math.round((.05 * subtotal*100.0))/100.0);
    		System.out.println("Total " + Math.round((1.05 * subtotal*100.0))/100.0);
    		
    }
}
