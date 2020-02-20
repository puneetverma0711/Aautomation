package practise;

import java.util.Scanner;

public class FuelAmount {

	public static void main(String[] args) {
      int amount=0;
System.out.println("please enter kilometer"); 
		Scanner sc = new Scanner(System.in); 
		  
        
        int  kilometer = sc.nextInt(); 
		
        System.out.println("kilometer distance: "+kilometer); 
        
        if(kilometer>15 && kilometer>0) {
        	
        	amount=100 *kilometer;
        	 System.out.println("train fuel amount is: "+amount); 
        }else {
        	 System.out.println("train fuel amount is less than 1500"); 
        	
        }
       
        
        
        
	}

}
