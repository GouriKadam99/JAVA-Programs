// importing the user defined packages
 import Marvellous.Arithematic;
 import Marvellous.Numbers;
 import Marvellous.Infosystems.Logic;
 class Hello 
{
   public static void main(String arg[])
   {
        Arithematic aobj = new Arithematic();
        Numbers nobj = new Numbers();
        Logic lobj = new Logic();
        int ret = aobj.Add(10,11);
        System.out.println("Addition is :"+ret);

        ret = nobj.power(4,3);
        System.out.println("Power is :"+ret);
        lobj.fun();
    }
}

//javac Hello.java
//java Hello        