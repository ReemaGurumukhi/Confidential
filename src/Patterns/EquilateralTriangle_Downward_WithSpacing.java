package Patterns;

import java.util.Scanner;

public class EquilateralTriangle_Downward_WithSpacing {

	public static void main(String[] args) 
	{
		// Equilateral Triangle Downward With Space
		//   * * * * *
		//    * * * *
		//     * * *
		//      * *
		//       *
		
		
//		int row= 5;
//		int star=5;
//		int space=0;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of star(*) for Equilateral Triangle Downward With Space: ");
		int row = s.nextInt();
		int star=row;
		int space=0;
		
		for(int i=1; i<=row; i++)
		{
			for(int j=1; j<=space ; j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=star; k++)
			{
				System.out.print("* ");
			}
			System.out.println();
			space++;
			star--;
			
		}

	}

}
