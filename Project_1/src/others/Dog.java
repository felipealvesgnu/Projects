package others;

class Animal{
	static void doStuff(){
		System.out.println("a ");
	}
}


class Dog extends Animal{
	static void doStuff(){
		System.out.println("d ");
	}	
	public static void main(String[] args) {
		Animal [] a = {new Animal(), 
				new Dog(), 
				new Animal()};
		for (int i = 0; i < a.length; i++) {
			a[i].doStuff();
		}
		
	}

}
