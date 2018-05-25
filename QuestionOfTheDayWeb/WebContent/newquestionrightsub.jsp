<%@ page import="java.util.HashSet" %>
<%@ page import="java.util.List" %>
<%@ page import = "qofd.Dao.NewQuestionDAO" %>
<%@ page import = "qofd.Models.New_Question" %>
<%@ page import = "qofd.Dao.UserWatchingDAO" %>
<%! NewQuestionDAO nqDAO = new NewQuestionDAO(); %>
<%! UserWatchingDAO uwDAO = new UserWatchingDAO(); %>




<% 
	List<New_Question> topNewQuestion = nqDAO.getTopNewQuestion();
	HashSet<Integer> userWatching = uwDAO.isWatching(user.getUser_id());


	
	for(New_Question q: topNewQuestion)
	{	
		boolean watching = false;
		if(userWatching.contains(q.getQuestion_id()))
			watching = true;
		
		
		
		out.print("<div class = 'NewQuestionformcontainer'>");
		out.print("<form method = 'post'>");	
		
		out.print( "<p>" + q.getQuestion_text() + "<br>");
		out.print(  q.getWatches() + " Users Watching </p> <br>");
		if(watching)
			out.print("<input type= 'submit' name='watcher" + q.getQuestion_id() + "' value ='UnWatch' >");
		else
			out.print("<input type= 'submit' name='watcher" + q.getQuestion_id() + "' value ='Watch' >");
		

		if(request.getParameter("watcher" + q.getQuestion_id()) != null)
		{
				
		if(watching)
			uwDAO.unwatch(user.getUser_id(), q.getQuestion_id());
		else
			uwDAO.watch(user.getUser_id(), q.getQuestion_id());

			response.sendRedirect("DashBoard.jsp");
		}
		
		out.print("</form>");
		out.print("</div>");
	}
	
%>


