package simulator_level_extra;

class StringSplit {
	public static void main(String[] args) {
		String s = "x1234y56  z7a";
		//String s = "x1234 y56";
		String[] sa = s.split("\\d");
		int count = 0;
		for(String x : sa)
			count++;
		System.out.println("total: " + count); //8
	}

}
