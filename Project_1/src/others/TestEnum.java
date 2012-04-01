package food;

enum Animals{
	DOG("woof", "black"), CAT("meow","red"), FISH("burble","blue");
	String sound, color;
	
	Animals(String s, String d){ //única forma de abastecer as propriedades 'sound' e 'color'
		sound = s;
		color = d;
	}
}

public class TestEnum {
	long [] x []; 
	static Animals a;
	String d ;
	public static void main(String[] args) {
		System.out.println(a.DOG.color + " " + a.FISH.sound);
	//	System.out.println("oi");
	}

}
