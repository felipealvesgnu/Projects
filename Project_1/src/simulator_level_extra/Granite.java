package simulator_level_extra;

class Mineral{
	
	static String shiny(){return "1";}
}

class Granite extends Mineral{
	
	public static void main(String[] args) {
		String s = shiny() + getShiny();
		
	}
	static String getShiny(){
		return shiny();
	}
}
