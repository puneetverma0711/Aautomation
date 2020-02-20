package package1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NonRepeatingChar {

	
	/*public static void firstnonrepeatingchar(String name) {
		
		for(int i=0;i<name.length();i++) {
			Character c=name.charAt(i); 
			for(int j=0;j<=i;j++) {
				
				if(!c.equals(name.charAt(j+1))) { 
					System.out.println("first repeating char is " +c); 
					break;
					
										
				}else {
					
					continue;
					
				}
				
			}
			
			
									
		}
		
			
			
	}
	*/
	
	
	
	public static void main(String[] args) {
		
		String str1 = "availablility";
		  System.out.println("The given string is: " + str1);
		  for (int i = 0; i < str1.length(); i++) {
		   boolean unique = true;
		   for (int j = 0; j < str1.length(); j++) {
		    if (i != j && str1.charAt(i) == str1.charAt(j)) {
		     unique = false;
		     break;
		    }
		   }
		   if (unique) {
		    System.out.println("The first non repeated character in String is: " + str1.charAt(i));
		    break;
		   }
		  }
		

	}

}
