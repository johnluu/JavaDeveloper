package qofd.Dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import qofd.Models.New_Option;
import qofd.Models.Option;
import qofd.SystemInterfaces.OptionsDAOI;
import qofd.Utils.OracleQueries;

public class OptionDAO implements OptionsDAOI{

	@Override
	public List<Option> getQuestionOption(int questionid) {
		
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;
		List <Option> questionOption = new ArrayList<Option>();
		
		try {
			conn = OracleConnection.getConnection();
			stmt = conn.prepareStatement(OracleQueries.GETNEWQUESTIONOPTION);
			stmt.setInt(1, questionid);
			result = stmt.executeQuery();
			
			while(result.next())
				questionOption.add(new Option(result.getInt(1),result.getInt(2),result.getString(3), result.getInt(4)));
				
		} catch (ClassNotFoundException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return questionOption;
		
	}

	
	
}
