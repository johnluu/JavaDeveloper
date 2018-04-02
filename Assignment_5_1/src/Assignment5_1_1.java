import java.util.Scanner;

public class Assignment5_1_1 {

	public static void main(String[] args) {
		
		
		String tempName;
		int tempGrade;
		double tempGPA;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a students ");
		System.out.println("Enter the name");
		tempName = scan.nextLine();
		System.out.println("Please enter a grade ");
		tempGrade = scan.nextInt();
		System.out.println("Please enter a gpa ");
		tempGPA = scan.nextDouble();
		scan.nextLine();
		
		Student a = new Student(tempName , tempGrade,  tempGPA);
		
		System.out.println("Please enter a students ");
		System.out.println("Enter the name");
		tempName = scan.nextLine();
		System.out.println("Please enter a grade ");
		tempGrade = scan.nextLine().charAt(0);
		System.out.println("Please enter a gpa ");
		tempGPA = scan.nextDouble();
		scan.nextLine();
		
		Student b = new Student(tempName , tempGrade,  tempGPA);
		
			
		System.out.println("Please enter a students ");
		System.out.println("Enter the name");
		tempName = scan.nextLine();
		System.out.println("Please enter a grade ");
		tempGrade = scan.nextLine().charAt(0);
		System.out.println("Please enter a gpa ");
		tempGPA = scan.nextDouble();
		scan.nextLine();
		
		Student c = new Student(tempName , tempGrade,  tempGPA);
		
		
		
		a.studentInfo();
		b.studentInfo();
		c.studentInfo();
		
		
		System.out.println("The average is " + ((a.getGPA() + b.getGPA() + c.getGPA())/3));
		
		
	}
	
	
}
