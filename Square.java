package lab1;
import java.util.Scanner;
public class Square {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter The number : ");
	int n = sc.nextInt();
	int sum =0;
	for(int i=1;i<=n;i++)
	{
		sum = sum+(i*i);
	
	}
	System.out.println("Sum of "+n+": "+sum);
}
}