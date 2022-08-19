package InterviewLogical_Practice;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) 
	{
		
		int n, first = 0,next = 1;
        
        System.out.println("Enter how may fibonnaci numbers to print");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        System.out.println("The first " + n + " Fibonacci numbers are: ");
        System.out.print(first + " " + next);
        int i = 1;
        while (i<n-1)
        {
            int sum = first + next;
            first = next;
            next = sum;
            System.out.print(" " + sum);
            i++;
        }
System.out.println();

System.out.println("=================================================");	
System.out.println();


int n1=0, n2=1, n3, count=10;  

System.out.println("===============FIBONACCI SERIES=================");

   
System.out.print(n1+" "+n2);//printing 0 and 1 

for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
{    
	 n3=n1+n2;    
	 System.out.print(" "+n3);    
	 n1=n2;    
	 n2=n3;    
}    	


		
		
	}

}
