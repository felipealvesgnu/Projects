class First {
	public Object method1(){
		System.out.println("Calling super class method");
		return new String("Base");
	}
}

class Second extends First{
	public String method1(){
		System.out.println("Calling sub class method");
		return new String("Derived");
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