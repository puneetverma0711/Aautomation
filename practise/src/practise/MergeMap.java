package practise;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MergeMap {

	public static void main(String[] args) {
	
		
		HashMap<Integer,String> map1=new HashMap<Integer,String>();
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");
		map1.put(4, "D");
		Set<Entry<Integer,String>> hmap1=map1.entrySet();
		
		
		
		
		HashMap<String,Integer> map2=new HashMap<String,Integer>();
		map2.put("A",12000);
		map2.put("B",14000);
		map2.put("C",15000);
		map2.put("E",18000);
		
		Set<Entry<String,Integer>> hmap2=map2.entrySet();
		HashMap<String,Integer> map3=new HashMap<String,Integer>();
		
		for(int i=1;i<=map1.size();i++)
		{
			for(Entry<String,Integer> data: hmap2)
			{
				
				if(map1.get(i).equals(data.getKey())) {  
					
					map3.put(map1.get(i), data.getValue());
					 
					
				}
				
			}
			
			
		}
		
		  
	for(Entry<String,Integer> mergeddata: map3.entrySet()) {
			
			  System.out.println(map3.get(mergeddata.getKey())); 
			
		}
		
		
		
		
		

	}

}
