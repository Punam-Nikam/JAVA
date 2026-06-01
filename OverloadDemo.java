class Calculation {
	void add(int a,int b)
	{
		System.out.println("Addition (int) "+ (a+b));
	}

	void add(double a, double b) 
	{
		System.out.println("Addition (double) : " + (a+b));
	}
}
public class OverloadDemo{
	public static void main(String[] a){
	Calculation c=new Calculation();
	c.add(10,20);
	c.add(12.3,10.2);
}
}
