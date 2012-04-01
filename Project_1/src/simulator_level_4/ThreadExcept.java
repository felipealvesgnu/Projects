package simulator_level_4;

public class ThreadExcept implements Runnable{

	public void run(){
		throw new RuntimeException("excessao");
	}
	public static void main(String[] args) {
		new Thread(new ThreadExcept()).start();
		try{			
			int x = Integer.parseInt("1");
			Thread.sleep(x);
			System.out.println("main");
		}catch(Exception e){
			
		}
		System.out.println("funcionando");
	}

}
