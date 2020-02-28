package practise;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class SherlockValidString {

	public static void main(String[] args) {
		
		String text="aabbc";
		char c[]=text.toCharArray();
		
		int size=c.length;
		int i=0;
		
		HashMap<Character,Integer> hmap=new HashMap<Character,Integer>();
		
		while(i!=size) {
			if(!hmap.containsKey(c[i])) 
			{
				hmap.put(c[i], 1);  
				
			}else {
				
				int oldval=hmap.get(c[i]);
				int newval=oldval+1;
				hmap.put(c[i],newval);
				
				
			}
			i++;
			
		}
		
		
		
		
		
		
		for(int j=0;j<hmap.size()-1;j++) {
			
		int flag=0;
			inner:for(int k=j+1;k<hmap.size();k++) {
				
				if(hmap.get(c[j]).equals(hmap.get(c[k]))) {
					System.out.println(hmap.get(c[j])); 
					System.out.println(hmap.get(c[k])); 
					// System.out.println("string is valid");
					flag++;
				}else {
					
					break inner;
				}
				
				
			}
			
			if(flag!=0) {
				
				System.out.println("string is valid");
				break;
			}else {
				
				System.out.println("string is not valid");
				break;
			}
		//break outer;	
			
			
		}
		
		
		
		
		
		

	}

}
