package InterviewLogical_Practice;

public class PrimeNumber {

	public static void main(String[] args) 
	{
	
		//prime number----divisible by itself(14) & 1
		int a =13;
		 int count=0;
	
		 //---start from 2 and go till a
		for(int i=2; i<=a ; i++)   //2
		{
			if(a%i==0)  //13%2=1
			{
				count++; //1
				break;
			}
				
		}

		
		if(count==1)
			System.out.println("its not prime number");
		else
			System.out.println("its prime number");
		
		System.out.println("========================================");
		
		

	
	}
}
