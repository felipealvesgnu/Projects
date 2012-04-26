package chapter_9;

interface Cook{
	final	int MY_VALUE = 10;
	public void coo();		
}

class FaceAno {
	
	static Cook c = new Cook(){
		public void coo(){
			System.out.println("anonymous interface implemented");
		}
	};

	public static void main(String[] args) {
		c.coo();
		//or
		FaceAno.c.coo();
	}
}
