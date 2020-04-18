package lab1;

import java.util.Scanner;

public class fib {
	static int fibc(int a)
	 {
		
		 if (a <= 1){
				 return(a);}
		 
		return fibc(a-1)+fibc(a-2);
		 
	 }
	 public static void main(String[] args)
	 {
		 //int fact=1;
		
		 System.out.print("Enter fib Number :\n");
		 Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		 System.out.println(fibc(b));
		 
		 
	 }

}
