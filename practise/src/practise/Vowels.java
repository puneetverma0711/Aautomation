package practise;

public class Vowels {

	public static void main(String[] args) {
		
		String[] a= {"j","o","a","q","u","i","n", "p","h","o","e","n","i","x"};
		String[] v= {"a","e","i","o","u"};
		int count=0;
		
		for (String name:a ){
			for (String vowel:v){
			if(name==vowel)
			count++;
			else continue;
			}

			}

		
		System.out.println(count); 
		
		
		
		

	}

}
