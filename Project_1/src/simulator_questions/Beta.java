package simulator_questions;

abstract interface Foo3{
	int bar();	
}

public class Beta {

//	class A implements Foo3{
//		public int bar(){ return 1;}
//		 static class C{ //won't to compile because the INNER class A isn't static, so the compiler won't allow it inside a third level  
//				//	public int bar(){ return 1;}
//		}				
//	}	
//	
	class A implements Foo3{
		public int bar(){return 1; }
	}
	
	public int fubar(Foo3 foo){ return foo.bar();}
	
	public void testFoo(){
//		class A implements Foo3 {
//			public int bar(){ return 2; }
//		}
		System.out.println( fubar(new A()));
	}
	
	public static void main(String[] args) {
	//	new Beta().testFoo();
		StringBuilder sb1 = new StringBuilder("123");
		String s1 = "123";
		s1 = s1.concat("abc");
		sb1.append("abc");
		System.out.println(s1 + sb1);
	}

}
