package practise;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Uniquechar {

	public static void main(String[] args) {
		String name="puneetverma";
		
		char[] c=name.toCharArray();
		int size=c.length;
		int i=0;
	TreeMap<Character,Integer> hmap=new TreeMap<Character,Integer>();
	
	while(i!=size) { 
		
		if(!hmap.containsKey(c[i])) { 
			
			hmap.put(c[i], 1);
			
				
			
		}else {
			
			int oldval=hmap.get(c[i]);
			int newval=oldval+1;
			hmap.put(c[i], newval);
			 
		}
		
		i++;
		
	}
	
	
	Set<Entry<Character,Integer>> map=hmap.entrySet();
	 String r="";
	for(Entry<Character,Integer> data: map) {	
		
		
			r=r+data.getKey();
			
	
		
		
		 
		
	}
	
	System.out.println(r); 
	
	
	
		
	}

}
