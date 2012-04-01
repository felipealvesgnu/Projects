package simulator_level_3;

interface I { void go(); }

abstract class A implements I{ }

class C extends A{
	void go(){ } 
}