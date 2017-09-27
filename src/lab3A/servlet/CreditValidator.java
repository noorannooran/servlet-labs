package lab3A.servlet;

import java.util.regex.*;

public class CreditValidator {
	//class for validating credit-card.html form information
	
public static String validateCreditNo(String input)
//checks if credit number matches the regex patterns for different companies
//if not, it returns value "none"
{
	String visa = "^4[0-9]{12}(?:[0-9]{3})?$";
	String mastercard = "^5[1-5][0-9]{14}$";
	String american = "^3[47][0-9]{13}$";
	
	//visa
	if(Pattern.matches(visa, input))
	{
		return "visa";
	}
	else if(Pattern.matches(mastercard, input))
	{
		return "mastercard";
	}
	else if(Pattern.matches(american, input))
	{
		return "american";
	}
	else
	{
		return "none";
	}
	
}
public static boolean isValidField(String field)
//if field is null or empty returns false, else returns true
{
	if(field!= null && !field.isEmpty())
		return true;
	else
		return false;
}


}
