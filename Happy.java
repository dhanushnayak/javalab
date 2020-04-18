package lab1;
import java.util.*;
public class Happy {
public static int happy(int n)
{
	int r=0,sum=0;
	while(n>0)
	{
		r=n%10;
		sum+=(r*r);
		n/=10;
	}
	return sum;
}
public static void main(String[] args)
{
	System.out.println("Enter The Number");
	Scanner df = new Scanner(System.in);
	int n = df.nextInt();
	int result = n;
	while(result!=1&&result!=4)
		result = happy(result);
	if(result==1)
		System.out.print(n + " Is happy number");
	else
		System.out.print(n + " not happy number");
}
}
