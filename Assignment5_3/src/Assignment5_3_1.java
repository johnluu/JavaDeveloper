import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Assignment5_3_1 {

	public static void main(String args[]) 
	{
		
			ArrayList<String> data = new ArrayList<String>();
		
		
		try {
		
			String location = "C:\\Users\\Students\\Desktop\\Hello.txt";
			File file = new File(location);
			Scanner input = null;
			input = new Scanner(file);
			
			while(input.hasNextLine())
			{
			data.add(input.nextLine());
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File no found");
			e.printStackTrace();
		}
		

			for(String line : data) {
				System.out.println(line);
				
			}
			
			
			System.out.println();
			
			for(int i = data.size()-1; i >= 0; i--) {
				System.out.println(data.get(i));
				
			}
			
			System.out.println();
			
			for(String line : data) {
				
				for(int i = line.length()-1;i >=0;i--)
					System.out.print(line.charAt(i));
			
				System.out.println();
			}
	}
}
