package chapter_9;

import java.util.LinkedList;

class ThreadA {

	public static void main(String[] args) { //here we have a Thread
		ThreadB b = new ThreadB();
		b.start();		
		synchronized (b) {
			try{
				System.out.println("Waiting for b complete...");
				b.wait();				
			}catch (Exception e) {
				System.out.println("Total is: " + b.total);
			}
		}
	}
}

class ThreadB extends Thread{
	int total;
	
	public void run(){
		synchronized(this){
			for(int i=0; i<100;i++){
				total += i;
			}
			notify();
		}		
	}
}