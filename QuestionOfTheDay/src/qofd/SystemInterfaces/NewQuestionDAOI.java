package qofd.SystemInterfaces;

import java.util.List;

import qofd.Models.New_Question;

public interface NewQuestionDAOI {

	public New_Question getnewQuestion(int questionid);
	public List<New_Question> getAllNewQuestion();
	public List<New_Question> getTopNewQuestion();
	public boolean createNewQuestion(int userid,String questiontext, String[] option);
	
	
}
