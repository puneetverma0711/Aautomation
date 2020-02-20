package practise;

public class ArraySum {

	public static void main(String[] args) {
	
		
		
		int a[]= {4,6,10,15,20}; 
		
		int sum=16;
	
		  
		
		outer:for(int i=0;i<a.length;i++) {
			
	for(int j=0;j<a.length;j++)
			
			{
				
				if(a[i]+a[j]==sum && i!=j)
				{
					
					System.out.println("first number is: " +a[i] +" second number is: " +a[j]);  
					break outer; 
				} 
				
				
			}
			
	
}
		


	}

}
