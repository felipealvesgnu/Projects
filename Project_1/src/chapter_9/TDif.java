package chapter_9;

public class TDif extends Thread {
	
	TDif(String s){
		super(s);
	}
	
	public void run(){
		dado();
	}
	
	public synchronized void dado(){
		for (int a = 0; a < 3; a++) 
			System.out.println(Thread.currentThread().getName());
		try{
			Thread.sleep(100);
		}catch(InterruptedException e){e.printStackTrace();	}
	}
	
	public static void main(String[] args) {
		TDif td = new TDif("thread - 1");
		TDif td2 = new TDif("thread - 2");
		
		td.start();
		td2.start();
	}

}
