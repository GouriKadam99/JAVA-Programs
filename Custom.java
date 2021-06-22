import java.util.*;

class Student
{
	public String Name;
	public int Marks;
	public Student(String str, int no)
	{
		this.Name = str;	this.Marks = no;
	}
	public void Display()
	{
		System.out.println("Name : "+this.Name+" Marks : "+this.Marks);
	}
}
class Custom
{
	public static void main(String arg[])
	{
		LinkedList <Student> ll = new LinkedList<Student>();
		ll.add(new Student("Piyush",56));
		ll.add(new Student("Amar",36));
		ll.add(new Student("Ajay",96));
		System.out.println("Size of linked list is :"+ll.size());
		Student ref = null;
		Iterator iobj = ll.iterator();
		System.out.println("Contents of linked lsit are:");
		while(iobj.hasNext())
		{
			ref = (Student)iobj.next();
			ref.Display();
		}
		ll.clear();
	}
}