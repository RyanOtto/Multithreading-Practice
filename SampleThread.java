public class SampleThread implements Runnable {

	public void run() {
		try {
			reportForDuty();
			reportForDuty2();
		} catch (InterruptedException e) {
			System.out.println("Exiting thread!");
		}
	}
	
	public void reportForDuty() throws InterruptedException{
		int i=0;
		for(int j=0; j<3; j++){
			i++;
			System.out.println(i);
			Thread.sleep(2000);
		}
		System.out.println();
	}
	
	public synchronized void reportForDuty2() throws InterruptedException{
		int i=0;
		for(int j=0; j<3; j++){
			i++;
			System.out.println(i);			
			Thread.sleep(2000);
		}
		System.out.println();
	}
}
