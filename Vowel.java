package lab1;
import java.util.*;
public class Vowel {
static int isvowel(char a)
{
	if(a == 'a' || a=='e'|| a=='i' || a=='o' || a=='u' ||a == 'A' || a=='E'|| a=='I' || a=='O' || a=='U' )
		return 1;
	else
		return 0;
}
public static  void main(String args[])
{
System.out.print("Enter the char\n");
Scanner df = new Scanner(System.in);
char a = df.next().charAt(0);
int g = isvowel(a);
if(g==1)
	System.out.print(a + " is Vowel");
else
	System.out.print(a + " is consonent");
}
}
