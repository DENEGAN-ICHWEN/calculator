package calculadora;
import java.lang.Math;

public class Calculadora
{
	public boolean hasIntegerBase(int x, int n)
	{
		double xNthRoot;
		boolean result = false;
		
		if (n > 0)
		{
			xNthRoot = Math.pow(x, 1.0/n);
			x = (int) xNthRoot;
			
			if (xNthRoot == x)
			{
				result = true;
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) 
	{
		int x = 1024, n = 10;
		String hasInteger;
		Calculadora myCal = new Calculadora();
		
		hasInteger = myCal.hasIntegerBase(x, n)? "True": "False";
		
		System.out.println("El numero " + Integer.toString(x) +
				" elevado a la " + Integer.toString(n)+ " tiene una base entera i?\n" + hasInteger);
		
		

	}

}
