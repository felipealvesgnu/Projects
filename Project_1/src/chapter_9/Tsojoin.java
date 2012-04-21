package chapter_9;

public class Tsojoin implements Runnable{
	public void run(){
		for (int i = 0; i < 10; i++) {
			System.out.println("join first");
		}
	}
	public static void main(String[] args) {
		Tsojoin ts = new Tsojoin();
		Thread t   = new Thread(ts);
		t.start(); //this thread will be executed first than the main thread 
		
		try{
			t.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		//t.start(); //if we put start method here(after called join method), so it'll executes after the current thread conclude,
					//so, the main thread will be execute and after that the thread t. 
		System.out.println("MAin after join");
	}

}