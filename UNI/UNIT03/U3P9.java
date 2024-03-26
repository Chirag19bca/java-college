class unitformatexception extends Exception
{
	unitformatexception(String s)
	{
		super("unitformatexception:Unit is not valid"+s);
	}
}
class U3P9
{
	public static void main(String args[])
	{
		int no;
		String u;
		try{
			no=Integer.parseInt(args[0]);
			u=args[1];
			if((u.equals("centimeter"))||(u.equals("meter")))
			{
				if(u.equals("centimeter"))
				{
					int m=no/100;
					System.out.println("Equivalent number of meter is "+m);
				}
				else
				{
					int cm=no*100;
					System.out.println("Equivalent number of centimeter is "+cm);
				}
			}
			else
			{
				throw new unitformatexception(u);
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException occured");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException occured");
		}
		catch(NumberFormatException e)
		{
			System.out.println(" NumberFormatException "+"Enter Numbers only");
		}
		catch(Exception e)
		{
			System.out.println(""+e.getMessage());
		}
    }
}