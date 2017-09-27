package lab2C.servlet;

public class Area {

	public static boolean isInteger(String input)
	{
		try{
			Integer.parseInt(input);
			return true;
		}
		catch(NumberFormatException ex)
		{
			return false;
		}
	}
	
	public static double areaOfRectangle(int a, int b)
	{
		return a * b;
	}
	public static double areaOfEclipse(int a, int b)
	{
		return Math.PI *a * b;
	}
}
