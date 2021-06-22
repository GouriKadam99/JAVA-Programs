import java.util.*;

class Exception4
{
	public static void main(String arg[])
	{
		int arr[] = {10,20,30,40,50};
		System.out.println("Array created succesfully");
		
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the index of array");
		int index = sobj.nextInt();
		try
		{
			System.out.println("Inside try block");
			System.out.println("Array element at specified index is:"+arr[index]);
			System.out.println("End of try");
		}
		finally
		{
			
		}
		System.out.println("End of main");
	}
}