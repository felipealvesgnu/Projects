package chapter_8;

class A {void m() {System.out.println("outer");} }

public class TestInners {
	
	public static void main(String[] args) {
		new TestInners().go(); // middle
	}
	
	void go(){
		new A().m();
		class A { void m() { System.out.println("inner"); }}
		//new A().m();
	}
	class A { void m() { System.out.println("middle"); }}
}
