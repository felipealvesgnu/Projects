package chapter_8;

public class Car {
	
	class Engine{
		//insert here
		Engine(){
			Car.this.drive();
		}
		{Car.this.drive();}		
	}
	
	public static void main(){
		new Car().go();
		new Car().drive();
	}
	
	void go(){
		
		new Engine();
	}
	void drive(){System.out.println("hi"); }
}
