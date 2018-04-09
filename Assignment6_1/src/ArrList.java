import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrList {

		
	public static ArrayList<String> createArray(String ... s){
		
		ArrayList<String> arr = new ArrayList<String>();
		
		for(String c:s)
			arr.add(c);	
		return arr;
		
	}
	
	
	public static void iterate(ArrayList<String> arr){
		

		for(int i = 0; i < arr.size() ; i ++)
			System.out.println("Today's Color is " + arr.get(i));
	}
		

	public static void update(int pos, String text, ArrayList<String> arr){
		

		arr.set(4, text);

	}
	
	
	public static void removeItem(int pos,ArrayList<String> arr ) {
		
		arr.remove(pos);
		
		return;
	}
	
	public static int searchArr(String s,ArrayList<String> arr ) {
		
		for(int i = 0; i < arr.size(); i++)
			if(arr.get(i).equals(s))
				return i;
			
		
		return -1;
	}
	
	
	public static void sortArr(ArrayList<String> arr ) {
		
		Collections.sort(arr);
		return;
		
	}

	public static void reverse(ArrayList<String> arr) {
		

		
		Collections.reverse(arr);
		
		return;
	}
	
	public static ArrayList<String> copyArr(ArrayList<String> arr, ArrayList<String> copyarr) {
		
		for(String s: arr)
			copyarr.add(s);
		
		
		return copyarr;
	}

	
	public static ArrayList<String> compare(ArrayList<String> arr1, ArrayList<String> arr2) {
		
		ArrayList<String> arr3 = new ArrayList<String>();
		
		for(String s: arr2)
			if(arr1.contains(s))
				arr3.add(s);
		
		
		return arr3;
	}

	
	public static void append(ArrayList<String> arr1, ArrayList<String> arr2) {
		
		

				
		
		arr1.addAll(arr2);
				
		
		
		return;
	}
	


	public static void loop(ArrayList<String> arr){
		

		for(String s:arr)
			System.out.println(s);
	}
		


		
	public static ArrayList<String> ArraytoList(String[] arr){
		
		ArrayList<String> arrList = new ArrayList<String>();
		
		for(String s: arr)
			arrList.add(s);

		return arrList;
	}
		

	

	
	

}
	
