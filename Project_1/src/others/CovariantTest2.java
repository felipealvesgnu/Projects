package others;

import java.io.IOException;

class First {
	public Object method1(){
		System.out.println("Calling super class method");
		return new String("Base");
	}
	
	public int method2() throws IOException{
		return 2;
	}
}

class Second extends First{
	public String method1(){
		System.out.println("Calling sub class method");
		return new String("Derived");
	}
	
	public int method2() { //overwritten
		return  3;
	}
	
	public long method2(int a) { //overloaded
		return  3L;
	}
}


public class CovariantTest2 {

	public static void main(String[] args) {
		First o  = new Second();
		//Second o = new First();
		String s = o.method1();
		System.out.println(s);
	}

}