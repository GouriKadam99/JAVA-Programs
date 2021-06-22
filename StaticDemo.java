import java.lang.*;

class Demo 
{
 public int x,y;                               // non static characteristics
 public static int z=11;                 //  static characteristics

 public void fun()                        // non static behaviour
  {
     System.out.println("Inside fun");
  }
 public static void gun()              //  static behaviour
  {
   System.out.println("Inside gun");
   //System.out.println("value of x is:"+this.x);
  }
}
   class StaticDemo
   {
         public static void main(String arg[])
          {
              System.out.println("value of z is:"+Demo.z);
              Demo.gun();
              Demo obj = new Demo();
              obj.fun();
              obj.gun();
           }
   }