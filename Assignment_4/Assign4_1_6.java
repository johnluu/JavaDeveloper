import java.util.Scanner;

public class Assign4_1_6 {

	
	public static void main(String[] args)
	{
	
	
	Scanner scan = new Scanner(System.in);
		
		
	
		System.out.println("Please enter a Weight:");
		double weight = scan.nextInt();
		scan.nextLine();
		
		System.out.println("I have information for the following planets: \n"
				+ "1. Venus \n"
				+ "2. Mars \n"
				+ "3. Jupiter \n"
				+ "4. Saturn \n"
				+ "5. Uranus \n"
				+ "6. Neptune \n"
				);		
		int planet = scan.nextInt();
		
		switch(planet) {
		case 1:
			weight *= 0.78; 
			break;
		case 2:
			weight *= 0.39;
			break;
		case 3:
			weight *= 2.65;
			break;
		case 4:
			weight *= 1.17;
			break;
		case 5:
			weight *= 1.05;
			break;
		case 6:
			weight *= 1.23;
			break;
		default:
			System.out.println("Please enter a valid planet");
			break;
		
	
		}
		
		System.out.println("Your weight would be " + weight + " on this planet.");
		return;
	}
}
