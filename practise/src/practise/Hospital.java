package practise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Hospital {

	public static void main(String[] args) {
		
		String completedate="02-12-2020";
		String a[]=completedate.split("-");
		String date=a[0];
		
		

		
		
		TreeMap<String,String> locationmap=new TreeMap<String,String>();
		
		locationmap.put("puneet","bangalore");
		locationmap.put("rahul","banglore");
		locationmap.put("deep","up");
		locationmap.put("abhi","bangalore");
		locationmap.put("amit","haryana");
		locationmap.put("sachin","bangalore");
		

		/*Set<Entry<String, String>> locationset=locationmap.entrySet(); 
		Iterator<Entry<String, String>> locationiterator=locationset.iterator();*/
		
		
		
		
		
		
		
		
		HashMap<String,String> dateofvisitmap=new HashMap<String,String>();
		
		dateofvisitmap.put("puneet","02");
		dateofvisitmap.put("rahul","04");
		dateofvisitmap.put("deep","02");
		dateofvisitmap.put("abhi","10");
		dateofvisitmap.put("amit","02");
		dateofvisitmap.put("sachin","02");
		
		Set<Entry<String, String>> dateset=dateofvisitmap.entrySet(); 
		int i=0;
		
		for(Entry<String, String> datee:dateset )
		
		{
			
			String dd=datee.getValue();
			 
                  if(dd.equals(date)) {
                	 String name= datee.getKey();
                	 System.out.println(locationmap.get(name));
                	 String value=locationmap.get(name);
				
                	 if(value.equals("bangalore"))
                	 {
                		  
                		 i++;
                		
                	 }
                	 
	
			}
	
		}
		
		
		 System.out.println("no of patient in bangalore are"+i);  
		
		
		}
	

	}


