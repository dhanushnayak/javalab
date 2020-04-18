package lab1;
import java.util.*;
public class dupi {
	public static void main(String[] args) {
		System.out.println("Enter the  number :\n");
		Scanner df1 = new Scanner(System.in);
		int[] room= new int[6];
		int[] temp=null;
		for (int i=0;i<room.length;i++)
		{
			room[i] = df1.nextInt();
		}
		int k=0;
		for(int i=0;i<room.length;i++)
		{
			for(int j=i+1;j<room.length;j++)
			{
				if(room[i]==room[j])
				{
					temp[k++]=room[j];
				}
			}
		}
		
}
}
