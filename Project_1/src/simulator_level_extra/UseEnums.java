package simulator_level_extra;

class Other{
	enum Colors {RED, GREEN, BLUE, YELLOW}
}

class UseEnums {
	public static void main(String[] args) {
		for (Other.Colors c : Other.Colors.values()) {
			if(Other.Colors.RED.equals(c))
				System.out.print("red ");
			if(c == Other.Colors.GREEN)
				System.out.print("green ");
			if(c.equals("BLUE")) //compare the instance of color
				System.out.print("blue ");
		}
	}
}
