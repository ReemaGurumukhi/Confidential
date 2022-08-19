package InterviewLogical_Practice;

public class pickName {

	public static void main(String[] args) 
	{
		String s="1234Reema1234";
		
		String name= s.substring(4,9);
		System.out.println("pick name:  "+name);
		System.out.println();
///////////////////////////////////////////
		
		//-----Hello world ----reverse it
		String s1 ="Hello World";
		System.out.println("reverse name: ");
		for(int i=s1.length()-1; i>=0; i--) 
		{
			System.out.print(s1.charAt(i)); 
		}

////////////////////////////////////////////////
		System.out.println();
		System.out.println();
		
		//count char in string
		 String s2= "Reema Gurumukhi";
		 
		 s2.length();
		 System.out.println(s2.length());
		
///////////////////////////////////////////////
		// return first non repeating char in sentence
		 
		 String s3 = "I love India";
		 
		s3.charAt(5);
		System.out.println(s3.charAt(5));
		
		

	}

}
