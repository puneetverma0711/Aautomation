package practise;

public class InsertionS {

	public static void main(String[] args) {
		int a[]= {38,72,62,42,52}; 
		
		int temp,j;
		
		for(int i=0;i<a.length;i++) {
			
			temp=a[i];
			j=i;
			
			while(j>0 && a[j-1]>temp) {
				
				a[j]=a[j-1];
				j--;
				
			}
			
			a[j]=temp;
		}

		
		for(int k=0;k<a.length;k++)
		{
			
			System.out.println(a[k]);
			
			
		}
		
		
		
		
		
		
	}

}
