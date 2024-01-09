//program 11
class circum{
	float r=4;
	void area()
	{
		double ans;
		ans=3.14*r*r;
		System.out.println("Area of circle: "+ans);
	}
	void circum()
	{
		double ans;
		ans=2*3.14*r;
		System.out.println("circumference of circle: "+ans);
	}
	public static void main(String args[])
	{
		p10 p=new p10();
        p.area();
		p.circum();
    }
}