class range extends Exception
{
	range(int i)
	{
		super("range Exception: Marks is not valid: "+i);
	}
}
class U3P7{
	public static void main(String args[])
	{
		int a[]=new int[3];
		int sum=0;
		int i;
		float per=0.0f;
		for(i=0;i<3;i++)
		{
			try{
				a[i]=Integer.parseInt(args[i]);
				if(a[i]<0||a[i]>100)
				{
					throw new range(a[i]);
				}
				else if(a[i]>=40)
				{
					sum+=a[i];
					System.out.println("\n pass in subject "+(i+1));
				}
				else
				{
					sum+=a[i];
					System.out.println("\n fail in subject "+(i+1));
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
		per=(float)sum/3;
		System.out.println("\n Percentage is "+per);
    }
}