package simulator_level_extra;

class ArrayCalculator {
	int []holder = {1,2,3,4,5};
	
	public static void main(String[] args) {
		new ArrayCalculator().go(1);
	}

	void go(int x){
		holder[x % 5] = x++;
		go(x);
	}
}
