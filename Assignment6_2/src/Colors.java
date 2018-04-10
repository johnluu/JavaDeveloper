import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Colors {

	public static void main(String[] args)
	{
		
		HashMap<Integer, String> map = new HashMap<Integer , String>();
		map.put(0, "Blue");
		map.put(3, "Black");
		map.put(4 , "Green");
		map.put(2 , "Red");
		map.put(1 , "Orange");
		
		
		System.out.println("Keys");
		for(Integer num: map.keySet())
			System.out.print(num + " ");
		System.out.println();
		
		System.out.println("Values");
		for(String key: map.values())
			System.out.print(key + " ");
		System.out.println();
		////////////////////////////////

		map.put(1 , "Brown");
		//////////The value for key 1 was overwritten because it can only store one value
		
		
		System.out.println("Keys");
		for(Integer num: map.keySet())
			System.out.print(num + " ");
		System.out.println();
		
		System.out.println("Values");
		for(String key: map.values())
			System.out.print(key + " ");
		System.out.println();

		
		System.out.println("Iterating");
		Iterator<Map.Entry<Integer,String >> itr = map.entrySet().iterator();
		
		while(itr.hasNext())
		{	Map.Entry<Integer, String> entry = itr.next();
			System.out.println("Item" + entry.getKey() + " = " + entry.getValue());
		}
		
		System.out.println("For Each Loop");
		for(int key: map.keySet() )
			System.out.println("Item " + key + " "+ map.get(key));
		
		
		System.out.println("Built in for each");
		map.forEach((k,v) ->
		{
			System.out.println("Item "+ k + " = " +v);
			
		});
		
	}
}
