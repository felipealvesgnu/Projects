package simulator_level_extra;

public class Tester {
	static int x = 2;
	static{ x = 4;};
	
	public static void main(String[] args) {
		int y = x + 1;
		System.out.println(y);
		int x = 5;
		Integer x1 = x;
		Integer x2 = 5;
		Integer x3 = 5;
		
		System.out.println("x1 == x: " + (x1 == x));
		System.out.println("x2 == x1 : " + (x2 == x1));
		System.out.println("x2.equals(x1): " + (x2.equals(x1)));
		
		System.out.println("x2 == x3 : " + (x2 == x3)); //the same memory address
		
		System.out.println("x2.equals(x3)" + (x2.equals(x3)));
		System.out.println("x2 == x1" + (x2 == x1));
		
	}

}
