package simulator_level_extra;

class Book{
	private final void read(){
		System.out.print("book ");
	}	
}

class Page extends Book{
	public static void main(String [] args){
		new Page().read(); //it's works
		new Book().read();//it's not compile
	}
	private final void read(){
		System.out.print("page ");
	}
}