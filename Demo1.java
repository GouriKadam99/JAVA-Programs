import java.lang.*;

class Demo1
{
 public int x,y;

public Demo1()
{
  System.out.println("Default constructor");
}

public Demo1(int a, int b)
{
 this();
 System.out.println("Parameterised constructor");
 this.x=a;
 this.y=b;
}
}

class ThisDemo1
{
 public static void main(String args[])
{
Demo1 obj1=new Demo1();
Demo1 obj2=new Demo1(11,21);
}
}
