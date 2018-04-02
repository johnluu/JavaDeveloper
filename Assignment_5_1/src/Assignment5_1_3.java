import java.util.Scanner;

public class Assignment5_1_3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String tempName;
		int tempGrade;
		double tempGPA;
		System.out.println("How much students do you have ");
		int numStudents = scan.nextInt();
		scan.nextLine();
		Student arr[] = new Student[numStudents];
		double sum = 0;
		
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
	
		
		
		System.out.println("Average gpa is " + sum/arr.length);
		
		
	}
	
	
}
