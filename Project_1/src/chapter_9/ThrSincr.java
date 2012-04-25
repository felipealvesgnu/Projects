package chapter_9;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

public class ThrSincr implements Runnable{
	private int z = 10;
	
	public void run(){
		value();
	}
	
	public synchronized void value(){
		for (int i = 0; i < 2; i++) {
			z -= 5;
			System.out.println("value " + z);
			try{
	
				Thread.sleep(100); //we use the sleep method when want create an opportunity to others threads execute.
								   // nevertheless it won't cause effect because the method value is synchronized
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		ThrSincr ts = new ThrSincr();
		Thread t    = new Thread(ts);
		Thread t2   = new Thread(ts);
		t.start();
		t2.start();
	}

}
