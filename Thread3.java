class Demo extends Thread  
{
	public void run()
	{
	System.out.println("Priority of thread is:"+Thread.currentThread().getPriority());  //10
	}
}

class Thread3
{
	public static void main(String arg[])
	{
		System.out.println("Inside main thread");
		Thread t = new Thread(new Demo());
		
		t.setPriority(Thread.MIN_PRIORITY);   //1
		System.out.println(t.getPriority());  //1
		
		t.setPriority(Thread.NORM_PRIORITY);   //5
		System.out.println(t.getPriority());  //5
		
		t.setPriority(Thread.MAX_PRIORITY);   //10
		System.out.println(t.getPriority());  //10
		
		t.start();
	}
}