package InterviewLogical_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Dupliacte {



	public static void main(String[] args) 
	{
		 String st[] = {"r","s","f","g","h","r","Pankaj","Pankaj"};
	     int i =  st.length;
	   System.out.println("Size: " +i);
	   System.out.println();
	   
	   Set<String> s = new HashSet<String>();
	        for(String o:st)
	        {
	            if(s.add(o)==false)
	            System.out.print(o + " ");
	        }
///////////////////////////////////////////////////////////
	        
	        System.out.println();
	        
	      String str[] = {"10","2000","300","90","70","70"};
	      int str_i =  str.length;
		   System.out.println("Size: " +str_i);
		   System.out.println();
	      
		 for(String o:str)
	        {
	            System.out.print(o+ " ");
	        }
		 
//////////////////////////////////////////////////
		 
		  System.out.println();
		  
		  int s1[] = {10,20,30,60,40,50};
		  
		    for( int sp : s1)
			 {
			    System.out.println(sp);
			 }
		    
		    
//////////////////////////////////////////////////		    
		    System.out.println();
		    
		String li1[] = {"120","23","450","8"};
			
		List li = new ArrayList();
		
		 Iterator itr = li.iterator();
		 
		 for(String o:li1)
		 {
			 System.out.println(o);
		 }
////////////////////////////////////////////////
		
		int size= li1.length;
		System.out.println("===========");
		System.out.println(size);

		System.out.println(Arrays.toString(li1));
		 Arrays.sort(li1);
		
		
		 
	}

}
