package practise;

public class TestRecursion2 {
	static int value=1;
	static int descvalue=10;
	static int number=10;
	public static void main(String[] args) {
		System.out.println("numbers in ascending order");
		print(value);
		System.out.println("****************");
		System.out.println("numbers in descending order");
		printdesc(descvalue);

	}

	
public static int print(int n) {
		
		if(value>number) {
			return value;
	
		}
		System.out.println(value);	 
return print(value++);
	
	}

	
/*	
public static void print(int n) {
		
	if(n==0) {
			return;
	
		}
		 
		print(n-1); 
		System.out.println(n);	
	
	}
	
	
public static void printdesc(int n) {
	
	if(n==0) {
		return;

	}
	System.out.println(n);	
	printdesc(n-1); 
	

}*/



public static int printdesc(int n) {
		
		if(descvalue<=0) {
			return descvalue;
	
		}
		System.out.println(descvalue);	 
return printdesc(descvalue--);
	
	}
	
	
	
	
}
