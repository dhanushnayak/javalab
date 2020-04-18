package lab1;
import java.util.Scanner;
public class Fac {
 static int fac(int a)
 {
	 if (a == 0){
			 return(1);}
	 else {
	 return(a*fac(a-1));
	 }
 }
 public static void main(String[] args)
 {
	 int fact=1;
	 System.out.print("Enter fact Number :\n");
	 Scanner sc = new Scanner(System.in);
	 int b = sc.nextInt();
	 fact = fac(b);
	 System.out.print("Fact : "+fact);
	 
 }
}
