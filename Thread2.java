
class Demo implements Runnable  // extends thread
{
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			System.out.println("Inside thread :"+Thread.currentThread().getName()+":"+i);
			try
			{  Thread.sleep(1000);  }
			catch(Exception obj){}
		}
	}
}

class Thread2
{
	public static void main(String arg[])
	{
		System.out.println("Inside main thread");
		Demo obj1 = new Demo();
		Demo obj2 = new Demo();
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		t1.setName("First");
		t2.setName("Second");
		t1.start();
		t2.start();
		try
		{
		t1.join();
		t2.join();
		}
		catch(Exception obj){}
		System.out.println("End of main thread");
	}
}