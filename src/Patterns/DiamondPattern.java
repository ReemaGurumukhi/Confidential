package Patterns;

import java.util.Scanner;

public class DiamondPattern {

	public static void main(String[] args) 
	{
		/*
		 		*
		 	   ***
		      *****
		     *******
		    *********
		     *******
		      *****
		       ***
		        *
		 */
		
		
		
		int row=9;
		int star=1;
		int space=3;
		
		for(int i=0; i<=row ; i++)
		{
			for(int j=0; j<=space ; j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=star; k++)
			{
				System.out.print("*");
			}
			
			if(i<4)
			{
				star=star+2;
				space--;
			}
			else
			{
				star=star-2;
				space++;
			}
			System.out.println();
		}

	}

}
