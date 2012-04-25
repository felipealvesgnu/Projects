package chapter_8;

public class Entid<T> {
	T num;
	
	Entid(T n){
		this.num = n;
	}
	
	T getNum(){return num;}
	
	public static void main(String[] args) {
		Entid<Integer> e = new Entid<Integer>(50);
		Entid<Double> d  = new Entid<Double>(80.0);
		System.out.println(e.getNum());
		System.out.println(d.getNum());
	}

}
