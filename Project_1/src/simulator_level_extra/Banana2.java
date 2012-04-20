package simulator_level_extra;

class Banana2 {
	static int x = 4;	
	public static void main(String[] args) {
		 int x = 2;
		 Banana2 b = new Banana2();
		 b.go(x);
	}
	
	void go(int x) {
		++x;
		System.out.println(x);
	}

}
