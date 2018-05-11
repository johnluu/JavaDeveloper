package qofd.MainEntry;

import java.util.ArrayList;
import java.util.List;

import qofd.Dao.NewOptionsDAO;
import qofd.Dao.NewQuestionDAO;
import qofd.Dao.QuestionDAO;
import qofd.Dao.UserDAO;
import qofd.Dao.UserWatchingDAO;
import qofd.Models.New_Option;
import qofd.Models.New_Question;
import qofd.Models.Question;
import qofd.Models.User;

public class Test {

	public static void main(String[] args) {

		UserDAO userDAO = new UserDAO();
		
		//userDAO.registerUser("John@gmail.com", "CALAHAM", "john", "Luu");
		
//		User user = userDAO.getUser(1);
//		System.out.println(user.getFirst_name());
//		
		NewQuestionDAO nqDAO = new NewQuestionDAO();
//		nqDAO.createNewQuestion(1, "This is a new question",new String[] {"a","b","C"});
//		List<New_Question> newQLIST = nqDAO.getAllNewQuestion();
//		
//		for(New_Question a: newQLIST)
//		{
//			System.out.println(a.getQuestion_id() + " " + a.getQuestion_text());
//		}
//		
//		
//		New_Question q = nqDAO.getnewQuestion(11);
//		NewOptionsDAO opDAO = new NewOptionsDAO();
//		List<New_Option> nOp = opDAO.getNewQuestionOption(11);
//		System.out.println(q.getQuestion_id() + " " + q.getQuestion_text());
//		for(New_Option a: nOp)
//			System.out.println(a.getOptions_id() + " " + a.getOption_text());
//		
//		
		UserWatchingDAO u = new UserWatchingDAO();
		boolean iswatching = u.istWatching(1, 1);
		u.watch(iswatching, 1, 1);
		System.out.println(iswatching);

		New_Question wachquestion = nqDAO.getnewQuestion(1);
		System.out.println(wachquestion.getWatches());
//		QuestionDAO QDAO = new QuestionDAO();
//		Question q = null;
//		List<Question> qList;
//		
//		qList = QDAO.getTodaysQuestion();
//		for(Question z: qList)
//			System.out.println( z.getQuestion_id() + " " + z.getQuestion_text() + " " + z.getDate());
//		
//		q = QDAO.getQuestion(6);
//		
//		System.out.println(q.getQuestion_id() + " " + q.getQuestion_text() + " " + q.getDate());
//		
	}

}
