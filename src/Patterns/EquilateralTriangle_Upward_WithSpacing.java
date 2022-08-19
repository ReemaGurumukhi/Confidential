package Patterns;

import java.util.Scanner;

public class EquilateralTriangle_Upward_WithSpacing {

	public static void main(String[] args) 
	{
		// Equilateral Triangle Upward With Space
		// *
	   // * *
	  // * * *
	//  * * * *
		
//		int row= 4;
//		int space=3;
//		int star= 1;
//				
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of star(*) to get pattern of reverse pyramid: ");
		int row = s.nextInt();
		int star=1;
		int space=row-1;
		
		for(int i=1; i<=row;i++)
		{
			for(int j=1; j<=space; j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=star; k++)
			{
				System.out.print("* ");
			}
			System.out.println();
			space--;
			star++;
		}
		
		
		
		
	}

}
