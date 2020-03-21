package practise;

import java.util.ArrayList;

public class CommonChild {

	public static void main(String[] args) {
		int length;
		String a="ABDEF";
		char[] a1=a.toCharArray();
		String b="FBDAMN";
		char[] b1=b.toCharArray();
		length= commonchild(a1,b1,a1.length,b1.length);
		System.out.println(length);  
		
	
	}

	
	public static int commonchild(char[] x,char[] y,int i, int j) {
		
		 
		
			
				if(i<=0 || j<=0) {  
					 return 0;
				}
				
				
			if(x[i-1]==y[j-1])
			{
				
				return 1+commonchild(x,y,i-1,j-1);
				
				
		}else {
		
			return Math.max(commonchild(x,y,i-1,j), commonchild(x,y,i,j-1));
			
			
		}
			
		
	
	}	


	
}
