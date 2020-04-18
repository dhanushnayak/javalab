package lab1;
import java.util.*;
public class partb1 {
public static void main(String[] args) {

	Scanner obj1 = new Scanner(System.in);


System.out.println("Enter Valid Employee ID : \n");
int[] EmpId={1,2,3,4,5,6,7};
String[] EmpName={"Dhanush","Amrutha","Yashu","Disha","Prathap","Dev","Raju"};
String[] JoinDate={"01/04/2009","23/08/2012","12/11/2008","29/01/2013","16/07/2005","01/01/2000","12/06/2006"};
char[] DesigCode={'e','c','k','r','m','e','c'};
String[] Department={"R&D","PM","Acct","Front Desk","Engg","Manufacturing","PM"};
double[] Basic={20000,30000,10000,12000,50000,23000,29000};
double[] HRA={8000,12000,8000,6000,20000,9000,12000};
double[] IT={3000,9000,1000,2000,20000,4400,10000};
char[] DesignationCode={'e','c','k','r','m'};
String[] Designation={"Engineer","Consultant","Clerk","Receptionist","Manager"};
double[] DA={20000,32000,12000,15000,40000};
int flag=0;

int id = obj1.nextInt();

for(int i=0;i<EmpId.length;i++)
{
	if(EmpId[i]==id)
	{
		flag=1;
		System.out.println("Emp Id.	 Emp Name	Department	Designation	   DA");
		System.out.print(EmpId[i]+" 	  "+EmpName[i]+" 		"+Department[i]);
		for(int j=0;j<DesignationCode.length;j++)
		{
			if(DesigCode[i]==DesignationCode[j])
			{	System.out.print(" 		"+Designation[j]+" 	");
				double sum=Basic[i]+HRA[i]+DA[j]-IT[i];
				System.out.print(sum);
			}
		}		
	}	
}
if(flag==0)
	System.out.println("There is no employee with EmpId : " +id);

}
} 