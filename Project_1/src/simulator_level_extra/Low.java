package simulator_level_extra;

class High{
	private High(int i){ //won't to compile, because of the private constructor
		System.out.println("high");
	}
}

class Low extends High{
	public Low(){	
		System.out.println("low const");		
	}
	public static void main(String[] args) {
		Low l = new Low();
	}

}
