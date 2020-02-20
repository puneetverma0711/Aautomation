package practise;

public class Shiftarray {

	public static void main(String[] args) {
		
		int a[]= {2,5,4,3,6};
		int temp=a[4];
		int b[]= new int[5];
		
		
		
		
		
		
		for(int i=a.length-2;i>=0;i--)
		{
			 
			a[i+1]=a[i];
		}
		
		a[0]=temp;
		
		
		for(int j=0;j<a.length;j++)
		{
			System.out.println(a[j]);     
			
			
		}
		
		
		

	}

}
