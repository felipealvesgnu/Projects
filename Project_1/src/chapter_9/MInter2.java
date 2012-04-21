package chapter_9;

class MInter2 {
	private String x = "efigenia";
	
	void doStuff(){
		String y = "felipe";
		
		class Inn2{
			String h = "joaquim";
			public void see(){
				System.out.println("Extern: " + x);
				System.out.println("local method: " + y); //it won't to compile
				System.out.println("local variable: " + h);				
			}
		}
		Inn2 in = new Inn2();
		in.see();
	}
	
	public static void main(String[] args) {
		MInter2 im = new MInter2();
		im.doStuff();
	}

}
