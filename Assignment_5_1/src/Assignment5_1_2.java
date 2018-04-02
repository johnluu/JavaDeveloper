import java.util.Scanner;

public class Assignment5_1_2 {

	public static void main(String[] args) {
		
		
		String tempName;
		int tempGrade;
		double tempGPA;
		Student arr[] = new Student[3];
		double sum = 0;
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < arr.length; i++)
		{
			
		System.out.println("Please enter a students ");
		System.out.println("Enter the name");
		tempName = scan.nextLine();
		System.out.println("Please enter a grade ");
		tempGrade = scan.nextInt();
		scan.nextLine();
		System.out.println("Please enter a gpa ");
		tempGPA = scan.nextDouble();
		scan.nextLine();
		
		arr[i]  = new Student(tempName , tempGrade,  tempGPA);
		sum += arr[i].getGPA();
		
		}
		

		for(Student s:arr)
			s.studentInfo();
	
		
		
		System.out.println("Average gpa is " + sum/3);
		
		
	}
	
	
}