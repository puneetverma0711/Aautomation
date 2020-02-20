package practise;

import java.io.*; 

//Java code to demonstrate star patterns 
public class pyramid 
{ 
	// Function to demonstrate printing pattern 
	public static void printStars(int n) 
	{ 
		int i, j; 

		// outer loop to handle number of rows 
		// n in this case 
		for (i=n; i > 0; --i)    
		{ 

			
			for(j=5; j>=i; --j) 
			{ 
				// printing stars 
				System.out.print("*"); 
			} 

			// ending line after each row 
			System.out.println(); 
		}
} 

	// Driver Function 
	public static void main(String args[]) 
	{ 
		int n = 5; 
		printStars(n); 
	} 
} 

