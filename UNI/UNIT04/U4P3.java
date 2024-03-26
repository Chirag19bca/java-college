class U4P3
{
	public static void main(String args[])
	{
		thread1 th1=new thread1();
		thread2 th2=new thread2();
		Thread t1=new Thread(th1);
		Thread t2=new Thread(th2);
		t1.start();
		t2.start();
		
		try
		{
			t1.join();
			t2.join();
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		int total=th1.sum1+th2.sum2;
		System.out.println("**********************");
		System.out.println("The Final Total: "+total);
		System.out.println("**********************");
		System.out.println("The Average: "+total/2);
		System.out.println("***********TASK COMPLETED***********");
    }
}
class thread1 implements Runnable
{
	int sum1=0,i;
	public void run()
	{
		for(i=1;i<=10;i++)
		{
			try
			{
				sum1=sum1+i;
				Thread.sleep(100);
			}
			catch(InterruptedException e)
			{
				
			}
		}
		System.out.println("Thread1 sum "+sum1);
		System.out.println("Average of 1 to 10 numbers is "+(sum1/10));
	}
}
class thread2 implements Runnable
{
	int sum2=0,i;
	public void run()
	{
		for(i=11;i<=20;i++)
		{
			try
			{
				sum2=sum2+i;
				Thread.sleep(200);
			}
			catch(InterruptedException e)
			{
				
			}
		}
		System.out.println("Thread2 sum "+sum2);
		System.out.println("Average of 11 to 20 numbers is "+(sum2/10));
	}
}