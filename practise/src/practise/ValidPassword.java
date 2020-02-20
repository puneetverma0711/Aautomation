package practise;

public class ValidPassword {

	
	static void validpwd(String password) {
		
		int a=password.length();
		String specialchar=password.replaceAll("[a-zA-Z0-9]", "");
		//System.out.println(specialchar); 
		
/*if(specialchar.length()>0) {
			
			System.out.println("string contain special char");
			
			
		}else {
			
			
			System.out.println("string does not contain special char");
		}*/
		
		
		//to check extracted integer count
		String extractedinteger="";
		
		
		for(int i=0;i<password.length();i++) {
			char s=password.charAt(i);
			if(Character.isDigit(s)) {
				extractedinteger+=s;
				 
				
			} 
			
			
			
		}
		
		//System.out.println(extractedinteger); 
		
		/*if(extractedinteger.length()>=2) {
			
			System.out.println("more than 2 integers");
			
			
		}else {
			
			
			System.out.println("less than 2 integers");
		}*/
		
		
		
		// to check length 
		
		if(a<10) {
		
		System.out.println("pwd is having less than 10 alphabet characters"); 
		}else if(extractedinteger.length()<2) {
			
			System.out.println("pwd has less than 2 digits"); 
		}else if(specialchar.length()>0) {
			System.out.println("pwd has  Special characters"); 
			
		}else {
			System.out.println("pwd is  valid"); 
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		validpwd("puneet1234");
	}

}
