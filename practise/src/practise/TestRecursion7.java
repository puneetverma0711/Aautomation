package practise;

public class TestRecursion7 {
	static int f1=1,f2=2,i=0,result,number=10;	
	public static void main(String[] args) {
		 System.out.println(f1);  
		 System.out.println(f2);    
	fibofunc(number);
	
	}

	
	
public static int fibofunc(int n) {
	
	if(n==0) {
		  
		return 1;
		
	}
	
	         result=f1+f2;
			f1=f2;
			f2=result;
             System.out.println(result);  
             return fibofunc(n-1);
             
	}
	
	
	
	
	/*public static void fibofunc(int n) {
        
		int i=0;
		int f1=1,f2=2;
		int result;
		 System.out.println(f1);  
		 System.out.println(f2);    
		while(i<=n) {
			result=f1+f2;
			f1=f2;
			f2=result;
             System.out.println(result);  
			i++;
		}
	
	}*/
	
	

	
	
	
	
	
	
	
}
