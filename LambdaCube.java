import java.util.Scanner;
interface Cube {
	int calculate(int n);
}
class LambdaCube {
	public static void main(String[] a){
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter value : ");
	int n=sc.nextInt();
	
	Cube c=num -> num*num*num;  //num**3
	int res=c.calculate(n);
	System.out.println("The cube of "+n+" is : "+res);
}
}