package practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MergeArray {

	public static void main(String[] args) {
		
		
		int a[]= {2,5,9,15,12,19};
		int b[]= {7,8,4,1,10};
		
		
		
	List<Integer> li=new ArrayList();
	

	for(int i=0;i<a.length;i++) {
		
		li.add(a[i]);
		
		
	}
		
	
	for(int j=0;j<b.length;j++) {
		
		li.add(b[j]);
		
	}
	
	Collections.sort(li);    
	//Collections.sort(li, Collections.reverseOrder());   
	

	
	
	for(int k=0;k<li.size();k++)
	{
	
		System.out.println(li.get(k));     
	
		
	}

	
	
	
	
	
	
	
	
	}
}
