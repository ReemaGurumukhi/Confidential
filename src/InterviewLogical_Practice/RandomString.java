package InterviewLogical_Practice;

import java.util.Random;

public class RandomString 
{
	public static void main(String[] args) 
	{
		
		String Char = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String randomString =" ";
		
		int length =5;
		
		Random rand = new Random();
		
		char[] text = new char[length];
		
		for (int i = 0; i < length; i++) 
		{
			text[i] = Char.charAt(rand.nextInt(Char.length()));
		}
		
		
		for(int i=0; i <text.length; i++)
		{
			randomString +=text[i];
		}
		
		System.out.println(randomString);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
