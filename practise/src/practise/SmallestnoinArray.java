package practise;

public class SmallestnoinArray {

	public static void main(String[] args) {
		
		
		int a[]={-2,5,6,7,8,-34,6,56,45,6,44};
		
		samllestnum(a);
		largestnum(a);
		
	}

	static int samllestnum(int b[]){
		int smallnum=4;

		for(int i=0;i<b.length;i++){
		if(b[i]>smallnum){
		continue;
		}else{

			smallnum=b[i];

		}

		}

		System.out.println("smallest number in array is" +smallnum);
		return smallnum;
		
		
		}
	
	
	
	
	static int largestnum(int c[]){
		int largenum=4;

		for(int i=0;i<c.length;i++){
		if(c[i]>largenum){
			largenum=c[i];
		}else{

			continue;

		}

		}

		System.out.println("largest number in array is" +largenum);
		return largenum;
		
		
		}
	
	
	
	
	
	
}
