import java.util.Scanner;
class CarAcc
{
	static int prodprice[]={1,100,2,200,3,300,4,400,5,500,6,600};
	static double salestax[]={2,3,4,2.5,1.2};
	void getbill(int prcode,int qty)
	{
		double billamm;
		switch(prcode)
		{
			case 1:
					billamm=(prodprice[prcode]*qty*salestax[0]/100)+prodprice[prcode]*qty;
					System.out.println("Price: "+billamm);
					break;
			case 2:
					billamm=(prodprice[prcode]*qty*salestax[1]/100)+prodprice[prcode]*qty;
					System.out.println("Price: "+billamm);
					break;
			case 3:
					billamm=(prodprice[prcode]*qty*salestax[2]/100)+prodprice[prcode]*qty;
					System.out.println("Price: "+billamm);
					break;
			case 4:
					billamm=(prodprice[prcode]*qty*salestax[3]/100)+prodprice[prcode]*qty;
					System.out.println("Price: "+billamm);
					break;
			case 5:
					billamm=(prodprice[prcode]*qty*salestax[4]/100)+prodprice[prcode]*qty;
					System.out.println("Price: "+billamm);
					break;
			default:
					System.out.println("Please Enter proper value");
		}
	}
}
class test
{
	public static void main(String args[])
	{
		int prcode,qty;
		CarAcc b1 = new CarAcc();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Product Code: ");
		prcode = in.nextInt();
		System.out.print("Enter Quantity: ");
		qty = in.nextInt();
		b1.getbill(prcode,qty);
    }
}