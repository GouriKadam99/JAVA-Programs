import java.util.*;

class MyHashtable
{
	public static void main(String arg[])
	{
		Hashtable <Integer,String> ht = new Hashtable<Integer,String>();
		ht.put(11,"Piyush");
		ht.put(21,"Amit");
		ht.put(51,"Sagar");
		ht.put(101,"Pooja");
		System.out.println("Elements of hashtable is :"+ht);
	}
}