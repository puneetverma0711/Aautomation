package practise;

import java.util.ArrayList;

public class MissingElement {

	public static void main(String[] args) {
		
		
		int a[]={1,2,3,4,6,7,9,10};

		ArrayList<Integer> li= new ArrayList<Integer>();

		for(int i=0;i<100;i++){
		li.add(i);
		}

		
		int j;
		for(j=0;j<a.length;j++){

			if(!li.contains(a[j])){
				//System.out.print("missing element is" +j);   
			}else{

			continue;
			}
			
			}

		System.out.println("missing element is" +j);   
		
		
		

	}

}
