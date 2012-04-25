package chapter_8;

import java.util.ArrayList;
import java.util.List;

class RentalGeneric<T>{
	private List<T> rentalpool;
	private int maxNum;
	
	public RentalGeneric(int maxNum, List<T> rentalpool){
		this.maxNum 	 = maxNum;
		this.rentalpool = rentalpool;
	}
	
	public T getRental(){
		return rentalpool.get(0);
	}
	
	public void returnRental(T returnthing){
		rentalpool.add(returnthing);
	}
	
}

class Car_2{
	
}

class TestRental {
	public static void main(String[] args) {
		Car_2 c1 = new Car_2();
		Car_2 c2 = new Car_2();
		List<Car_2> carList = new ArrayList<Car_2>();
		carList.add(c1);
		RentalGeneric<Car_2> carRent = new RentalGeneric<Car_2>(2, carList);
	}

}
