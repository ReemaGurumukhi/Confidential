package InterviewLogical_Practice;

public class HashMap {

	public static <V> void main(String[] args) 
	{
		 String str = "SSDDRRRTTYYTYTR";
		 
	    java.util.HashMap<Character, Integer> hMap = new java.util.HashMap<>();
	    
	    
	    for (int i = str.length() - 1; i >=0; i--) 
	    {
	         if (hMap.containsKey(str.charAt(i))) 
	         {
	            int count = hMap.get(str.charAt(i));
	            hMap.put(str.charAt(i), count++);
	         } 
	         else
	         {
	            hMap.put(str.charAt(i),1);
	         }
	      }
	      System.out.println(hMap);
	   }

	}


