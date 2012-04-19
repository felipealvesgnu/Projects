package chapter_9;

class A extends Thread{
	public A(Runnable r){super(r);	}
	
	public void run(){
		System.out.println("A");
	}
}

class B implements Runnable{
	public void run(){
		System.out.println("B");
	}
}

class ThreadC {
	public static void main(String[] args) {
		new A(new B()).start();
	}
}
  