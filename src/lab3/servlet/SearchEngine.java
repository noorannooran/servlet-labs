package lab3.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SearchEngine
 */
@WebServlet("/SearchEngine")
public class SearchEngine extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public SearchEngine() {
        super();
   
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String name = request.getParameter("searchEngine");
		if(name.contains("Google")){
			response.sendRedirect("http://www.google.ca");
		}
		else if(name.contains("Yahoo")){
			response.sendRedirect("http://www.yahoo.com");
			
		}
		else if(name.contains("Bing")){
			response.sendRedirect("http://www.bing.com");
		}
		else
		{
			response.sendError(HttpServletResponse.SC_NOT_FOUND,
					"The search engine is fake and cannot be found");
		}
		
		
	}

}
