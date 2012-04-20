package simulator_level_extra;

class Wrench2 {
	int size;
	public static void main(String[] args) {
		Wrench2 w = new Wrench2();
		w.size = 9;
		Wrench2 w2 = go(w, w.size);
		System.out.println(w2.size);
	}

	static Wrench2 go(Wrench2 wr, int s){
		s = 7;
		return wr;
	}
}
