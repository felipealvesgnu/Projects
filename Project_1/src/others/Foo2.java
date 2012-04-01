
public class Foo2 {

	public void metodoPaiFoo2(){
		
	}
}

class Bar2 extends Foo2{
	public void metodoFilhoBar(){
		
	}
}

class Test{
	public static void main(String[] args) {
		Foo2 reallyABar = new Bar2();
		Bar2 reallyAFoo2 = new Bar2();
		
		reallyABar.metodoPaiFoo2();
		reallyAFoo2.metodoPaiFoo2();
	}
}