package practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaximPalin {

	public static void main(String[] args) {
		//43435
		String number="092282";
		char a[]=number.toCharArray();
		
char c = 0;
		int n=3;
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
		
		String higheststring=String.valueOf(c);
	             int highestdigit=Integer.parseInt(higheststring);
		
	             int numberarray[]=new int[number.length()];
	             
	             for(int i=0;i<numberarray.length;i++)
	             
	             {
	            	 numberarray[i]=number.charAt(i)- '0';
	            	 
	             }
	             
	
		int resultpalin[]=createpalinrecursion(numberarray,highestdigit,n);
		String resultpalin1="";
		for(int u=0;u<resultpalin.length;u++) {
			resultpalin1=resultpalin1+String.valueOf(resultpalin[u]);
			
			  
		}
		
		
		
  		String reversepalin="";
                for(int m=resultpalin.length-1;m>=0;m--) {
                	reversepalin=reversepalin+String.valueOf(resultpalin[m]);

		}
		
	
               
		
                
            String result="";
            
            if(resultpalin1.equalsIgnoreCase(reversepalin)) {
            	
            	result="maximum string palindrome is: " +resultpalin1;
            }else {
            	
            	result="-1";
            }
                
                
                
           System.out.println(result);    
                
		
	}

	public static int[] createpalinrecursion(int arr[],int a,int b) {
		
		int k[]=createpalin(arr,a,b);
		
		
		/*for(int i=0;i<k.length;i++) {
			
			System.out.println(k[i]);
	
		}*/
		
		
		
		return k;
		
		
		
		
	}

	public static int[] createpalin(int resultarr[],int replacedigit,int changelimit) {
		
		int low=0;
		int high=resultarr.length-1;
		
		for(int z=0;z<changelimit;z++) {
			
			if(resultarr[low]==resultarr[high])
			{
				
				low++;
				high--;
			}
			
			
			if(resultarr[low]!=resultarr[high])
			{
				resultarr[low]=replacedigit;
				resultarr[high]=replacedigit;  
				
			}
			
			
		}
		
		
		
		return resultarr;
		
		
		
		
		
		
	}

	
	
	
	
	
	
	
}
