package practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaximPalin {

	public static void main(String[] args) {
		
		String number="3943";
		char a[]=number.toCharArray();
		
char c = 0;
		int n=1;
		int compare,flag=0;
		outer:for(int i=0;i<a.length-1;i++) {
			 compare=i;
               for(int j=i+1;j<a.length;j++) {

       			if(a[compare]>a[j] && i!=j) { 
       				c=a[compare]; 
       				
       				flag++;
       			}else {
       				a[compare]=a[j];
       				c=a[compare]; 
       				
       			} 
            	   
               }
	
            if(flag!=0) {
            	break outer;
            	
            }   
               
		}
		
		
		
	/*int p=Character.getNumericValue(c);
	String highestdigit=Integer.toString(p);
	System.out.println(highestdigit); */
		
		
		
		/*
		
		String finalnum="";
		while(n>0) {
			
			do {
				int count=0;
				if(low==high)
				{
					
					
					low++;
					high--;
					
					
				}else {
					
					low=p;
					high=p;
					finalnum[0]=low;
					finalnum[1]=high;
					System.out.println(finalnum[0]);
					System.out.println(finalnum[1]);
					count++;
				}
				if(count!=0) {
					break;
					
				}
		
			
			}while(low!=high);
			
			
			
			n--;
		}
		*/
		
		
		
	}

}
