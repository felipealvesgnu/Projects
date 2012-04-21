package chapter_9;

class Enter {
	private int x = 9;
	
	class Inter{
		//System.out.println("sizzle");
	} 
	void stack(){
		static int j = 5; //it doesn't works because is under method's scope
		class Meta{
			static int q = 4;	//it works
			System.out.println("sizzle"); //problems here, because sysout is an instruction that 
										  //should be inside a method and not a class 
		}
	}
	public static void main(String[] args) {
		Enter et = new Enter();
		Enter.Inter ei = et.new Inter();
		Enter.Inter ex = new Enter().new Inter();
	}

}
