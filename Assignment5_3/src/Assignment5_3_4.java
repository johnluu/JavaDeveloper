import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;



public class Assignment5_3_4 {

	
	public static void main(String[] args){
		
		ArrayList<Student> data = new ArrayList<Student>();
		
		try {
			String nameLocation = "C:\\Users\\Students\\Desktop\\names.txt";
			String gradeLocation = "C:\\Users\\Students\\Desktop\\grades.txt";
			String gpaLocation = "C:\\Users\\Students\\Desktop\\gpas.txt";

			File nameFile = new File(nameLocation);
			File gradeFile = new File(gradeLocation);
			File gpaFile = new File(gpaLocation);
			
			Scanner input1 = new Scanner(nameFile);
			Scanner input2 = new Scanner(gradeFile);
			Scanner input3 = new Scanner(gpaFile);

			while(input1.hasNextLine() && input2.hasNextLine() && input3.hasNextLine())
			{
			data.add(new Student(input1.nextLine() , Integer.parseInt(input2.nextLine()), Double.parseDouble( input3.nextLine()) ));
			}
			
			input1.close();
			input2.close();
			input3.close();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for(Student s:data)
		{
			s.getInfo();

		}
	}
}
