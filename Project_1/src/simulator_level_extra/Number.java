package simulator_level_extra;

class Number {
	public static void main(String[] args) {
		try {
			System.out.println(Integer.parseInt("forty"));
		}catch (RuntimeException r) {
			System.out.println("runtime ");
		}catch(NumberFormatException e){ //error
			System.out.println("number");
		}
	}

}
