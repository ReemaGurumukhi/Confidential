package InterviewLogical_Practice;

import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args) 
	{

		int str[] = {1,2,4,5,7,9,8};
		 
		 for(int i=0; i<str.length ;i++)
		 {
			 if(str[i]%2==0)
			 {
				 System.out.print(str[i]+ "-EVEN" +"\t");
			 }
			 else
			 {
				 System.out.print(str[i]+ "-ODD"  +"\t");
			 }
		 }
		 System.out.println();
	
System.out.println("=============================================");
   
		   int a[]={1,2,5,6,3,2};  
		   System.out.println("Odd Numbers:");  
		   for(int i=0;i<a.length;i++)
		   {  
			   if(a[i]%2!=0)
			   {  
			   System.out.println(a[i]);  
			   }  
		   }  
		   System.out.println("Even Numbers:");  
		   for(int i=0;i<a.length;i++)
		   {  
			   if(a[i]%2==0)
			   {  
			   System.out.println(a[i]);  
			   }  
		   }  
		 
		 
		 
		 
System.out.println("===============================================");			
		 Scanner reader = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num1 = reader.nextInt();

	      Object evenOdd = (num1 % 2 == 0) ? "even" : "odd";

	        System.out.println(num1 + " is " + evenOdd);

		System.out.println("=============================================");
		 Scanner reader1 = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num2 = reader.nextInt();

	        if(num2 % 2 == 0)
	            System.out.println(num2 + " is even");
	        else
	            System.out.println(num2 + " is odd");
	       
	        
	   System.out.println("===============================================");
	 
	        
	        

	}

}
