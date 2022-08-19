package InterviewLogical_Practice;

import java.util.Scanner;

public class wordOccuranceInString {

	public static void main(String[] args) 
	{
		
		
System.out.println("Count same word occurance in string:");		
		
		//String s2= "Java Programming Java oops Java";
		
		String s2= "Comgoiogleguavaoo";
		
	int totalCount	=s2.length();    // total length of string
		
int totalcount_afterRemove = s2.replace("o","").length();   //replace all j" with empty chara
		//total length after removing j's
		
		int count = totalCount - totalcount_afterRemove;
		System.out.println("Number of occurence of 'o' is: "+count);
		

	/////////////////////////////////////////////////////
		
		
		

	
	
	
		
	}

}
