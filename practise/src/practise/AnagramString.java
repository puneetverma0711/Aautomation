package practise;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class AnagramString {

	static String firststring="cabrtyuio";
	static String secondstring="aabc";
	
	
	public static void main(String[] args) {
		/*String duplicatecharoffirststring=uniquefirststring(firststring); 
		int sizeofduplicatecharoffirststring=duplicatecharoffirststring.length();
		System.out.println(sizeofduplicatecharoffirststring); 
		
		
		String duplicatecharofsecondstring=uniquesecondstring(secondstring); 
		int sizeofduplicatecharofsecondstring=duplicatecharofsecondstring.length();
		System.out.println(sizeofduplicatecharofsecondstring);  */
		
		
		
		int sizeoffirststring=firststring.length();
		System.out.println(sizeoffirststring);
		int sizeofsecondstring=secondstring.length(); 
		System.out.println(sizeofsecondstring);
		int totalsize=sizeoffirststring+sizeofsecondstring;
		System.out.println(totalsize);
		
 		
	     String result="";
		
	     for(int i=0;i<sizeoffirststring;i++) {
	    	 
	    	 for(int j=0;j<sizeofsecondstring;j++) {
	    	 
	    		
	    			 
	    	    	 if(firststring.charAt(i)==secondstring.charAt(j))
	    	    	 {
	    	    		  
	    	    		 
	    	    		 result=result+firststring.charAt(i)+secondstring.charAt(i); 
	    	            		 
	    	    		 
	    	    	 }  
	    		
	    	
	    
	    	 }
	     }
	     
	     
		  
		    
		
		int resultsize=result.length();
		System.out.println(resultsize); 
	int noofdeletions=totalsize-resultsize;
		
		System.out.println("minumum no of deletions are: " +noofdeletions);
		
		
	}

	
	
	
	public static String uniquefirststring(String one) {
		
		char[] c=one.toCharArray(); 
		int size=c.length;
		int i=0;
		
		LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<Character, Integer>();
		while(i!=size)  
		{
			if(lhm.containsKey(c[i])==false){  
				lhm.put(c[i], 1);
				
			}else {
				int oldval=lhm.get(c[i]);
				int newval=oldval+1;
				lhm.put(c[i], newval); 
				
			}
			
			i++;
		}		
		
		String result="";
	//	Set<Entry<Character,Integer>> linkedmap=lhm.entrySet();  
		for(Entry<Character,Integer> data:lhm.entrySet() ){
			
 
				if(data.getValue()>1) {
					result=result+data.getKey();
					
					
				}
											   
		}

		
		return result;
		
		
	}
	
	
public static String uniquesecondstring(String two) {
		
		char[] c=two.toCharArray();  
		int size=c.length;
		int i=0;
		
		LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<Character, Integer>();
		while(i!=size)  
		{
			if(lhm.containsKey(c[i])==false){  
				lhm.put(c[i], 1);
				
			}else {
				int oldval=lhm.get(c[i]);
				int newval=oldval+1;
				lhm.put(c[i], newval); 
				
			}
			
			i++;
		}		
		
		String result="";
	//	Set<Entry<Character,Integer>> linkedmap=lhm.entrySet();  
		for(Entry<Character,Integer> data:lhm.entrySet() ){
			
 
				if(data.getValue()>1) {
					result=result+data.getKey();
					
					
				}
											   
		}

		
		return result;
		
		
	}



}
