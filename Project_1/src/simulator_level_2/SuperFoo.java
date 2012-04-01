package simulator_level_2;

class SuperFoo {
	SuperFoo doStuff(int x){
		return new SuperFoo();
	}
}

class Foo extends SuperFoo{
	//Foo doStuff(int x){return new SuperFoo();}
	SuperFoo doStuff(int y){ return new Foo();}
	
}
