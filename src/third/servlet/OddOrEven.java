package third.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OddOrEven
 */
@WebServlet("/OddOrEven")
public class OddOrEven extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OddOrEven() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		RandomNumber r = new RandomNumber();
		int num = r.randomNumber();
		PrintWriter pw = response.getWriter();
		pw.println("");
		pw.println("");
		pw.println("<h1>Odd Or Even</h1>");
		pw.println("");
		pw.print("<h2>");
		pw.print(num);
		pw.print("</h2>");
		pw.println("");
		pw.println("");
		
		if(num%2==0){
			pw.println("<h2>Even</h2>");		
		}
		else{
			pw.println("<h2>Odd</h2>");
		}
		pw.println("");
		pw.println("");
		if (r.isPrime(num))
		{
			pw.println("<h2>Prime Number</h2>");
		}
		else
		{
			pw.println("<h2>Not a Prime Number");
		}
		pw.println("");
		pw.println("");
		
		pw.println("");
		pw.println("");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
