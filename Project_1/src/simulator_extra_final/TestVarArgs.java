package simulator_extra_final;

class TestVarArgs {
	static int x = 2;
	static{ x = 4;}
	
	public static void main(String[] args) {
		int y = x + 1;
		System.out.println(y);
	}
}
