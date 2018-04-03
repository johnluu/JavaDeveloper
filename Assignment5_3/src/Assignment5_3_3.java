import java.io.File;
import java.io.FileWriter;
import java.io.IOException;



public class Assignment5_3_3 {

	
	public static void main(String[] args){
		
		Student[] arr = { new Student("Alan", 10, 4.0),
						  new Student("Becky" , 11, 3.5),
						  new Student("Carl" , 12, 3.0),
						  new Student("Daniel", 13, 2.0),	
						  new Student("Frank", 14, 1.0)
		};
		
		String nameLocation = "C:\\Users\\Students\\Desktop\\names.txt";
		String gradeLocation = "C:\\Users\\Students\\Desktop\\grades.txt";
		String gpaLocation = "C:\\Users\\Students\\Desktop\\gpas.txt";

		File nameFile = new File(nameLocation);
		File gradeFile = new File(gradeLocation);
		File gpaFile = new File(gpaLocation);
		
		try {
			FileWriter writeName = new FileWriter(nameFile, true);
			FileWriter writeGrade = new FileWriter(gradeFile, true);
			FileWriter writeGpa = new FileWriter(gpaFile, true);
			
			for(Student s: arr)
			{
				writeName.write(s.getName() +  "\r\n");
				writeGrade.write(s.getGrade()+  "\r\n");
				writeGpa.write(String.valueOf(s.getGpa())+  "\r\n");
			}
			

			writeName.close();
			writeGrade.close();
			writeGpa.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
