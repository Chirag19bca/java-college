class U4P1
{
	public static void main(String args[])
	{
		String s=args[0];
		Runnable r=new odd(s);
		Thread t=new Thread(r);
		Runnable r2=new even(s);
		Thread t2=new Thread(r2);
		t.start();
		t2.start();
		try
		{
			t.join();
			t2.join();
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		System.out.println("\n End of Main Thread: Both threads Completed");
    }
}
class odd implements Runnable
{
	int n;
	odd(String s)
	{
		n=Integer.parseInt(s);
	}
	public void run()
	{
		for(int i=0;i<n;i++)
		{
			try
			{
				if(i%2==1)
				{
					System.out.println("\n odd "+i);
					Thread.sleep(10);
				}
			}
			catch(InterruptedException e)
			{
				
			}
		}
	}
}
class even implements Runnable
{
	int n;
	even(String s)
	{
		n=Integer.parseInt(s);
	}
	public void run()
	{
		for(int i=0;i<n;i++)
		{
			try
			{
				if(i%2==0)
				{
					System.out.println("\n Even "+i);
					Thread.sleep(300);
				}
			}
			catch(InterruptedException e)
			{
				
			}
		}
	}
}