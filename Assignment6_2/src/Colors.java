import java.util.HashMap;

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
/////////////////////////////////////////
		//////////////////////////////////
		
		map.put(1 , "Brown");
		
		
		System.out.println("Keys");
		for(Integer num: map.keySet())
			System.out.print(num + " ");
		System.out.println();
		
		System.out.println("Values");
		for(String key: map.values())
			System.out.print(key + " ");
		System.out.println();
		
		Object values;
		Object keys;
		map.forEach((k,v) ->
		{
			System.out.println("Item "+ k + " = " +v);
			
		});
		
	}
}
