package others;

class A{}

class B extends A{ }

public class ComingThru {

	static String s = "-";
	
	public static void main(String[] args) {
		A[] aa = new A[2];
		B[] bb = new B[2];
		sifter(aa);		
		sifter(bb);	
		
		sifter(7);
		System.out.println(s);
	}
	
	static void sifter (A[] ... a2){ s += "1";}
	static void sifter (B[] ... b1){ s += "2";}
	static void sifter (B[] b1)	 { s += "3";}	
	static void sifter (Object o)  { s += "4";}
}
