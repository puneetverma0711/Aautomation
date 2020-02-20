package practise;

public class FirstNonRepatingCharusingBrute {

	public static void main(String[] args) {


String name="cabcrtyuioo";
		
		
outer:for(int i=0;i<name.length();i++) {
			
			for(int j=0;j<name.length();j++)
			
			{
				
				if(name.charAt(i)==name.charAt(j) && i!=j) {
					 
		System.out.println("  repeating chars is:" +name.charAt(i));		 				
		
		//break outer;
				}
				
				
			}
			
			
		}
		
		

		
		
		
		

	}
	
}
