import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Puzzles {


	public static void main(String[] args) throws IOException
	{	String path = System.getProperty("user.dir");
		Scanner Scan = new Scanner(System.in);
		
		printMenu();
		String userPath = "";
		int input = -1;
		while(userPath == "")
		{
			input = Scan.nextInt();
			Scan.nextLine();
			userPath = checkInput(input);
		}
		File readFrom = new File(path + "\\" + userPath);
		InputStreamReader reader = null;
		int total = 0;
		int count = 1;
		try {
			reader = new FileReader(readFrom);
			int val = 0; 
			while(val != -1)
			{
				
				val = reader.read();
				
				if(count == 3)
				{
					System.out.print((char)val);
					count = 0;
				}
				count++;
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}

			reader.close();

	}
	
	public static void printMenu() {
		
		System.out.println("Choose a file \r\n"
				+ "1: puzzle.txt \r\n"
				+ "2: puzzle2.txt \r\n"
				);
	}
	
	public static String checkInput(int input) {
		
		switch (input){
		case 1 : 
			return "puzzle.txt";
		case 2 :
			return "puzzle2.txt";
		default :
			return "";
		}
		
	}
}