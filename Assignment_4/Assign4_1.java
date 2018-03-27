import java.util.Scanner;

public class Assign4_1{


	
	public static void main(String[] args) {
	
		int people = 1;
		int cat = 1;
		int dogs = 1;
		
		//Checks if people is less than cat
		if(people < cat)
		//Prints statement if case was true
			System.out.println("Too many cats! The world is doomed");
		if (people > cat)
		//Does this if case was not true
			System.out.println("Too few cats! The world is saved for another day!");	
		
		//Check if people is less than dog
		if(people < dogs)
		//Prints statement if case was true
			System.out.println("The world is drooled on!");
		if (people > dogs)
		//Does this if case was not true
			System.out.println("The world is dry!");	
		
		
		
		
	}

	
}