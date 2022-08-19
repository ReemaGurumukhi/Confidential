package InterviewLogical_Practice;

import java.util.Scanner;

public class EvenOddNUM1108 
{
	public static void main(String[] args) 
	{
	  int a =10;
	  int b=3;
	  
	  System.out.println("Division: " +a/b);
	  System.out.println("Module of a% (remainder): " +a%b);
	/////////////////////////////////////////////////////////////////////////  
	  Scanner s =  new Scanner(System.in);
	  System.out.println("Enter Number: ");
	int x =  s.nextInt();
	 
	  if(x % 2 ==0)
	  {
		  System.out.println("Even number");
	  }
	  else
		  System.out.println("Odd number");
	  
	
	}
}
