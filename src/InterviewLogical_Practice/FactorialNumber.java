package InterviewLogical_Practice;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args)
	{
		//4! ===== 4*3*2*1  ==24
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int number = s.nextInt();
		
		int fact=1;
		
	for(int i=number; i>=1;i--) //4--3--2---1
	{
		fact=fact*i;  //4--12---24--24
		
	}
		System.out.println("Factorial: "+fact);
		
	}

}
