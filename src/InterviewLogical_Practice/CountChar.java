package InterviewLogical_Practice;

public class CountChar {

	public static void main(String[] args) 
	{
		 String str = "My name is Reema Gurumukhi.I am Software tester.";    
	     int count = 0;    
	            
   
	        for(int i = 0; i < str.length(); i++) 
	        {    
	            if(str.charAt(i) != ' ')    
	             count++;    
	        }    
	        System.out.println("Total number of characters in a string: " + count);    

	        
//--------------------------------------------------------
	        System.out.println("========================================");
	        System.out.println(str.length());  //---count with space
	}

}





















//Displays the total number of characters present in the given string 
//Counts each character except space 