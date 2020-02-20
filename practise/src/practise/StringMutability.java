package practise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringMutability {

	public static void main(String[] args) throws ParseException {
		String s1="07-11-1988";
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yy"); //creating date object from string
		Date dt=sdf.parse(s1);
		System.out.println(dt.toString());
		System.out.println(dt.getTime());
		
		
				/*String s2="";
s2="kumar";*/
			



				/*if(s1==s2) {
					
					System.out.println("both are equal");
				}else {
					
					System.out.println("both are not equal");
				}*/

				
/*if(s1.equals(s2)) {
					
					System.out.println("both are equal");
				}else {
					
					System.out.println("both are not equal");
				}*/
				
				/*System.out.println(s2=s1);
System.out.println(s1.equals(s2)); */
	
	
	
	}

}
