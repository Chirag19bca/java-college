class odd extends Exception
{
	odd(int i)
	{
		System.out.println("Number is odd "+i);
	}
	
}
class U3P10
{
	public static void main(String args[])
	{
		int a[]=new int[args.length];
		for(int i=0;i<args.length;i++)
		{
			try
			{
				a[i]=Integer.parseInt(args[i]);
				if(a[i]%2!=0)
				{
					throw new odd(a[i]);
				}
			}
			catch(Exception e)
			{
				System.out.println("Exception occured");
			}
		}
	}
}