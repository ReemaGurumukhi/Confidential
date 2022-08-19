package InterviewLogical_Practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class NeerajProgram {

	public static void main(String[] args)
	{
		String input1 = "comgoiogleguava";
		 char search1 = 'o';             // Character to search is 'o'.
		    	  
		  int count1=0;
		  for(int i=0; i<input1.length(); i++)
		  {
		      if(input1.charAt(i) == search1)
		      count1++;
		  }
		  System.out.println("The Character '"+search1+"' appears "+count1+" times.");
		 
		
///////////////////////////////////////////////////////
		  
		  int a[] = {10, 4, 7,25,67, 100,10};
			
			int n1 = a.length;
			
			System.out.println("---------With Sort method---------");
			
			Arrays.sort(a);
			
			System.out.println("Highest num: ");
			System.out.println(a[n1-1]);
		
			
			System.out.println("2nd highest : ");
			System.out.println(a[n1-2]);
		
//////////////////////////////////////////////			
			System.out.println("-------without Sort method---------------");
			int num[] = {10, -4,- 7,25,67, 100,190};
			int n = num.length;
			
			int highestNum = Integer.MIN_VALUE;   
			int secondHighest = Integer.MIN_VALUE;
			
			for(int i=0; i<n;i++)
				
				
			{
				if(num[i] > highestNum)
				{
					secondHighest = highestNum;
					highestNum = num[i];
				}
				if(num[i] < highestNum && num[i] > secondHighest)
				{
					secondHighest = num[i];
				}	
			}
			
			System.out.println("Second Highest Number: "+secondHighest);
			
//////////////////////////////////////////////////
			System.out.println("-------------Using Collections---------------------");
			int l[] = {10, -4, 3,4,7,100, 7,25,67, 100,200};
	
			List<Integer> list = Arrays.asList(10,-4,-10, 3, 4, 7,25,67, 100,200);
			
		int secongHighest = list.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
			
			System.out.println(secongHighest);
			
	   int highestVal = list.stream().sorted(Collections.reverseOrder()).distinct().findFirst().get();
	   System.out.println(highestVal);
	   
	 int lowestNum = list.stream().sorted().distinct().findFirst().get();
	 System.out.println(lowestNum);
	   
	   
//////////////////////////////////////////////////////////

	
	}
}
