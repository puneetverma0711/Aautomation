package practise;

public class TestRecursion4 {

	public static void main(String[] args) {
	int noofcats=10;
	System.out.println("total no of eyes is: " +noofeyes(noofcats));
	
	
	
	}

	
	
	public static int noofeyes(int n) {
		
		if(n==0) {
			
			return 0;
		}
		
		
		return 2*n+noofeyes(n-1)*0;
	
	}
	
	
	
	
}
