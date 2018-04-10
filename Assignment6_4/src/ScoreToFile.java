import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;

public class ScoreToFile {


	public static void main(String[] args) throws IOException
	{	String path = System.getProperty("user.dir");
		PrintWriter writer = null;
		File WriteTo = new File(path + "\\score.txt");
		BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
		try {
			writer = new PrintWriter(new FileOutputStream(WriteTo,false));
			System.out.println("What is your name ");
			String name = reader.readLine();
			System.out.println(name);
			System.out.println("What score did you get");
			int score = Integer.parseInt(reader.readLine());
			System.out.println(score);
			writer.write(name + " got a " + score + " on his Math Test.");
			
		} catch (IOException e) {
			e.printStackTrace();
		}


			writer.close();
			reader.close();

	}
	
}