package Patterns;

import java.util.Scanner;

public class EquilateralDownward_ReversePyramid {

	public static void main(String[] args) 
	{
		//*******
	    // *****
		 // ***
		  // *
		
//		int row=7;
//		int star=7;
//		int space=0;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of star(*) to get pattern of reverse pyramid: ");
		int row = s.nextInt();
		int star=row;
		int space=0;
		
		for(int i=1; i<=row;i++)
		{
			for(int j=1; j<=space; j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=star; k++)
			{
				System.out.print("*");
			}
			System.out.println();
			space++;					// Increment of Space by 1
			star=star-2;				// Decrement of Star by 2
			
		}

	}

}
