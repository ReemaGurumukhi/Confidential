package Patterns;

import java.util.Scanner;

public class sandPattern {

	public static void main(String[] args) 
	{
		/*
		    * * * * * 
			 * * * * 
			  * * * 
			   * * 
			    * 
			    * 
			   * * 
			  * * * 
			 * * * * 
			* * * * * 
		 */

		Scanner s =  new Scanner(System.in);
		System.out.println("Enter nunber of stars(*) to print sand glass pattern: ");
		int row = s.nextInt();
				
		
		int star= row/2;
		int space=0;
		
		for(int i=0; i<=row ; i++)
		{
			for(int j=0; j<=space; j++)
			{
				System.out.print(" ");
			}
			for(int k=0; k<=star; k++)
			{
				System.out.print("* ");
			}
			
			if(i<(row/2))
			{
				star--;
				space++;
			}
			else
			{
				star++;
				space--;
			}
			System.out.println();
		}
		
		
		//int row = 10;
		//int star= 5;
		//int space=0;
	}

}
