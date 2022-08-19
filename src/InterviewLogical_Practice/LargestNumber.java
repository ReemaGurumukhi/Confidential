package InterviewLogical_Practice;

import java.util.Arrays;

public class LargestNumber {

	public static void main(String[] args) 
	{
		int a[] = {10, 4, 7,25,67};
		
		int num = a.length;
		
		System.out.println("Highest num: ");
		System.out.println(a[num-1]+ " ");
		
		Arrays.sort(a);
		
		System.out.println("2nd highest : ");
		System.out.println(a[num-2]+ " ");
		

	}

}
