package qofd.SystemInterfaces;

import java.util.List;

import qofd.Models.Option;

public interface OptionsDAOI {

	public List<Option> getQuestionOption(int questionid);
	
	
}
