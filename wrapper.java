
class wrapper
{
	public static void main(String arg[])
	{
		//  premitive datatypes
		int i = 11;
		char ch = 'A';
		
		//  boxing 
		Integer iobj = i;
		Character cobj = ch;
		
		System.out.println("value of integer is :"+iobj);
		System.out.println("value of character is :"+cobj);
		
		//  unboxing
		int j = iobj;
		char c = cobj;
		
		System.out.println("value of integer is :"+j);
		System.out.println("value of integer is :"+c);
	}
}