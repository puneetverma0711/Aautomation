package package1;

public class ValidateSum {

	public static void main(String[] args) {
		
		int a[]= {1,2,4,6,8,10};
		int sum=12;
		for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<a.length;j++) {
				
					if(a[i]==a[j]) {
						
						
						break;
					}
						
					else if(a[i]+a[j]==sum){
						System.out.print(a[i]);
						System.out.print(" ");
						System.out.print(a[j]);  
						System.out.println();
						System.out.println("sum is matched");
						break;
					}else {
						System.out.print(a[i]);
						System.out.print(" ");
						System.out.print(a[j]); 
						System.out.println();
						System.out.println("sum is not matched");
					}	
						
							
					
					
				}
			
		
			
		}
		

	}

}
