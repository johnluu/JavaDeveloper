package corejava.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import corejava.models.Course;
import corejava.systemsinterfaces.CourseDAOI;
import corejava.utils.OracleQueries;

public class CourseDAO implements CourseDAOI{

	@Override
	public List<Course> getAllCourses() {
		
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;
		List<Course> courseList = new ArrayList<Course>();
		
		try {
			conn = OracleConnection.getConnection();
			stmt = conn.prepareStatement(OracleQueries.GETALLCOURSE);
			result = stmt.executeQuery();
			
			while(result.next())
			{
				courseList.add(new Course(result.getInt(1), result.getString(2),result.getDouble(3)));
			}
			
		} catch (ClassNotFoundException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return courseList;
	}

	@Override
	public List<Course> getCourseByInstructor(int instructor_id) {

		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;
		List<Course> courseList = new ArrayList<Course>();
		
		
		try {
			conn = OracleConnection.getConnection();
			stmt = conn.prepareStatement(OracleQueries.GETCOURSEBYINSTRUCTOR);
			stmt.setInt(1, instructor_id);
			result = stmt.executeQuery();
			
			while(result.next())
			{
				courseList.add(new Course(result.getInt(1), result.getString(2),result.getDouble(3)));
			}
		} catch (ClassNotFoundException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return courseList;
	}
	

}
