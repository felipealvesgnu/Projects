package chapter_8;

public class Subequa {
	public static void main(String[] args) {
		Pantera p = new Pantera(10);
		Pantera r = new Pantera(10);
		System.out.println(p == r);
		System.out.println(p.equals(r));
	}

	public boolean equals(Object o){
		if((o instanceof Pantera) && (((Pantera)o).z == 10 )){
			return true;
		}else{
			return false;
		}
	}
}

class Pantera{
	int z;
	Pantera(int a){
		z=a;
	}
}
