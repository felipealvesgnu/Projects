package simulator_level_4;

class Ruby {
	public static void main(String[] args) {
		Ruby r1 = new Ruby(); //objeto perdido
		Ruby r2 = new Ruby();
		Ruby r3 = new Ruby();
		
		Ruby r4 = r2;
		Ruby r5 = r4;
		
		r2 = null;
		r4 = r2;
		r1 = r5;
		//criando uma alteração
	} 

}
