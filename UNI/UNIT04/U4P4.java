class U4P4
{
	public static void main(String args[])
	{
		FY fyt=new FY();
		Thread fyth=new Thread(fyt,"First year Thread");
		System.out.println("Name of The Thread: "+fyth.currentThread());
		fyth.setPriority(Thread.MAX_PRIORITY-3);
		
		SY syt=new SY();
		Thread syth=new Thread(syt,"Second year Thread");
		System.out.println("Name of The Thread: "+syth.currentThread());
		syth.setPriority(Thread.MIN_PRIORITY+3);
		
		fyth.start();
		syth.start();
		
		try
		{
			fyth.join();
			syth.join();
		}
		catch(InterruptedException e)
		{
			
		}
		System.out.println("TYBCA");
    }
}
class SY extends Thread
{
	public void run()
	{
		for(int i=1;i<=6;i++)
		{
			System.out.println("SYBCA");
		}
	}
}
class FY extends Thread
{
	public void run()
	{
		for(int i=1;i<=4;i++)
		{
			System.out.println("FYBCA");
		}
	}
}