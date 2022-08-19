package InterviewLogical_Practice;

public class forLoop 
{
	public static void main(String[] args) 
	{
/////////////////////////////////////////////////////////////////////////////////		
		System.out.println("------------------------Pattern-1------------------");
		int j=6;
		for (int i = 0; i <= j; i++) 
		{
			for (int k = 0; k <=i ; k++) 
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
////////////////////////////////////////////////////////////////////////////////
		System.out.println("=================================");
		System.out.println("------------------------Pattern-2------------------");
	
		int x=6;
		for (int i = x; i>=0; i--) 
		{
			for (int k =0; k<=i ; k++) 
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
/////////////////////////////////////////////////////////////////////////////////		
		System.out.println("===================================");
		System.out.println("------------------------Pattern-3------------------");
		
		int z=6;
		
		for (int i = 0; i <=z ; i++) 
		{
			for (int k = i; k >=0 ; k--) 
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
/////////////////////////////////////////////////////////////////////////////////////		
		
		System.out.println("===================================");
		System.out.println("------------------------Pattern-4------------------");
		
		int rows=6;
		
		for (int i = rows; i >=0; i--)   //------------------i= rows
		{
			for (int k = 0 ; k >i; k--)  //------------------j=columns
			{
				System.out.print("  ");
			}
			
			for (int a=0 ; a<=i ; a++) 
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
/////////////////////////////////////////////////////////////////////////////////////////////
		
		System.out.println("=============================================");
		System.out.println("------------------------Pattern-5------------------");
		
		int b=6;
		for (int i = 0; i <= b ; i++)   //--------------------i=columns
		{
			for (int k = 1; k <=b-1 ; k++)   //------------------j=columns
			{
				//System.out.print(" ");
			}
			for (int a = 0; a <=i; a++) 
			{
				System.out.print(" * ");	
			}
			System.out.println("");
		}
		
//////////////////////////////////////////////////////////////////////////////////////
		
		System.out.println("=============================================");
		System.out.println("------------------------Pattern-6------------------");
		
		int c=6;
		
		 for (int i= c; i>=0 ; i--)
		    {
		    for (int k=0; k<=i; k++)
		    {
		    System.out.print("*" + "  ");  //    " * "
		    }
		    System.out.println();
		
		    }
/////////////////////////////////////////////////////////////////////////////////////		
		
		System.out.println("=============================================");
		System.out.println("------------------------Pattern-7------------------");
		
		int d=6;
		
		for (int i= 0; i<= d; i++)
        {
            for (int k=d; k>=i; k--)           //int k=0; k<=d-i; k++
            {
                System.out.print(" ");
            }
            for (int k=0;k<=i;k++)
            {
                System.out.print("*");
            } 
                System.out.println();
        }
/////////////////////////////////////////////////////////////////////////////////////
		
		System.out.println("=============================================");
		System.out.println("------------------------Pattern-8------------------");
		
		
		int e=6;
		
		for (int i= 0; i< e ; i++)
	    {
	        for (int k=0; k<i; k++)
	        {
	            System.out.print(" ");
	        }
	        for (int k=0; k<e-i; k++)
	        {
	            System.out.print("*");               //System.out.print("*" + "");
	        }
	        System.out.println();
		
	    }
		
/////////////////////////////////////////////////////////////////////////////////////
		
System.out.println("=============================================");
System.out.println("------------------------Pattern-9 (Star Pyramid)------------------");		
		
		for(int i=0; i<=6 ; i++)   //------rows
		{
			for( int k=6; k>=i ; k--)
			{
				System.out.print(" ");
			}
			for (int k = 1; k <=i; k++) //------for 1st star triangle
			{
				System.out.print("*");
			}
			for(int l=2; l<=i ;l++)
			{
				System.out.print("*");  //-----for 2nd half star triangle
			}
			System.out.println();
		}
		
/////////////////////////////////////////////////////////////////////////////////////
		
System.out.println("=============================================");
System.out.println("------------------------Pattern-10 (Star Pyramid -Another way)------------------");			
		
for(int i=0; i<=6 ; i++)   //------rows
{
	for( int k=6; k>=i ; k--)
	{
		System.out.print(" ");
	}
	for (int l = 1; l < (i*2); l++) //------for 1st star triangle
	{
		System.out.print("*");
	}
	System.out.println();
}
		
/////////////////////////////////////////////////////////////////////////////////////

System.out.println("=============================================");
System.out.println("------------------------Pattern-11 (Star Pyramid with space)------------------");			
	
	for(int i=0; i<=6 ; i++)
	{
		for(int k=6 ;k>=i ;k--)
		{
			System.out.print(" ");
		}
		for (int l=0; l<=i ; l++)
		{
			System.out.print(" *");   //minor difference in pattern 3 & pattern 4
		}
		System.out.println();
	}
/////////////////////////////////////////////////////////////////////////////////////

System.out.println("=============================================");
System.out.println("------------------------Pattern-12 (Star Pyramid with space) (another way)------------------");		

for(int i=0; i<=6 ; i++)
{
	for(int k=6; k>=1 ;k--)
	{
		if(k>i)
		{
			System.out.print(" ");
		}
		else 
		{
			System.out.print(" *");
		}
	}
	System.out.println();
}

/////////////////////////////////////////////////////////////////////////////////////

System.out.println("=============================================");
System.out.println("------------------------Pattern-13 ------------------");		

for(int i=0; i<=6 ;i++)    //for upper triangle
{
	for(int k=0; k<=i;k++)
	{
		System.out.print("*");
	}
	System.out.println();
}
for(int i=0; i<=6; i++)      //for below triangle
{
	for(int k=5; k>=i ;k--)     //for(int k=6; k>=i ;k--)
	{
		System.out.print("*");
	}
	System.out.println();
}

/////////////////////////////////////////////////////////////////////////////////////

System.out.println("=============================================");
System.out.println("------------------------Pattern-14 ------------------");		


for(int i=0; i<=6; i++)
{
	for(int k=0 ;k<=i; k++)
	{
		System.out.print(" ");
	}
	//for(int l=0; )
		System.out.println();                                                                                                                                        
}











/////////////////////////////////////////////////////////////////////////////
System.out.println("Print name, mobile number, city.");
String s[] = new String[] {"Reema","9876543432","Pune"};

for (int i = 0; i < s.length; i++)
{
	System.out.print(s[i] +" ");
}
System.out.println();

/////////////////////////////////////////////////////////////////////////////
System.out.println();
System.out.println("Print REEMA in reverse string:");

String s1= "REEMA";

		for (int i =s1.length()-1; i >=0; i--) 
		{
			System.out.print(s1.charAt(i) +" ");
		}
		System.out.println();
		
/////////////////////////////////////////////////////////////////////////////
System.out.println();		
System.out.println("Count same word occurance in string:");		
		
		String s2= "Java Programming Java oops Java";
		
	int totalCount	=s2.length();    // total length of string
		
int totalcount_afterRemove = s2.replace("J","").length();   //replace all j" with empty chara
		//total length after removing j's
		
		int count = totalCount - totalcount_afterRemove;
		System.out.println("Number of occurence of 'J' is: "+count);
		
		
		
	}

}
