package lab1;
import java.util.*;
public class hashing {
	public static void main(String[] args)
	{
		System.out.println("Enter the Name :\n");
		Scanner df = new Scanner(System.in);
		String name= df.next();
		
		System.out.println("Enter the Room number :\n");
		Scanner df1 = new Scanner(System.in);
		int[] room= new int[3];
		for (int i=0;i<room.length;i++)
		{
			room[i] = df1.nextInt();
		}
		System.out.println("Enter the Phone number :\n");
		Scanner df11 = new Scanner(System.in);
		int[] number= new int[3];
		for (int i=0;i<number.length;i++)
		{
			number[i] = df11.nextInt();
		}
		char a = name.charAt(0);
		char b = name.charAt(name.length() -1);
		int sum=0;
		for(int i=0;i<room.length;i++)
		{
			sum+=room[i];
		}
		int lastp = number[number.length-1];
		int thrd = number[number.length-3];
		String[] array = new String[]{ "!","@","#","$","%" }; 
		String s = array[thrd];
		
		System.out.print(sum+s+a+lastp+b);
	

}}
