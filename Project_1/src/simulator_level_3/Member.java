package simulator_level_3;
class Synapse{
	protected int gap(){
		return 7;
	}
	
}
class Member extends Synapse{
	enum floresta{LEAO, LEOA, TRIGRE}
	 int x ;
	 
	public int gap(){
		return 4;
	}
	
	public static void main(String []args){
	    
		 floresta f = floresta.LEAO;
		 System.out.println(f);
		 for (floresta c : floresta.values()) {
			if(c == floresta.LEAO)
				System.out.println("smd");
			if(floresta.LEAO.equals(c))
				System.out.println("impim");
//			if(c == "TRIGRE")
//				System.out.println("oim");
			if(c.LEAO.equals("LEAO"))
				System.out.println("oimcad");
			
		}
		 
	 }
}
