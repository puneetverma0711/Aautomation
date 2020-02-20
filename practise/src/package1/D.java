package package1;

public class D extends Thread {

	
	public void run() {
		
		
		for(int j=0;j<5;j++) {
			System.out.println("class d method"); 
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		
	}
}
