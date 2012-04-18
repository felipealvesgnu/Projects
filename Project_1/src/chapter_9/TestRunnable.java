package chapter_9;

class MyThread2 extends Thread{
	public MyThread2(Runnable r){
		super(r);
	}
	
	public void run(){
		System.out.println("My Thread");
	}
}

class MyRunnable implements Runnable {   
	  public void run() {System.out.println("My runnable");}   
}  

public class TestRunnable {  
	  public static void main(String[] args) {   
		  new MyThread2(new MyRunnable()).start(); //it will to execute the MyRunnable's method run.
		  new Thread(new MyRunnable()).start();  //it will to execute the run's thread method that will overrides for construct's param.
	  }   
} 

