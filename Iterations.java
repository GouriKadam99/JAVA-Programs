import java.lang.*;
import java.lang.*;
import java.util.Scanner;
class Iterations  
{
  public static void main(String arg[])
   {
     Scanner sobj = new Scanner(System.in);
     
     System.out.println("please enter the number");
     int No = sobj.nextInt();
     int iCnt = 0;

     System.out.println("for loop");
     //         1               2              3  
     for(iCnt=1; iCnt<=No; iCnt++ )
     {
         System.out.println(iCnt); //4
      }

      System.out.println("while loop");
       iCnt=1;                    //1 
                //2
     while( iCnt<=No )
     {
         System.out.println(No); //4
         iCnt++;                           //3
      }
}
}

     