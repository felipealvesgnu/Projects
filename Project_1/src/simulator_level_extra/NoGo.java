package simulator_level_extra;

public class NoGo implements Runnable{
	private int i;
	
	public void run(){
		if(i % 10 != 0){i++;}
		for (int x = 0; x < 10; x++, i++) {
			if(x == 4) 
				Thread.yield();
			System.out.println(i + " ");
		}
	}
	
	public static void main(String[] args) {
		NoGo n = new NoGo();
		for (int x = 0; x < 100; x++) {
			new Thread(n).start();
		}
	}

}
