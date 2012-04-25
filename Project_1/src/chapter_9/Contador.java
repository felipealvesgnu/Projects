package chapter_9;

public class Contador {
	public static void main(String[] args) {
		Calc c = new Calc();
		c.start();
		synchronized (c) { //the thread gets the block on 'c' 
			try {
				c.wait(); // the thread releases the lock and waits for notify.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Montagem " + c.mont);
		}
	}
}

class Calc extends Thread{
	int mont = 10;
	
	public void run(){
		synchronized(this){
			for(int y=0;y < 2;y++){
				mont += 10;				
			}
			notify();
		}
	}
}
