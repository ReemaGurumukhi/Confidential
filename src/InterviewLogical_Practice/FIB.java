package InterviewLogical_Practice;

import java.util.Scanner;

public class FIB 
{

	public static void main(String[] args) 
	{
		int num1=0;
		int num2=1;
		int num3;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter count for fibonacci:");
		int count = s.nextInt();
	
		System.out.print(num1 +" "+ num2);
		
		for(int i=2; i<count ; i++)
		{
			num3 = num1 + num2;
			System.out.print(" "+num3);
			num1=num2;
			num2=num3;
			
		}
	
	
	
	}

	
	

}
