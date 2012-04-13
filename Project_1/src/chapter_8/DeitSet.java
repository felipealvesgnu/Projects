package chapter_8;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DeitSet {

	private static final String colors[] = {"red", "blue", "green", "yellow", "black", 
		"red", "blue", "pink"};
	
	public DeitSet() {
		List<String> list = Arrays.asList(colors);
		System.out.printf("ArrayList: %s \n", list);
		printDuplo(list);
	}

	private void printDuplo(Collection<String> col){
		Set<String> set = new HashSet<String>(col);
		System.out.println("\nduplicates");
		
		for(String s : set)
			System.out.printf("%s ",s);
	}

	public static void main(String[] args) {
		new DeitSet();
	}

}
