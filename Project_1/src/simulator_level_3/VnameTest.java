package simulator_level_3;

class Vname implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}
class VnameTest{
	
	public static void main(String args[]) {
		Vname vm = new Vname();
		Thread t = new Thread(vm);
		t.setName("Lopes");
		t.start();
	}
}
