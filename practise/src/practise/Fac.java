package practise;

public class Fac {

	
	// method to find factorial of given number 
		static int factorial(int n) 
		{ 
			if (n == 0) 
			return 1; 
			
			return n*factorial(n-1); 
		} 
		
		// Driver method 
		public static void main(String[] args) 
		{ 
			int num = 5; 
			System.out.println("Factorial of "+ num + " is " + factorial(5)); 
		} 
	
	
	
	
	
	
	
	
	
	/*public static void main(String[] args) {
		double fact=1;
		int num=8;
		for(int i=num;i>0;i--){
		fact=fact*i;
		}

		System.out.println(fact);

	}
*/
}
