import java.util.Arrays;
import java.util.LinkedList;

public class Assignment6_3_1 {

	public static void main(String[] args) {
		
		LinkedList<String> a = new LinkedList<String>();
		
		a.addAll(Arrays.asList("a" , "b" , "c" , "d" , "e"));
		System.out.println("Initial list");
		iterate(a);
		System.out.println();
		
		//Question1
		/////////////////////////////////////////
		System.out.println("Appending f to list");
		append(a, "f");
		System.out.println();
		//Question2
		/////////////////////////////////////////
		System.out.println("Iterating");
		iterate(a);
		System.out.println();
		//Question2
		/////////////////////////////////////////
		System.out.println("Iterating from pos 2");
		iteratePos(a,2);
		System.out.println();
		//Question4
		/////////////////////////////////////////
		System.out.println("Reverse Iterating");
		iterateRev(a);
		System.out.println();
		//Question5
		/////////////////////////////////////////
		System.out.println("Inserting into pos 2");
		insert(a,2,"HA");
		iterate(a);
		System.out.println();
		//Question6
		/////////////////////////////////////////
		System.out.println("Inserting F1 to first L1 to last");
		insertFirLas(a,"F1","L1");
		iterate(a);
		System.out.println();
		//Question7
		/////////////////////////////////////////
		System.out.println("Inserting F2 to first");
		insertFir(a,"F2");
		iterate(a);
		System.out.println();
		//Question8
		/////////////////////////////////////////
		System.out.println("Inserting L2 to Last");
		insertLas(a,"L2");
		iterate(a);
		System.out.println();
		//Question9
		/////////////////////////////////////////
		System.out.println("Inserting some elements into pos 3");
		insertItems(a,3,"item1" , "item2" , "item3" , "item1");
		iterate(a);
		//Question10
		////////////////////////////////////////
		System.out.println();
		System.out.println("First and Last occurence");
		getFirLas(a, "item1");
		System.out.println();
		//Question11
		////////////////////////////////////////
		System.out.println();
		System.out.println("Remove First and Last");
		remFirLast(a);
		iterate(a);
		System.out.println();
		//Question12
		////////////////////////////////////////
		System.out.println();
		System.out.println("RemoveAll");
		removeAll(a);
		iterate(a);
		System.out.println();
		//Question13
		////////////////////////////////////////
		System.out.println();
		System.out.println("Inseting some elements to array");
		insertItems(a,0,"item1" , "item2" , "item3" , "item4" ,"item5");
		iterate(a);
		System.out.println("Swapping elements at 0 and 3");
		swap(a,0,3);
		iterate(a);
		System.out.println();
		//Question14
		////////////////////////////////////////
		System.out.println("Converting to array");
		String[] arr = ListToArray(a);
		for(String s: arr)
		System.out.println(s);
		System.out.println();
		//Question15
		////////////////////////////////////////
		System.out.println("Checking empty");
		System.out.println(isEmpty(a));
		LinkedList<String> newarr = new LinkedList<String>();
		System.out.println(isEmpty(newarr));
		
		
	}
	
	
	
	public static void append(LinkedList<String> a,String b)
	{
		a.add(b);
		
		return;
	}
	
	public static void iterate(LinkedList<String> a)
	{
		for(int i = 0; i < a.size(); i++)
		{
			System.out.println("LinkedList[" + i + "] = "+ a.get(i));
			
		}
		
		return;
		
	}
	
	
	public static void iteratePos(LinkedList<String> a,int pos)
	{
		for(;  pos < a.size(); pos++)
		{
			System.out.println("LinkedList[" + pos + "] = "+ a.get(pos));			
		}
		
		return;
		
	}
	
	public static void iterateRev(LinkedList<String> a)
	{
		for(int i = a.size()-1; i >= 0 ; i--)
		{
			System.out.println("LinkedList[" + i + "] = "+ a.get(i));			
		}
		
		return;
		
	}
	
	public static void insert(LinkedList<String> a, int pos, String b)
	{
		a.add(pos, b);
		
		return;
	}
	
	public static void insertFirLas(LinkedList<String> a, String b, String c)
	{
		a.addFirst(b);
		a.add(c);
		
		return;
	}
	
	public static void insertFir(LinkedList<String> a, String b)
	{
		a.addFirst(b);
		return;
	}
	
	public static void insertLas(LinkedList<String> a, String b)
	{
		a.add(b);
		return;
	}
	
	public static void insertItems(LinkedList<String> a, int pos, String  ... b)
	{
		
		for(String s: b)
			insert(a,pos,s);
		
		return;
	}
	
	public static void getFirLas(LinkedList<String> a, String b)
	{
		LinkedList<Integer> arr = new LinkedList<Integer>();
		
		for(int i = 0; i < a.size(); i++)
		{
			if(a.get(i).equals(b))
				arr.add(i);
		}
		
		System.out.println(b + " First Element is "+ arr.getFirst());
		System.out.println(b + " Last element is "+ arr.getLast());
		return;
	}
	
	public static void remFirLast(LinkedList<String> a)
	{
		a.removeFirst();
		a.removeLast();
		
		return;
	}
	
	public static void removeAll(LinkedList<String> a)
	{
		a.removeAll(a);
		
		return;
	}
	
	public static void swap(LinkedList<String> a, int pos1, int pos2)
	{
		String temp = a.get(pos1);
		a.set(pos1, a.get(pos2));
		a.set(pos2, temp);
		
		return;
	}
	public static String[] ListToArray(LinkedList<String> a)
	{	
		
		return  a.toArray(new String[a.size()]);
	}
	
	public static boolean isEmpty(LinkedList<String> a)
	{	
		if(a.isEmpty())
			return true;
		else
			return false;
	}
}
