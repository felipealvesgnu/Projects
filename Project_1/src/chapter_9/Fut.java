package chapter_9;

interface Gol{
	void g();
}

class Fut {
	static Gol g1 = new Gol(){
		public void g(){ //without public keyword it doesn't compile
			System.out.println("go1");
		}
	};
	public static void main(String[] args) {
		g1.g();
	}

}
