package chapter_9;

public class TbInsta extends Thread{
	public TbInsta(String s){
		super(s);		
	}
	public void run(){
		ita();
	}
	public synchronized void ita(){
		for (int y = 0; y < 2; y++) {
			System.out.println(Thread.currentThread().getName());
			try{
				Thread.sleep(1000);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		TbInsta ti = new TbInsta("ti");
		TbInsta tb = new TbInsta("tb");
		tb.start();
		ti.start();
	}

}
