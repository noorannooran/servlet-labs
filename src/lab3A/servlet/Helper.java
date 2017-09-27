package lab3A.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Helper
 * Helper class to servlet class CreditCard
 */
@WebServlet("/Helper")
public class Helper extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Helper() {
        super();

    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("");
		pw.println("");
		pw.println("");
		pw.println("<h1>Help</h1>");
		pw.println("");
		pw.println("<h2>Valid Credit Numbers</h2>");
		pw.println("");
		pw.println("<h3>Visa</h3>");
		pw.println("<h4>Format: 4 followed by 15 digits</h4>");
		pw.println("<h4>Examples</h4>");
		pw.println("4485257291070839 <br>");
		pw.println("4532299196315250 <br>");
		pw.println("4916962382505630 <br>");
		pw.println("");
		pw.println("<h3>Mastercard</h3>");
		pw.println("<h4>Format: 5[1-5] followed by 14 digits");
		pw.println("<h4>Examples</h4>");
		pw.println("5367568959507189 <br>");
		pw.println("5150064615819060 <br>");
		pw.println("5135689987154629 <br>");
		pw.println("");
		pw.println("<h3>American Express</h3>");
		pw.println("<h4>Format: 3 followed by either 4 or 7 followed by 13 digits");
		pw.println("<h4>Examples</h4>");
		pw.println("346728688442226<br>");
		pw.println("373712420298811<br>");
		pw.println("373535868182654<br>");
		pw.println("");
		pw.println("<h3>Others</h3>");
		pw.println("At this time we do not support other credit card companies.");
		pw.println("");
		pw.println("");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
