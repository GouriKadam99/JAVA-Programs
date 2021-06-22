import java.util.*;

class MyVector
{
	public static void main(String arg[])
	{
		// Size of 10 elements
		Vector <Character> obj1 = new Vector <Character>();
		// Size of 20 elements
		Vector <Character> obj2 = new Vector <Character>(20);
		// Size of 20 elements and increment factor is 10
		Vector <Character> obj3 = new Vector <Character>(20,10);
		obj3.add('A');
		obj3.add('B');
		obj3.add('C');
		System.out.println("Size is :"+obj3.size());
		System.out.println("Capcity is :"+obj1.capacity());
		System.out.println("Capcity is :"+obj3.capacity());
		for(int i = 0; i < obj3.size(); i++)
		{
			System.out.println(obj3.get(i));
		}
		System.out.println("Data using Enumeration");
		Enumeration eobj = obj3.elements();
		while(eobj.hasMoreElements())
		{
			System.out.println(eobj.nextElement());
		}
		obj3.clear();
	}
}