package chapter_9;

public class Leader implements Runnable {

	@Override
	public void run() {
		Thread t = new Thread(new Leader());
		t.start();
		System.out.println("m1 ");	
		t.join();		
		System.out.println("m2 ");
	}

	public static void main(String[] args) {
		System.out.println("r1 ");
		System.out.println("r2 ");
	}

}
