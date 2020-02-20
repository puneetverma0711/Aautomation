package practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MaxOccuringChar {

	public static void main(String[] args) {
		
		
		String s="information";
		char[] c=s.toCharArray();
		TreeMap<Character,Integer> tmap=new TreeMap<Character,Integer>();
		int i=0;
		int size=c.length;
		
		while(i!=size) {
			if(tmap.containsKey(c[i])== false)
			{
				
				tmap.put(c[i], 1);
				
				
				
			}else {
				
				int oldval=tmap.get(c[i]);
				int newval=oldval+1;
				tmap.put(c[i], newval);
				
				
				
			}
			
			
			i++;
		}
		
		System.out.println(tmap);
		
		
		
		
		
		
		
		
		int maxval=0;
		char k = ' ';   
		for(Entry<Character,Integer> data: tmap.entrySet()) {
			
			if(data.getValue()>maxval) {
				maxval=data.getValue();
				k=data.getKey();
				
			}
		
			
			
			
		}
		
		
		System.out.println(maxval);
		System.out.println(k); 
		  
		
	}

}
