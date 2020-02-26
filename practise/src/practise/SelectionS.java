package practise;

public class SelectionS {

	public static void main(String[] args) {
		
		int a[]= {1,3,5,2,4,6,7}; 
		
		int min=0;
		int temp=0;
		int min_swap=0;
		for(int i=0;i<a.length;i++) {
			min=i;
			for(int j=i+1;j<a.length;j++) {
				
				if(a[j]<a[min])
				{
					min=j; 
					
				}
			
			}
		
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
			
			if(a[i]!=a[min]) {
				
				min_swap++;
			}
			
		}
		
		
		for(int k=0;k<a.length;k++)
		{
			
			System.out.println(a[k]);
			
			
		}
		     
		
		
		System.out.println("min no of swap are: " +min_swap );
		
		

	}

}
