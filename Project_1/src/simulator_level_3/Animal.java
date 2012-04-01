package simulator_level_3;

interface Animal {
	void eat();
}

abstract class Feline implements Animal{
	
}

class HouseCat extends Feline{
	public void eat(){}
}
