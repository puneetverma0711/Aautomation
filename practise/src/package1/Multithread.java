package package1;

public class Multithread {

	public static void main(String[] args) {
		C obj1=new C();
		D obj2=new D();
		
		try {
			obj1.start();
			Thread.sleep(4000); 
			obj2.start();
		}
		
		catch(Exception e) {
			e.printStackTrace();
			
		}
		
	}

}
