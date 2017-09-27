package lab3A.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import lab3A.servlet.CreditValidator;
/**
 * Servlet implementation class CreditCard
 */
@WebServlet("/CreditCard")
public class CreditCard extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public CreditCard() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//get parameters from POST form
		String first_name = request.getParameter("first_name");
		String last_name = request.getParameter("last_name");
		String address = request.getParameter("address");
		String postal_code = request.getParameter("postal_code");
		String credit_card = request.getParameter("credit_card");
		
		//check that all fields are not null
		if(CreditValidator.isValidField(first_name) && CreditValidator.isValidField(last_name) &&
				CreditValidator.isValidField(address) && CreditValidator.isValidField(postal_code) &&
					CreditValidator.isValidField(credit_card))
		{
			//check if credit number is valid, returns credit company name
			String credit_type = CreditValidator.validateCreditNo(credit_card);
		
			//check credit_type for company names
			if(credit_type.contains("visa"))
			{	
				response.sendRedirect("http://www.visa.com");
			}
			else if(credit_type.contains("mastercard")){
				response.sendRedirect("http://www.mastercard.com");
			}
			else if(credit_type.contains("american")){
				response.sendRedirect("http://www.americanexpress.com");
			}
			else
			{
				//status code response: Not Found
				response.sendError(HttpServletResponse.SC_NOT_FOUND,
						"Invalid CreditValidator Card Number, cannot find company");
			}
		}
		else
		{
			//status code response: Bad Request
			response.sendError(HttpServletResponse.SC_BAD_REQUEST,
						"Invalid form data: all fields are required");
		}

}
}