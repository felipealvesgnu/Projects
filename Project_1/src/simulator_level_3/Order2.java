package simulator_level_3;

class Order2 implements Runnable{

	public void run(){
		for (int i = 0; i < 4; i++) {
			try{
				Thread.sleep(100);// the objectives here is to give preference to another threads 
			}catch(Exception e ){ }
		System.out.print("r ");
		}
	}
	
	public static void main(String[] args) {
		Thread t = new Thread(new Order2());
		t.start();
		for(int x=0; x < 4; x++){
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print("m ");
		}
	}

}
