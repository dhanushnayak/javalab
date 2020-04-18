package lab1;
import java.util.*;
public class overriding {
static int area(int l,int b)
{
	return(l*b);

}
static int area(int l)
{
	return(l*l);

}
static float area(float r)
{
	float pi = (float) 3.14;
	return(pi*r*r);

}
public static void main(String[] args)
{
	Scanner df = new Scanner(System.in);
	System.out.println("Enter The Choice \n1.Area of Square\n2.Area of Rectangle\n3.Area of Circle\n");
	int ch = df.nextInt();
	if(ch==1)
	{
		Scanner df1 = new Scanner(System.in);
		System.out.println("Enter Sides of Square\n");
		int a = df1.nextInt();
		System.out.println("Area = "+area(a));
	}
	else if(ch==2)
	{
		Scanner df11 = new Scanner(System.in);
		System.out.println("Enter Length and breath\n");
		int a = df11.nextInt();
		Scanner df111 = new Scanner(System.in);
		int b = df111.nextInt();
		System.out.println("Area = "+area(a,b));
		
	}
	else
	{
		Scanner df1121 = new Scanner(System.in);
		System.out.println("Enter Radius of circle\n");
		float a = df1121.nextFloat();
		System.out.println("Area = "+area(a));
	}
	
}

}
