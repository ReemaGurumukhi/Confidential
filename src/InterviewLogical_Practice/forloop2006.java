package InterviewLogical_Practice;

import java.util.Scanner;

public class forloop2006 
{
	public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);   // Create a new Scanner object
        int rows = scanner.nextInt();
        
        System.out.println("Enter the number of rows needed to print the pattern :");    // Get the number of rows from the user
        System.out.println("## Printing the pattern ##");
        
        // Print i number of stars
        for (int i=1; i<=rows; i++)
        {
            for (int j=1; j<=i; j++)
            {
                if( j == 1 || j == i || i == rows)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        scanner.close();

	}

}
