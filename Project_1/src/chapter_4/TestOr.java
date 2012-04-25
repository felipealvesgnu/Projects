package chapter_4;

public class TestOr {
	public static void main(String[] args) {
		if((isIt(3) || isIt(7))){
			System.out.println("result is true 1");
		}
		if((isIt(6) || isIt(9))){
			System.out.println("result is true 2");
		}
	}
	public static boolean isIt(int i){
		if(i < 5){
			System.out.println("i < 5");
			return true;
		}else{
			System.out.println("i >= 5");
			return false;
		}
	}
}
