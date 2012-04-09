package chapter_8;

public class Equa {
	public static void main(String[] args) {
		String c = new String("Felipe"); //instantiated in memory
		String d = "Felipe"; //created in heap
		
		System.out.println(c.equals(d)); //true
		System.out.println(c == d); //false
		System.out.println(c == "Felipe"); //false, because 'c' is a object 
		System.out.println(d == "Felipe"); //true, because 'd' is in String pool and literal 'Felipe' are the same references
	}

}
