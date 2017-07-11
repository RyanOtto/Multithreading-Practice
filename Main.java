public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		SampleThread test = new SampleThread();
        Thread t1 = new Thread((test));
        Thread t2 = new Thread((test));
        Thread t3 = new Thread((test));
        
        t1.start();
        t2.start();
        t3.start();
	}

}
