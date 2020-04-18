package lab1;

import java.util.Scanner;

public class disgitsum {
	 static int func(int n)
	{
		int sum=0;
		while(n>0 || sum>9) {
			if(n==0)
		{
			n = sum;
			sum =0;
		}
		
			sum = sum + n%10;
			n/=10;
		
		
	}
		return sum;
}
	 public static void main(String args[])
	 {
		 System.out.println("Enter The Number");
		Scanner df = new Scanner(System.in);
		int n = df.nextInt();
		int f = func(n);
		System.out.print(f);
		 
	 }
}

