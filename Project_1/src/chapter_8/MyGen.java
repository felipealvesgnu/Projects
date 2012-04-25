package chapter_8;

class MyGen<T>{
	T one;
	
	MyGen(T a){
		one = a;
	}
	
	public T my(){
		return one;
	}
	
	public static void main(String[] args) {
		MyGen<Integer> m = new MyGen<Integer>(14);
	
	}

}
