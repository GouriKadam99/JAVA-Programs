class Str2
{
	public static void main(String arg[])
	{
		String s1 = "ABC";
		System.out.println("Length of string is :"+s1.length());

		for(int i = 0; i < s1.length(); i++)
		{
			System.out.println(s1.charAt(i));
		}

		char arr[] = s1.toCharArray();
		for (int i = 0;i<arr.length ;i++ )
		{
			System.out.println(arr[i]);	
		}

		for(char ch : arr)	// for each loop
		{
			System.out.println(ch);
		}
	}
}