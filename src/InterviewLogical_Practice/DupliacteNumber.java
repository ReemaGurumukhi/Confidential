package InterviewLogical_Practice;

import java.util.HashSet;
import java.util.Set;

public class DupliacteNumber {

	public static void main(String[] args)
	{
		//solution :------------------------ use HashSet data structure to find duplicates

		
				String s[] ={"java", "Selenium","*%%","Java", "java", "apache","*%%", "testNG" ," ", " "};
				
				//String s[] ={"10", "60" ,"*%%", "90"," ", "10", "60", "100" ," " ,"*%%"};
				
				Set<String> str = new HashSet<String>();     //---use collection set interface---hashset class
				
				for(String o:s)      //--use for each loop
				{
					 if (str.add(o)==false) 
					 {
						 System.out.println("Duplicate element in array : " + o);
					 }
					 }
		////////////////////////////////////////////////////////////
				
				System.out.println("===========================================");

		//solution :------------------------ finding duplicates using brute force method


				for (int i = 0; i < s.length; i++) 
				{
					for (int j = i+1; j < s.length; j++) 
					{
						if (s[i].equals(s[j]))
						{
							System.out.println("found duplicate number: "+s[i]);
						}
					}
				}
				
		/////////////////////////////////////////////////////////		
				
	}

}
