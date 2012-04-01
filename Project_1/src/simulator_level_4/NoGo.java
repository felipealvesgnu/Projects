package simulator_level_4;

class NoGo implements Runnable{
	private static int i;
	
	public void run(){
		if(i % 10 != 0){ i++;}
		for (int x = 0; x < 10; x++, i++) {
			if(x == 4) 
				Thread.yield();
		}
	}
	public static void main(String [] args){
		NoGo n = new NoGo();
		for(int x=0; x<101;x++){
			new Thread(n).start();
			System.out.print(i + " ");
		}
	}
}
