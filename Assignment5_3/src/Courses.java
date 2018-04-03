
public class Courses {

protected String courseCode;
protected String courseName;

Courses(){
	
}


Courses(String cCode, String cName){
	courseCode = cCode;
	courseName = cName;
	
}

public void info() {
	
	System.out.println(courseCode + " - " + courseName  );
	
	
}
	
	
}
