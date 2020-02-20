package practise;

public class Palin {

	public static void main(String[] args) {
		
		
		int n=1222,num=12212,rev=0,rem;
		
		

while(num>0)
{

rem=num%10;
rev=rev*10+rem;
num=num/10;


}



		
System.out.println(rev);  
System.out.println(n);  
		if(rev==n) 
			System.out.println("number is palindrome");  
			
		else 
			
			System.out.println("number is not palindrome");
		
		
		
		

	}

}
