package chapter_9;

interface Cook{
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
