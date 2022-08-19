package InterviewLogical_Practice;

import java.util.Scanner;

public class PalindromeWith2String 
{
	public static void main(String[] args)
	{
		String s = "nayan";
		String c="";
		
		for(int i=s.length()-1; i>=0;i--)
		{
			 c = c + s.charAt(i);
		}
		System.out.println(c);
		
		if(c.equals(s))
		{
			System.out.println("String is palindrom");
		}
		else
			System.out.println("String is not palindrome");
		
System.out.println("===========================================");	

Scanner scan = new Scanner(System.in);
System.out.println("Enter Number/String: ");
 String a = scan.nextLine();
 String b = "";


for(int i=a.length()-1 ; i>=0 ;i--)
{
	b= b + a.charAt(i);
}
	System.out.println();
	
	if(b.equals(a))
	System.out.println(b+ " is Palindrome");
	else
	System.out.println(b+" is not Palindrome");

	}

}
