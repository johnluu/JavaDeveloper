import java.util.ArrayList;

public class testCase {

	public static void main(String[] args) {
		
		///////Question 1 and 2///////////
		////////////////////////////////////		
		System.out.println("Create and Iterate List");
		ArrayList<String> arr =ArrList.createArray("Red","Green","Orange","White","Black");
		ArrList.iterate(arr);
		System.out.println();

		///////Question 3///////////
		/////////////////////////////////////		
		System.out.println("Updating an List");
		ArrList.update(4, "Magenta", arr);
		ArrList.iterate(arr);
		System.out.println();
	
		///////Question 4///////////
		/////////////////////////////////////
		System.out.println("Removing an Item");
		ArrList.removeItem(3, arr);
		ArrList.iterate(arr);
		System.out.println();
		
		///////Question 5///////////
		////////////////////////////////////		
		System.out.println("Searching an item");
		int position = ArrList.searchArr("Green", arr);
		System.out.println("The position was found in List[" + position + "]");
		System.out.println();
		
		///////Question 6///////////
		/////////////////////////////////////
		System.out.println("Sorting Array");
		ArrList.sortArr(arr);
		ArrList.iterate(arr);
		System.out.println();
	
		
		///////Question 7///////////
		////////////////////////////////////////////
		System.out.println("Reverse");
		ArrList.reverse(arr);
		ArrList.iterate(arr);
		System.out.println();



		///////Question 8///////////
		////////////////////////////////////////////
		System.out.println("Copying");
		ArrayList<String> copyarr = new ArrayList<String>();
		ArrList.copyArr(arr, copyarr);
		ArrList.iterate(copyarr);
		System.out.println();


		///////Question 9///////////
		////////////////////////////////////////////
		System.out.println("Compare");
		copyarr.remove(2); //Removing Magenta
		ArrayList<String> compareArr = ArrList.compare(arr,copyarr);
		ArrList.iterate(compareArr);
		System.out.println();


		///////Question 10///////////
		////////////////////////////////////////////
		System.out.println("Appending");
		ArrayList<String> arr2 = ArrList.createArray("Black","Chocolate","Brown");
		ArrList.append(arr,arr2);
		ArrList.iterate(arr);
		System.out.println();
		

		
		
		///////Question 11 and 12///////////
		////////////////////////////////////////////
		System.out.println("Converting");
		String[] array = {"Cows","Chickens","Sheeps"};
		ArrayList<String> arr3 = ArrList.ArraytoList(array);
		ArrList.loop(arr3);
		System.out.println();
		
		
	
}

}