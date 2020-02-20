package practise;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MapUpdateremove {

	public static void main(String[] args) {
		
		
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		
		map.put(1, "puneet");
		map.put(2, "rahul");
		map.put(3, "deep");
		map.put(4, "nikhil");
		map.put(5, "satyam");
		
		
		
		System.out.println(map); 
		
		
		map.remove(5);
		
		System.out.println(map); 
		
		
		map.replace(4, "nikhil", "pramod");
		System.out.println(map); 
		
		
		
		
		Set<Entry<Integer,String>>  hmap=map.entrySet();
		
		for(Entry<Integer,String> data: hmap) {
			
			
			System.out.println(data.getKey()); 
			System.out.println(data.getValue()); 
			
		}
		
		
		
	}

}
