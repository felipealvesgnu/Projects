package simulator_level_4;

import java.util.Arrays;

class Pow {
	static String [] wow = {"Bam", "Biff"};
	static String [] listaArgs = {"Pow", "Bam" ,"Biff"};
	
	public static void main(String[] args) {
		if(Arrays.equals(listaArgs, wow))
			System.out.println("got a match? ");
		if(listaArgs == wow)
			System.out.println("sure chief");
		
	}

}
