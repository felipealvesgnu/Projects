package simulator_level_4;

import java.util.ArrayList;
import java.util.List;

class Car {}
class Honda extends Car{ }

public class Test {

	public static void main(String[] args) {
		List<Car> cars = new ArrayList<Car>();
		List<Honda> cars2 = new ArrayList<Honda>();
		List<Object> cars3 = new ArrayList<Object>();
	
//		takeCars(cars);
//		takeCars(cars2);
//		takeCars(cars3);
	}
	
	public static void takeCars(List<T extends Object> list){
		System.out.println("passou");
		
	}

}
