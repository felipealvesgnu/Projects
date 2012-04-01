package simulator_level_3;


public class Cd implements Runnable {
	
	@Override
	public void run() {
		System.out.println("join");
	}
	
	public static void main(String[] args){
		Cd cd = new Cd();
		Thread t = new Thread(cd);
		//t.start();
		try {
			t.join();
		} catch (InterruptedException e) {	}
		t.start();
		System.out.println("main depois join");
	}
}
