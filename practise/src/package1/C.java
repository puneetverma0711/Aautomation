package package1;

public class C extends Thread {

	public void run() {
		
		
		for(int i=0;i<5;i++) {
		System.out.println("class c method"); 
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	
}
