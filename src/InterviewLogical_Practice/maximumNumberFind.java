package InterviewLogical_Practice;

import java.util.Arrays;

public class maximumNumberFind
{			
			public static void main(String args[])
			{  
				int arr[] = {10, 20, 30,100,60,90,99};
			    int size = arr.length;  
			    System.out.println(size);
			    System.out.println("sorted Array ::"+Arrays.toString(arr));
			    
			      Arrays.sort(arr);
			      int r = arr[size-1];
			      System.out.println("largest elemnet is :"+r);

			      
	System.out.println("================================================");		      
			      
	int a[]={1,2,5,6,3,2};  
	int b[]={44,66,99,77,33,22,55};  

	System.out.println("Pick Largest number from array");
	System.out.println("Largest: "+getLargest(a,6));  
	System.out.println("Largest: "+getLargest(b,7));  	
	}
	
	public static int getLargest(int[] a, int total)
	{  
	Arrays.sort(a);  
	return a[total-1];  
	}  
			      
			      
	
	

			
}








