package chapter_3;


public class Static {
	static{
		int x = 5;
	}
	static int x,y;	
	public static void main(String[] args) {
		x--; //-1
		System.out.println(x);
		myMethod();
		System.out.println(x + y + ++x);
	}
	public static void myMethod(){
		System.out.println("x = " + x);
		y = x++ + ++x; // +1 + 0 = 1
		System.out.println("x2 = " + x);
		System.out.println("y= " + y);
		
	}
}
