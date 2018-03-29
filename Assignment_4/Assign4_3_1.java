import java.util.Arrays;

public class Assign4_3_1 {

	public static void main(String[] args)
	{
		
		int[] array = new int[10];
		
		
		for(int i = 0; i < array.length; i++)
			
		
			array[i] = (int) (Math.random()*100 + 1);
		
		
		int[] copy = array.clone();
		
		
		
		System.out.print("Array {" );
		for(int i = 0; i < array.length; i++)
		{
			System.out.print(array[i] + " ");
		}
			System.out.println("}");
		
		System.out.print("Copy {" );
		for(int i = 0; i < copy.length; i++)
		{
			System.out.print(copy[i] + " ");
		}
			System.out.println("}");		
			
	}
}
