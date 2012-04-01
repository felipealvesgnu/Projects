
public class Vararg {
	static void wide_vararg(long... x){
		System.out.println("long");
	}
	static void box_vararg(Integer... x){
		System.out.println("Integer");
	}
	
	public static void main(String[] args) {
		int i = 5;
		box_vararg(i,i);
		wide_vararg(i,i);
	//	box_vararg(5,5);
	}

}
