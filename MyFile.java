import java.io.*;
import java.util.*;

class MyFile
{
	public static void main(String arg[]) throws Exception
	{
		File fobj = new File("Marvellous.txt");
		if(fobj.createNewFile())
		{	System.out.println("File created succesfully");}
		else
		{	System.out.println("Unable to create file");	}

		FileWriter fw = new FileWriter("Marvellous.txt");
		fw.write("Marvellous Infosystems by Piyush Manohar Khairnar");
		fw.write("Karve Road Pune");
		System.out.println("Data written into file");
		fw.close();
	
		Scanner sobj = new Scanner(fobj);
		System.out.println("Data from file is :");
		while(sobj.hasNextLine())
		{
			String str = sobj.nextLine();
			System.out.println(str);
		}
		sobj.close();
	}
}