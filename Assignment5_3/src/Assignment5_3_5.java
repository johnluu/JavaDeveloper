import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;



public class Assignment5_3_5{

	
	public static void main(String[] args){
		
		ArrayList<String> data = new ArrayList<String>();
		ArrayList<Student> student = new ArrayList<Student>();
		
		
		try {
			String nameLocation = "C:\\Users\\Students\\Desktop\\students.csv";
			File nameFile = new File(nameLocation);
			Scanner input1 = new Scanner(nameFile);


			while(input1.hasNextLine())
			{
			data.add(input1.nextLine());
			}
			
			input1.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		for(String s:data)
		{
			String[] sData = s.split(",");
			
			student.add(new Student(sData[0], Integer.parseInt(sData[1]),Double.parseDouble(sData[2])));
		}
		
		for(Student s:student)
		{

			s.getInfo();
		}
		
	}
}
