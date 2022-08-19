package InterviewLogical_Practice;

public class ReverseNumber {

	public static void main(String[] args)
	{
		
		//num 1234=====>4321
		int num= 1234;
		
		String a = Integer.toString(num);    //---convert int to string
		String r = "";
		
		for(int i=a.length()-1; i>=0 ; i--)
		{
			r=r+a.charAt(i);
		}
		int revNum = Integer.parseInt(r);   //---convert string to integer
		
		System.out.println(revNum);

	}

}
