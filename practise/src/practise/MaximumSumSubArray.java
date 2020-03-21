package practise;

public class MaximumSumSubArray {

	public static void main(String[] args) {
		int inputArray[]= {-2,2,5,-11,6};
		
		//solution using kadene's algorithm
		
		int max_sofar=Integer.MIN_VALUE;
		int ending_max=0;
		
		int s=0,start=0,end=0;
		
		for(int i=0;i<inputArray.length;i++) {
			
			ending_max=ending_max+inputArray[i];
			
			if(ending_max>max_sofar) {
				max_sofar=ending_max;
				start=s;
				end=i;
				
			}
			
			if(ending_max<0) {
				
				ending_max=0;
				s=s+1;
			}
			
			
			
		}
		
		
	System.out.println(max_sofar);	
	System.out.println("start index" +start);	
	System.out.println("end index" +end);	
		
	}

}
