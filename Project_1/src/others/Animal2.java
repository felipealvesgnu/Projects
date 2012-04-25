package others;

public class Animal2 {
	String name;
	
	Animal2(String name){
		this.name = name;
		makeRandomName();
	}
	
	Animal2(){
		this(makeRandomName());
	}
	
	static String makeRandomName(){
		int x = (int) Math.random() * 5;
		String name = new String[] { "Fluf", "Fid", "Rover", "Spike", "Gi"}[x];
		return name;
	}
	
	public static void main(String[] args) {
		Animal2 a = new Animal2();
		System.out.println(a.name);
		Animal2 b = new Animal2();
		System.out.println(b.name);
		
	}

}
