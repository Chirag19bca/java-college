import javax.swing.JOptionPane;
class CarAcc
{
	static int prodprice[][]={{1,100},{2,200},{3,300},{4,400},{5,500},{6,600}};
	static double salestax[]={2,3,4,2.5,1.2};
	void getbill(int prcode,int qty)
	{
		double billamm;
		switch(prcode)
		{
			case 1:
					billamm=(prodprice[prcode-1][1]*qty*salestax[0]/100)+prcode[prcode-1][1]*qty;
					JOptionPane.showMessageDialog(null,"Price: "+billamm);
					break;
			case 2:
					billamm=(prodprice[prcode-1][1]*qty*salestax[1]/100)+prcode[prcode-1][1]*qty;
					JOptionPane.showMessageDialog(null,"Price: "+billamm);
					break;
			case 3:
					billamm=(prodprice[prcode-1][1]*qty*salestax[2]/100)+prcode[prcode-1][1]*qty;
					JOptionPane.showMessageDialog(null,"Price: "+billamm);
					break;
			case 4:
					billamm=(prodprice[prcode-1][1]*qty*salestax[3]/100)+prcode[prcode-1][1]*qty;
					JOptionPane.showMessageDialog(null,"Price: "+billamm);
					break;
			case 5:
					billamm=(prodprice[prcode-1][1]*qty*salestax[4]/100)+prcode[prcode-1][1]*qty;
					JOptionPane.showMessageDialog(null,"Price: "+billamm);
					break;
			default:
					System.out.println("Please Enter proper value");
		}
	}
}
class U1P3{
	public static void main(String args[])
	{
		int prcode,qty;
		CarAcc b1=new CarAcc();
		String a=JOptionPane.showInputDialog(null,"Enter prod code: ");
		prcode=Integer.parseInt(a);
		String b=JOptionPane.showInputDialog(null,"Enter Quantity: ");
		qty=Integer.parseInt(b);
		b1.getbill(prcode,qty);
    }
}