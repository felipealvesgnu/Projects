
public class Fizz {
	int x = 5;
	int x2 = 9;
	
	public static void main(String[] args) {
		final Fizz f1 = new Fizz();
		Fizz f2 = new Fizz();
		Fizz f3 = FizzSwitch(f1, f2);
		System.out.println((f1 == f3) + " " + (f1.x == f3.x) + " " + f1.equals(f3));
	
	}
	
	static Fizz FizzSwitch(Fizz x, Fizz y){
		final Fizz z = x;
		z.x = 6;
		return z;
	}
}
