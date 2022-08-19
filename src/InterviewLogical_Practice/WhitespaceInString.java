package InterviewLogical_Practice;

import java.util.Scanner;

public class WhitespaceInString {

	public static void main(String[] args) 
	{
		String s = "my name is reema";
		
		int count = 0;
		
		for(int i=0; i<=s.length()-1;i++)
		{
		 char blank = s.charAt(i);
		if(blank==' ')
		{
			count++;
		}
		
	}
		System.out.println("Number of blank space is "+s+ ": "+count );
	}
}


