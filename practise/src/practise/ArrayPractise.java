package practise;

import java.util.Arrays;

public class ArrayPractise {

	public static void main(String[] args) {
		
		
		int intArr[] = {20,30,10,50,40}; 
		/*Arrays.sort(intArr); 
		System.out.println(Arrays.toString(intArr)); */   
		
		
		
		int size=intArr.length;
		
		  int a[]= new int[5];
        for(int i=size-1;i>=0;i--) {
        	    // a[i]=intArr[i]; 
        	
        	System.out.println(intArr[i]);  
        	
        }
		
      //  System.out.println(Arrays.toString(a));
		
		/* System.out.println("Integer Array as string: "
                 + Arrays.toString(intArr));  
		
		// To convert the elements as List 
		
        System.out.println("Integer Array as List: "
                           + Arrays.asList(intArr)); 
		
        System.out.println("Integer Array: "
                + Arrays.toString( 
                      Arrays.copyOf(intArr, 9))); */
		 

	}

}
