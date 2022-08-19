package InterviewLogical_Practice;

import java.util.Scanner;

public class New 
{
	 static int num =154;
	static int a= 1234;
	 static int sum=0;
	static int num1=16;
	 static int count=0;
	public static void main(String[] args) 
	{
	       String b="";
	      String s= Integer.toString(a);
	      for(int i=s.length()-1; i>=0; i--)
	      {
	          b=b+s.charAt(i);
	      }
	      int x =Integer.parseInt(b);
	      System.out.println("Reverse Int: "+x);
System.out.println("============================================");

 for(int i=num ; i>0 ;i=i/10)
 {
	 int rem =i % 10;
	sum = sum+ (rem*rem*rem);
 }
if(sum==num)
	System.out.println("armstrong number");
else
	System.out.println("Not armstrong number");

System.out.println("===========================================");

for(int i=2; i<num1 ; i++)
{
	if(num1 % i==0)
	{
		count++;
		break;
	}
}
if(count==1)
	System.out.println("Not prime");
else
	System.out.println("prime");

System.out.println("==================================");

Scanner scan = new Scanner(System.in);
System.out.println("Enter Number:");
int number= scan.nextInt();
int counter=0;

for(int i=2; i<number;i++)
{
	if(number%i==0)
	{
		counter++;
		break;
	}
}
	if(counter==0)
	{
		System.out.println("Given number is  prime number");
	}
	else
	{
		System.out.println("Gven number is not prime number");
	}
}
}
