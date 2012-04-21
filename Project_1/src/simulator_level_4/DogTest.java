package simulator_level_4;

class Dog{
	
}
class Harrier extends Dog{

}

class DogTest {
	public static void main(String[] args) {
		Dog d1 		= new Dog();
		Harrier h1  = new Harrier();
		Dog d2 	    = h1;
		Harrier h2  = (Harrier) d2;
		Harrier h3  = d2;
		//Harrier h3  = (Harrier) d1;
	}
}
