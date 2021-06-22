import java.lang.*;

class Demo 
{
 public int x,y;
 
 public Demo()
 {
      this.x=0;
      this.y=0;
  }
 public void fun()
  {
     System.out.println("value of x is:"+this.x);
  }
}
   class ThisDemo
   {
         public static void main(String arg[])
          {
              Demo obj = new Demo();
              obj.fun();
           }
   }