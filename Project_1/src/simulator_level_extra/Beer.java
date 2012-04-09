package simulator_level_extra;

class Beverage{
	Beverage(){ System.out.println("beverage");}
}

class Beer extends Beverage{
	public static void main(String[] args) {		
		Beer b = new Beer(14);
	}
	
	public int Beer(int i){ //it's won't compile
		this();
		System.out.println("beer");
	}
	public Beer(){
		System.out.println("beer2");
	}
}
