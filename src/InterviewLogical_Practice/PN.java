package InterviewLogical_Practice;

import java.util.Scanner;

public class PN 
{
	public static void main(String[] args) 
	{
		//121, 1221, 15151-----EXAMPLE
		//---A palindrome number ----is a number that is same after reverse.
		
		//reverse a number---logic
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number:");
		
		int num=s.nextInt();
		int temp = num;   //store in another variable to save original number
		
		int rev =0 , rem;
		
		while (temp!=0)
		{
			rem=temp%10;         	//rem = 121 % 10 =1(remainder)
			rev=(rev*10)+rem;			// rev = 0 * 10 + 1  =1
			temp=temp/10;			// temp = 121/10 = 12   //---sameloop starts
			
			//repeat 	//rem = 12%10 =2
						// rev =1* 10 +2=12
						// temp 12 /10 =1
			
			//repeat    //rem = 1%10 =0
		}
		
		if(num==rev)
		{
			System.out.println(num+ " Is palindrome number.");
		}
		else
		{
			System.out.println(num+ " Is not palindrome number.");
		}
		
System.out.println("========================================");		
		
int r, sum=0, temp1;    
int n=4545;					//It is the number variable to be checked for palindrome  
temp1=n;  			//----store in another variable to save original number

		while(n>0)
		{    
			r=n%10;  					//getting remainder  
			sum=(sum*10)+r;    
			n=n/10;    
		}    
	if(temp1==sum)    
	 System.out.println("palindrome number ");    
	else    
	 System.out.println("not palindrome");    
		
	System.out.println("===============================================");	
	
	String original, reverse = ""; 			//-------------- Objects of String class  
    Scanner in = new Scanner(System.in);   
    System.out.println("Enter a string/number to check if it is a palindrome");  
    
    original = in.nextLine();   
    
    int length = original.length();   
    
    for ( int i = length - 1; i >= 0; i-- ) 
    	 reverse = reverse + original.charAt(i);  
    
		    if (original.equalsIgnoreCase(reverse))     //---(original.equals(reverse))
		    		System.out.println("Entered string/number is a palindrome.");  
		    else  
		    		System.out.println("Entered string/number isn't a palindrome.");   
				
		
 System.out.println("===============================================");		
		
	/*
For example, num = 252
Reminder=num%10							 252 % 10 = 2		    25 % 10 = 5			     2 % 10 = 2
reverse = (reverse * 10) + remainder	(0 * 10) + 2 = 2	   (2 * 10) + 5 = 25	     (25 * 10) + 2 = 252
num = num / 10							 252 / 10 = 25		    25 /10 = 2				 2 / 10 = 0
num!=0									 25! = 0  [continue]	2! = 0 [continue]		 0 = 0 [stop]


Therefore, reverse and num are ultimately equal, which proves to us that it is a palindrome.
	 */
		
	
 /*
For example, num = 2002

Reminder=num%10									2002 % 10 = 2				200 % 10 = 0			20 % 10 = 0				2 % 10 = 2
reverse = (reverse * 10) + remainder			(0 * 10) + 2 = 2			(2 * 10) + 0 = 20		(20 * 10) + 0 = 200		(200 * 10) + 2 =2002
num = num / 10									2002 / 10 = 200				200 /10 = 20			20 / 10 = 2				2 / 10 = 0
num!=0											200! = 0  [continue]		20! = 0 [continue]		2! = 0 [continue]		0 = 0 [stop]

  */
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
