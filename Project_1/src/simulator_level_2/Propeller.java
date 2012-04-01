package simulator_level_2;

public class Propeller {

	public static void main(String[] args) throws Exception{
		//try{
			new Propeller().topGo();	
//		}catch(Exception e){
//			e.printStackTrace();
//		}
		
	}
	
	void topGo() throws Exception{
		middleGo();
	}
	
	void middleGo() throws Exception{
		go();
	}
	
	void go() throws Exception{
		throw new Exception();
	}
}
