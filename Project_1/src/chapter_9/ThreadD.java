package chapter_9;

class E implements Runnable{
	
	E(String name){
		new Thread(this, name).start();
	}
	
	public void run(){
		System.out.println(Thread.currentThread().getName());
	}	
}

class ThreadD {

	public static void main(String[] args) {
		//Thread.currentThread().setName("Main");
		
		Runnable a = new E("Worker");
		
	}
}
