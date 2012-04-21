package chapter_9;

public class TestThreads2 {

	public static void main(String[] args) {
		Thread t = new Thread(new TestThreads2().new MyThread());
		
        t.start();  
        System.out.println("Hello");  
        
        for(int i=0; i<100; i++)  
            System.out.println("Olá2 - " + i);  
      
        try{  
            t.join();  
        }catch(Exception e){  
                      
        }  
	}

	class MyThread implements Runnable{
		public void run(){
			System.out.println("Hello Thread");
		}
	}
}
