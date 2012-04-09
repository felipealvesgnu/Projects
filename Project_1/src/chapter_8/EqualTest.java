package chapter_8;

public class EqualTest {
	public static void main(String[] args) {
		Moof one = new Moof(8);
		Moof two = new Moof(8);
		
		if(one.equals(two)){
			System.out.println("one and two are equal");
		}else{
			System.out.println("one and two NO are equal");
		}
	}
}

class Moof{
	private int moofValue;
	
	Moof(int val){
		moofValue = val;
	}
	public int getValue(){
		return moofValue;
	}
	
	public boolean equals(Object o){
		if((o instanceof Moof) && (((Moof)o).getValue() == this.moofValue)){
			return true;
		}else{
			return false;
		}	
	}
}
