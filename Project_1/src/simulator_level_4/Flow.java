package simulator_level_4;

class Flow {

	public static void main(String[] args) {
		
		try {
			System.out.println("before");
			throw new FlowException();
			//System.out.println("after");
		} catch (FlowException e) {
			System.out.println("catch");
		}finally{
			System.out.println("final");
		}
		System.out.println("done");
	}

}

class FlowException extends Exception{
	
}
