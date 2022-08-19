package InterviewLogical_Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapWordOccurance {

	public static void main(String[] args)
{
		String input = "aaaabbAAAAcccddd";
		  char search = 'a';             // Character to search is 'a'.
		  
		  Map<Character,Integer> hash = new HashMap<Character,Integer>();
		  
		  for(int i=0;i<input.length();i++)
		  {
		      if(hash.containsKey(input.charAt(i)))
		      hash.put(input.charAt(i), hash.get(input.charAt(i))+1);
		      
		      else
		      hash.put(input.charAt(i), 1);
		  }
		  
		  int result = hash.get(search);
		  
		  System.out.println("The Character '"+search+"' appears "+result+" times.");
		  

	
	
	//////////////////////////////////////////////
	String input1 = "tttttttyyyyiiii";
	 char search1 = 'y';             // Character to search is 'y'.
	    
		  
	  int count1=0;
	  for(int i=0; i<input1.length(); i++)
	  {
	      if(input1.charAt(i) == search1)
	      count1++;
	  }
	  
	  System.out.println("The Character '"+search1+"' appears "+count1+" times.");
	 
	
	
	//////////////////////////
	String a1= "comgoiogleguava";
	int j=0; int c=0;
	
	for(int i=0; i<a1.length();i++)
	{
		boolean check = Character.isAlphabetic(a1.charAt(i));
		if(check == true)
		{
			c++;
		}
	}
	System.out.println(c);
	}

}
