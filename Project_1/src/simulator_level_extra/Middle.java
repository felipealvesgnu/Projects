package simulator_level_extra;

class Top{
	static int x = 1;
	public Top(int y){ x *= 3;}
}

class Middle extends Top{
	public Middle(){ 
		super(x);
		x += 1; 
	}
	public static void main(String[] args) {
		Middle m = new Middle();
		System.out.println(x);
	}

}
