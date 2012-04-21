package chapter_9;

class Ex {
	private int    a = 5;
	private double z = 5.0;
	
	static class In{
		public void met(){
			System.out.println();
			System.out.println();
		}
		static class subIn{
			static class subIn2{
				
			}
		}
	}
	
	public static void main(String[] args) {
		Ex.In.subIn.subIn2 ob  = new Ex.In.subIn.subIn2(); //it's will to compile
	}

}
