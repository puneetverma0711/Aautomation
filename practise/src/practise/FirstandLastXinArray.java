package practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class FirstandLastXinArray {

	public static void main(String[] args) {
		
		int a[]= {2,3,6,7,7,8,8,3,12};
		int x=7;
              List<Integer> li= new ArrayList<>();
               
            
              //for each loop to store array values into integer variable  and then add into list of integers using value 
             // of method of integer wrapper class
              for(int i:a) {
            	 li.add(Integer.valueOf(i));  
            	 
            	 
             }
            	
              /*for(int i=0;i<a.length;i++) {
            	  
            	  li.add(a[i]);
            	  
            	  
              }*/
              
              List<Integer> b = new ArrayList<>();
              
             
             for(int j=0;j<li.size();j++) {
            	
            	if(li.get(j).equals(x)) {
       		    b.add(j);
        		// System.out.println("position is:" +j); 
        		 
        		 
        	 }
            	 
             }
            	 
            int last= b.get(b.size()-1);
             
             System.out.println("first position of value x is: " +b.get(0));  
             System.out.println("last position of value x is: " +last);  
         
          
             
             
            	 
            	 
            	
            	 
             }
		
             
             
	}


