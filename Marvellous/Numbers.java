package Marvellous;   //we want to create package named as Marvellous

import java.lang.*;

public class Numbers
{
    public int power(int x,int y )
    {
       int ans =1;
       for(int iCnt = 1;  iCnt <= y; iCnt++)
        {
           ans = ans * x;
         }
         return ans;
     }
}


//javac -d . Numbers.java
//-d  create directory
//.    current directory