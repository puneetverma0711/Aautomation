package practise;

public class TestRecursion5 {

	public static void main(String[] args) {
		
		int noofmobiles=21;  
		
		if(noofmobiles%2==0) {
			System.out.println("no of speakers in the even numbered mobile phones are :" +evenfunc(noofmobiles));
			
			
		}else {
			System.out.println("no of speakers in the odd numbered mobile phones are:" +oddfunc(noofmobiles));
			
		}
		
		

	}

	
	public static int evenfunc(int n) {
          if(n==0) {
			
			return 0;
		}
		
		
		return 2*n+evenfunc(n-1)*0;
	
	}
	
	
	
public static int oddfunc(int n1) {
		
	if(n1==0) {
		
		return 0;
	}
	
	
	return 1*n1+evenfunc(n1-1)*0;		
	
	
	}
	
}
