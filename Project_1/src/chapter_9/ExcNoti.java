package chapter_9;

public class ExcNoti implements Runnable{
	
	public void run(){
		//synchronized (this) {		
			for(int z=0; z<2;z++)
				System.out.println(Thread.currentThread().getName() + " here");
			notify(); // it'll generate an exception, because notify is used within a not synchronized context.
		//}
	}
	
	public static void main(String[] args) {
		ExcNoti d = new ExcNoti();
		Thread t  = new Thread(d);
		t.start();
		
		synchronized (t) {
			try {
				t.wait();
				for(int j=0; j<3;j++){
					System.out.println(Thread.currentThread().getName());
				}
			} catch (Exception e) {				
			}
		}
	}

}
