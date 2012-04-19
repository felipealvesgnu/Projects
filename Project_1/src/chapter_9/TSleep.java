package chapter_9;

public class TSleep extends Thread{
	
	TSleep(String s){
		super(s);
	}
	
	public void run(){
		for(int z=0;z<5; z++){
			System.out.println(Thread.currentThread().getName());
			try{
				Thread.sleep(1000); //we use the sleep method when want create an opportunity to others threads execute.
									//remember that this bahavior isn't guaranteed
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		TSleep ts  = new TSleep("Carlos");
		TSleep ts2 = new TSleep("maria");
		ts.start();
		ts2.start();
	}

}
