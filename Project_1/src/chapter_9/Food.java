package chapter_9;

class PopCorn{
	public void pop(){
		System.out.println("popcorn");
	}
}

class Food {
	PopCorn p = new PopCorn(){
		public void sizzle(){
			System.out.println("sizzle");
		}
		public void pop(){
			System.out.println("new popcorn");
		}
	};
	public void popit(){
		p.pop();
		//p.sizzle; //it won't to compile, because Popcorn class doesn't knows the sizzle method inside itself
	}
	public static void main(String[] args) {

	}

}
