package third.servlet;
import java.util.Random;

public class RandomNumber {

	public int randomNumber()
	{
		Random rand = new Random();
		int random = rand.nextInt(50) +1;
		return random;
	}
	public boolean isPrime(int n)
	{
		if (n%2==0) return false;
		for(int i=3; i*i<=n; i+=2)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
}
