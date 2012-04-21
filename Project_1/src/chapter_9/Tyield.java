package chapter_9;

public class Tyield extends Thread{
	public void run(){
		for (int y = 0; y < 3; y++) {
			System.out.println(Thread.currentThread().getName() + " - " + Thread.currentThread().getPriority());
			Thread.yield(); //Create an opportunity to others threads, that with the same or bigger priority, 
							//have the opportunity to execute, but remember nothing is guaranteed with threads; 
		}
	}
	
	public static void main(String[] args) {
		Tyield ty = new Tyield();
		ty.setName("Th1");
		ty.start();
		Tyield ty2 = new Tyield();
		ty2.setPriority(Thread.MAX_PRIORITY);
		ty2.start();
		ty2.setName("Th2");
	}

}
