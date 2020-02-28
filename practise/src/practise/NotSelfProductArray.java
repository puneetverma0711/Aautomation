package practise;

public class NotSelfProductArray {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4};
		
		int product=1;
		
		
		outer: for(int i=0;i<a.length;i++)
		{
			
			
		 for(int j=0;j<a.length;j++) 
			{
				
				inner:if(a[i]==a[j]) 
				{
					break inner;
					
				}else {
					product=product*a[j];  
					
				}
				
				
			}
		 System.out.println(product);   
			product=1;
		
		
			
		}

		// System.out.println(product);       
		
	}

}
