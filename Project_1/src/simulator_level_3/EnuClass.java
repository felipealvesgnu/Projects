package simulator_level_3;

public class EnuClass {
	enum Tam{M(10), P(20), G(30);
		Tam(int a){
			tam = a;
		}
		
		int tam;
		
		public int getTam(){
			return tam; 
		}
	}
	
	public static void main(String[] args) {
		Tam t = Tam.G;
		System.out.println(t + " " + t.tam);
	}

}
