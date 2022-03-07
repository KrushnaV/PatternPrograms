public class Main  
{  
	public static int getGCD(int a, int b)  
	{  
		while(b != 0)  
		{  
			if(a > b)  
			{  
				a = a - b;  
			}  
			else  
			{  
				b = b - a;  
			}  
		}  
		return a;  
	}  

	public static void main(String[] args)   
	{  
		int a  = 32;
		int b = 12;
		int gcd = 0;  
		gcd = getGCD(a, b);  
		System.out.println("GCD Of a and b  is  =  " + gcd);  
	}  
	
}