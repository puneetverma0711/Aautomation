package practise;

import java.util.Arrays;

public class PangramString {

	public static void main(String[] args) {
		
		
		String sentence="The quick brown fox jumps over the lazy dog";
		
		sentence.replaceAll(" ", "");     
		
		/*char[] finalstring=sentence.toCharArray();
	
		Arrays.sort(finalstring);
		System.out.println(Arrays.toString(finalstring)); 
		
		char[] alpha= {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','X','Y','Z'};
		*/
		String alphalist="abcdefghijklmnopqrstuvexyz";
		
		boolean b=true;
		 
		if(sentence.contains("abcdefghijklmnopqrstuvexyz")) {     
			
			System.out.println("string is  pangram");
			
			
		}else {
			
			System.out.println("string is not pangram");    
			
		}
		
		
/*		
for(int i=0;i<alphalist.length();i++) {
	
	
	for(int j=0;j<alpha.length;j++) {
		
		if(alphalist.contains(alpha[j])
		{
			
			
			
		}
		
	}*/
	
	
	
	
	
}		
		
		
		
		
		

	}


