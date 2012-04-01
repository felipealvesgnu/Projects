package simulator_level_3;

class Yield implements Runnable {

	public static void main(String args[]){
		Yield y = new Yield();
		Thread t = new Thread(y);
		t.start();
		t.setPriority(t.MAX_PRIORITY);
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

}
