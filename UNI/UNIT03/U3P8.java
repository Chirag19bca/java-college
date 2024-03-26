class range extends Exception
{
	range(String message)
	{
		super(message);
	}
}
class U3P8{
	public static void main(String args[])
	{
		int a[]=new int[5];
		try
		{
			for(int j=0;j<5;j++)
			{
				a[j]=Integer.parseInt(args[j]);
				if(a[j]>100||a[j]<0)
				{
					throw new range("Invalid Range: "+a[j]);
				}
			}
		}
		catch(NumberFormatException e)
			{
				System.out.println("\n Number Format Exception");
			}
			catch(ArithmeticException e)
			{
				System.out.println("\n ArithmeticException");
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("\n Array Index Exception occur");
			}
			catch(Exception e)
			{
				System.out.println("\n Exception: "+e.getMessage());
			}
    }
}