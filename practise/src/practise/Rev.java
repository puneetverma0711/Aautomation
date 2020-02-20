package practise;

public class Rev {

	public static void main(String[] args) {
	
		
		String s = "elle";
		
		int len=s.length();
				
				String rev="";
		
				for(int i =len-1;i>=0;i--){  

					rev=rev+ s.charAt(i);

					}
 

					System.out.println(rev);

					if(s.equals(rev)) {
						System.out.println("name is palindrome");  
						
					}else {
						
						System.out.println("name is not palindrome");
					}
				

	}

}
