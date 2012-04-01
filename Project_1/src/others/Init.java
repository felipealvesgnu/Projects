
public class Init {
	Init(int x){System.out.println("1-arg const");} // por último exectuta o construtor
	Init(){System.out.println("no-arg const");} 	// por último exectuta o construtor
	static {System.out.println("1st static init");} //executa primeiro os statics por ordem de sequencia
	
	{System.out.println("1st instance  init *");}
	{System.out.println("2st instance  init *");}
	
	static{System.out.println("2st static init");} //executa primeiro os statics por ordem de sequencia
	
	public static void main(String[] args) {
		new Init();
		new Init(7);
	}

}
