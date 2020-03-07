package practise;

public class Twoforloops {

	public static void main(String[] args) {

		String number="3943";
		char a[]=number.toCharArray();
		
		outer:for(int i=0;i<a.length;i++) {
			
			for(int j=a.length-1;j>0;j--) {
				
				System.out.println(a[i]);  
				System.out.println(a[j]);
				continue outer;
				
			}
			
			
		}
		
		

	}

}
