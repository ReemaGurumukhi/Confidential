package InterviewLogical_Practice;

import java.util.Scanner;

public class MultiplicationWithOutSign {

	public static void main(String[] args) 
	{
		
		int num1= 3;
		int num2 = 4;
		int sum=0;
		 
		 //3*4 = 12
		 // 3+3+3+3 =12    
		//
		 
		 
		 for(int i=1 ; i<=num2 ; i++)     //----i<=4
		 {
			 sum = sum+num1;      		 //---sum=sum+3
			 
			//i->1-->0+4 = 4 =sum
			//i->2-->4+4 =8  =sum
			//i->3-->8+4 =12 =sum
		 }
		 System.out.println("Multipliction: " +sum);
System.out.println("================================================");		

Scanner s = new Scanner(System.in);
System.out.println("Enter A & B number for Multiplication: ");
int a = s.nextInt();
int b = s.nextInt();
int mul=0;

for(int i=1 ;i<=b; i++)
{
	mul = mul+a;
}
System.out.println("Multiplication: "+mul);

		
		

	}

}
