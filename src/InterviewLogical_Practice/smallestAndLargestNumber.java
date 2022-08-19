package InterviewLogical_Practice;

public class smallestAndLargestNumber {

	public static void main(String[] args) 
	{
		
		int nums[]= {10,40,30,90,100};
		
		 int smallest = nums[0];
		 int largest = nums[0];
		 
		 for(int i=0; i<=nums.length-1; i++)
		 {
			 if(nums[i] > largest)
			 {
				 largest = nums[i];
			 }
			 else
			 {
				 smallest = nums[i];
			 }
			
		 }
		 System.out.println("largest Number: "+largest);
		 System.out.println("smallest number: "+smallest);

		 
		 
	}

}
