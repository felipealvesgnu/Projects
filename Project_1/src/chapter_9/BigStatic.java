package chapter_9;

public class BigStatic {
	
	static class Nest{
		void go(){
			System.out.println("hi");
		}
	}
	
	class Broom{
//		static class b2{ //won't to compile because the INNER class A isn't static, so the compiler won't allow it inside a third leve
//			void go(){
//				System.out.println("hi");
//			}	
//		}
	}

	public static void main(String[] args) {
		BigStatic.Nest ob = new BigStatic.Nest();
		ob.go();
		
	}	
	
	
}
