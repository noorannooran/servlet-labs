package first.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/HelloWorld")
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public HelloWorld() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("");
		pw.println("");
		pw.println("");
		pw.println("<h1>Hello World</h1>");
		pw.println("");
		
		String number = request.getParameter("number");
		if (isInteger(number)== true)
		{
			long factorial = factorial(Integer.parseInt(number));
			pw.println("<h2>");
			pw.println("Original Number: "+number);
			pw.println("</h2><h2>");
			pw.println("Factoral of "+ number + ": " + factorial);
			pw.println("</h2>");
			pw.println("");
		}
		
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<h2>");
		pw.println("Username: " +userName);
		pw.println("</h2><h2>");
		pw.println("Inputted Password: " +password);
		pw.println("</h2>");
		pw.println("");
	}
	
	protected static boolean isInteger(String input)
	{
		try{
			Integer.parseInt(input);
			return true;
		}
		catch(NumberFormatException e)
		{
			return false;
		}
		
	}
	protected static long factorial(int number)
	{
		if (number <=1)
		{
			return number;
		}
		return number*factorial(number-1);
	}
}
