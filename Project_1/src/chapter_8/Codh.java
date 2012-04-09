package chapter_8;

/*
 * The equals method must be implemented in a class that you want to compare. 
 */
class Codh {
	
	public int hashCode(){
		return 2;
	}
	Codh(int z){}
	
	public static void main(String[] args) {
		Codh c = new Codh(8);
		Codh d = new Codh(8);
		System.out.println(c.equals(d));  //false, as equals method is not implemented, so JVM will to return false
		System.out.println(c.hashCode()); //2
		System.out.println(c.hashCode()); //2
	}

}
