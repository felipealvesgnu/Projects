package simulator_level_extra; 

class Rubbish{
	public static void main(String[] args) {
		Rubbish r1 = new Rubbish();
		Rubbish r2 = new Rubbish();
		Rubbish r3 = new Rubbish();
		Rubbish r4 = r2;
		Rubbish r5 = r4;
		r2 = null;
		r4 = r2;
		r1 = r5;
		//how many objects are eligible for garbage collector? Answer: 1
	}
}