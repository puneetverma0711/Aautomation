package practise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIterate {

	public static void main(String[] args) {
	
		
		ArrayList<String> li=new ArrayList<String>();
		li.add("puneet");
		li.add("prashant");
		li.add("raghu");
		li.add("nikhil");
		li.add("deep");
		Iterator<String> it=li.iterator();
		
		while(it.hasNext()) {
			
			String value=it.next();
			System.out.println(value);
		}
		
		
		System.out.println("***********");
		
		ListIterator<String> lit=li.listIterator(li.size());
		
		while(lit.hasPrevious()) {
			String value1=lit.previous();
			System.out.println(value1);
			
			
		}
		
		
		
		

	}

}
