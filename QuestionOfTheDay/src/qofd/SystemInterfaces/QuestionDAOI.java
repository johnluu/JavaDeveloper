package qofd.SystemInterfaces;

import java.util.List;

import qofd.Models.Question;


public interface QuestionDAOI {

	
	public List<Question> getAllQuestion();
	public List<Question> getTodaysQuestion();
	public Question getQuestion(int question_id);
	
}
