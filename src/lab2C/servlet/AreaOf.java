package lab2C.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AreaOf
 */
@WebServlet("/AreaOf")
public class AreaOf extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public AreaOf() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		String first_number = request.getParameter("input1");
		String second_number = request.getParameter("input2");
		String type = request.getParameter("type");
		double area = 0;
		
		if(Area.isInteger(first_number) && Area.isInteger(second_number))
		{
			int a = Integer.parseInt(first_number);
			int b = Integer.parseInt(second_number);
			if("rectangle".equals(type))
			{
				area = Area.areaOfRectangle(a, b);
			}
			else
			{
				area = Area.areaOfEclipse(a, b);
			}
			pw.println("");
			pw.println("");
			pw.println("<h1> Area Of " + type);
			pw.println("</h1>");
			pw.println("");
			pw.println("");
			pw.println("<h2> With Values " + first_number + " and " + second_number);
			pw.println("</h2>");
			pw.println(area);
			
			
		}

		
		
		
	
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
