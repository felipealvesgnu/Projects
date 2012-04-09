package simulator_level_extra;

class Thread2 implements Runnable{
	void run(){	//won't to compile
		System.out.println("go");
	}
	
	public static void main(String[] args) {
		Thread2 t2 = new Thread2();
		Thread t = new Thread(t2);
		t.start();
	}

}
