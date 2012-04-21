package chapter_9;

public class ThBlock implements Runnable{
	public void run(){
		block();
	}
	public void block(){
		System.out.println("no-synchronized " + Thread.currentThread().getName());		
		synchronized(this){
			for (int x = 0; x < 2; x++) {
				System.out.println("synchronized " + Thread.currentThread().getName());
				try{
					Thread.sleep(1000); //giving opportunity to others thread, but remember the bahavior of method sleep isn't guaranteed
				}catch(Exception e){}
			}
		}
	}
	public static void main(String[] args) {
		ThBlock tb = new ThBlock();
		Thread t   = new Thread(tb, "t1");		
		Thread t2  = new Thread(tb, "t2");
		t.start();
		t2.start();
	}

}
