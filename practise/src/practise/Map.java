package practise;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Map {

	public static void main(String[] args) {
		String s="information";
		char[] c=s.toCharArray(); 
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
		
		
	//	Set<Entry<Character,Integer>> linkedmap=lhm.entrySet();  
		for(Entry<Character,Integer> data:lhm.entrySet() ){
			
 
				if(data.getValue()<2) {
					System.out.println("first non repeating character is " +data.getKey());
					break;
				}
				
			

			

			
			
		
   
		}
		 
		
		
		

	}

}
