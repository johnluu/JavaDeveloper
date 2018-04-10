import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
public class CrazyText {


	public static void main(String[] args) throws IOException
	{	String path = System.getProperty("user.dir");
		File writeTo = new File(path + "\\CrazyTextModified.txt");
		File readFrom = new File(path + "\\" + "CrazyText.txt");
		BufferedReader reader = null;
		PrintWriter writer= null;
		try {
			reader = new BufferedReader(new FileReader(readFrom));
			writer = new PrintWriter(new FileOutputStream(writeTo,false));
			String Line; 
			while((Line = reader.readLine()) != null)
					{
					for(int i = 0; i < Line.length(); i++)
					{
						writer.write(checkChar(Line.charAt(i)));
					}
						writer.write("\r\n");
					}
		} catch (IOException e) {
			e.printStackTrace();
		}
			reader.close();
			writer.close();
	}
	public static char checkChar(char a) {
		switch(a)
		{
		case'a' :
			return 'A';
		case'e':
			return 'E';
		case'i':
			return 'I';
		case'o':
			return 'O';
		case'u':
			return 'U';
		default:
			return a;
		}
	}
}