import java.util.Scanner;

public class Assignment5_1_5 {
	
	
	
public static double area_circle(){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the radius of the circle ");
		double r = scan.nextInt();
		scan.nextLine();
		
		return (Math.PI * Math.pow(r, 2));
		
}
	
public static int area_rectangle(){
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Please enter the length of the rectangle ");
	int l = scan.nextInt();
	scan.nextLine();
	
	System.out.println("Please enter the width of the rectangle ");
	int w = scan.nextInt();
	scan.nextLine();
	
	return (l * w);
	
}

public static int area_square(){
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Please enter the length of the square ");
	int l = scan.nextInt();
	scan.nextLine();
	
	return ( (int) Math.pow(l, 2));
	
}

public static double area_triangle( ){
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Please enter the length of the square ");
	double b = scan.nextDouble();
	scan.nextLine();
	
	System.out.println("Please enter the length of the square ");
	double h = scan.nextDouble();
	scan.nextLine();
	
	return (0.5 * b * h);
	
}


	public static void main(String[] args)
	{
		
		System.out.println("Which method would you like to use \n"
				+ "1: Circle \n"
				+ "2: Rectangle \n"
				+ "3: Square \n"
				+ "4: Triangle ");
		
		Scanner scan = new Scanner(System.in);
		
		int input = scan.nextInt();
		
		
		switch(input)
		{
		case 1: System.out.println(area_circle());
				break;
		case 2: System.out.println(area_rectangle());
				break;
		case 3: System.out.println(area_square());
				break;
		case 4: System.out.println(area_triangle());
				break;
				
		}
	}
}

