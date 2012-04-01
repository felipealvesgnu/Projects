package simulator_level_2;

class Top {
	static int x =1;
	public Top(){
		x *= 3;
	}

}

class Middle extends Top{
	public Middle(){ x += 1;}
	public static void main(String[] args) {
		Middle m = new Middle();
		System.out.println(x);
	}	
}
