import java.util.*;

class Exception5
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter first number");
		int no1 = sobj.nextInt();
		System.out.println("Enter second number");
		int no2 = sobj.nextInt();
		try
		{
			System.out.println("Inside try block");
			int ans = no1/no2;
			System.out.println("Answer is :"+ans);
		}
		//catch(Exception obj)
		//{   System.out.println("Generic catch");   }
		//catch(ArrayIndexOutOfBoundsException obj)
		//{   System.out.println("Array index out of bounds");   }
		//catch(ArithmeticException obj)
		//{   System.out.println("Divide by zero exception");   }
		
		finally
		{
			System.out.println("Inside finally block");
		}
		System.out.println("End of main");
	}
}