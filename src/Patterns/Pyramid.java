package Patterns;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) 
	{
		
		// *
	   // ***
	  // *****
	  //*******
		
		//row--->4
		//star--->1
		//space--->3
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of star(*) to get pattern of pyramid: ");
		int row = s.nextInt();
		
		int star=1;
		int space=row-1;
		
		
		for(int i=1; i<=row; i++)
		{
			for(int j=1; j<=space; j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=star;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			space--;
			star=star+2;
		}
	}

}
