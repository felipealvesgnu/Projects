package chapter_9;

public class Te {

	public static synchronized void main(String[] args) throws InterruptedException{
		Thread t = new Thread();
		t.start();
		System.out.println("X");
		t.wait(10000);	//The method is synchronized, but it's not synchronized	on t so the exception will be thrown.
		System.out.println("Y");
	}

}
