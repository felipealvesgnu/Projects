package simulator_level_4;

class FWD{
	int doMud(double x){
		return 1;
	}
}

class Subaru extends FWD{
	int doMud(int... y){ return 2;}
	int doMud(double z){ return 3;}
}
class Race {

	public static void main(String[] args) {
		FWD f = new Subaru();
		System.out.println(f.doMud(7));
	}

}
