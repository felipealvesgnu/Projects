package chapter_3;

import java.util.HashMap;
/*
 * Author: Felipe Alves Lourenço Pereira
 */

public class Bercha {

	static String s = " ";
	public static void main(String[] args) {
		//int x = 4; Boolean y =true; 
		short[][]sa={{1,2,3}, {4}};
		//int [] x2 = {3};
		//doStuff(x, y);
		//doStuff(x);
		//doStuff(x2);
		doStuff(sa, sa);
		//System.out.println(s);
		/*Ferrari [][] carros = {{new Ferrari(), new Ferrari(),new Ferrari()},
							{new Ferrari()}
		};
		
		doStuff(carros);*/
	}
	//static void doStuff (Object o) { s += "1"; }
	static void doStuff (Object... o) { s += "2"; }	
	static void doStuff (int... i) { s += "3"; }
	static void doStuff (Long L) { s += "4"; }
	static void doStuff(Car[]... carros){
		for (Car[] cars : carros) {
			System.out.println("Elementos varargs: " + cars.toString());
			for (Car car : cars) {
				System.out.println("Elementos array: " + car.toString());
			}
		}
	}
	static void doStuff (short[][]... vars) {
		for (short[][] a2s : vars) {
			System.out.println("Elementos varargs: " + a2s.toString());
			for (short[] as : a2s) {
				System.out.println("Elementos array bi: " + as.toString());
				for (short s : as) {
					System.out.println("Elementos array uni: " + s);
				}
			}
		} 
	}
}

class Car{
	
}

class Ferrari extends Car{
	
}