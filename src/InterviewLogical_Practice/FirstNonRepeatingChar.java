package InterviewLogical_Practice;

public class FirstNonRepeatingChar 
{
	public static void main(String[] args) 
	{
		String str = "stress";
	
		
		 
		for(char i: str.toCharArray())
		{
			if(str.indexOf(i) == str.lastIndexOf(i))
			{
				System.out.println("first non repesting char: "+i);
				break;
			}
		}

	}

}
