package practise;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class AnagramString {

	static String firststring="fcrxzwscanmligyxyvym";
	static String secondstring="jxwtrhvujlmrpdoqbisbwhmgpmeoke";
	
	
	public static void main(String[] args) {
		
		int sizeoffirststring=firststring.length();
		
		int sizeofsecondstring=secondstring.length(); 
		
		int totalsize=sizeoffirststring+sizeofsecondstring;
		System.out.println(totalsize);
		
 		
	     int deletions = 0;
	     int val=uniquefirststring(firststring);
	     System.out.println(val);
	     int val2= uniquesecondstring(secondstring);
	     System.out.println(val2);
	     for(int i=0;i<sizeoffirststring;i++) {
	    	 
	    	 for(int j=0;j<sizeofsecondstring;j++) {
	    	 
	    		
	    			 
	    	    	 if(firststring.charAt(i)==secondstring.charAt(j))
	    	    	 {
	    	    		  
	    	    		 
	    	    		 deletions++;
	    	            		 
	    	    		 
	    	    	 }  
	    		
	    	
	    
	    	 }
	     }
	     
	     System.out.println(deletions);

		
	
	int noofdeletions=totalsize-deletions;
		
		System.out.println("minumum no of deletions are: " +noofdeletions);
		
		
	}

	

public static int uniquefirststring(String a) {
	
	int count=0;
	for(int i=0;i<a.length();i++) {
		
		for(int j=i+1;j<a.length();j++) {
			
			if(a.charAt(i)==a.charAt(j) && i!=j) {
				
				count++;
				
			}
			
			
		}
		
	}
	
	
	return count;
}




public static int uniquesecondstring(String b) {
	int count=0;
	for(int i=0;i<b.length();i++) {
		
		for(int j=i+1;j<b.length();j++) {
			
			if(b.charAt(i)==b.charAt(j) && i!=j) {
				
				count++;
				
			}
			
			
		}
		
	}
	
	
	return count;
	
	
}







}
