import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Assignment5_3_2 {

	public static void main(String args[]) 
	{
		
			ArrayList<Courses> data = new ArrayList<Courses>();
		
		
		try {
		
			String codeLocation = "C:\\Users\\Students\\Desktop\\courseCode.txt";
			String nameLocation = "C:\\Users\\Students\\Desktop\\courseName.txt";
			File codeFile = new File(codeLocation);
			File nameFile = new File(nameLocation);
			
			Scanner input1 = new Scanner(codeFile);
			Scanner input2 = new Scanner(nameFile);
			
			while(input1.hasNextLine() && input2.hasNextLine())
			{
			data.add(new Courses(input1.nextLine() , input2.nextLine()) );
			}
			input1.close();
			input2.close();
			
			
		} catch (FileNotFoundException e) {
			System.out.println("File no found");
			e.printStackTrace();
		}
		

			for(Courses c: data) {
				c.info();
				
			}
			
	}
}
