package simulator_level_extra;

class Cat{
	Cat(int c){System.out.print("cat" + c + "");}	
}

class SubCat extends Cat{
	SubCat(int c){
		super(5);	
		System.out.println("cable");
	}
	SubCat(){} //it's won't compile, because the super class doesn't has a constructor without arguments
	public static void main(String[] args) {
		
	}
}