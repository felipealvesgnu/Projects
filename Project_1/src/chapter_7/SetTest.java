package chapter_7;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
	
	public static void main(String[] args) {
		boolean[] ba = new boolean[5];
		//Insert code here
		Set s = new TreeSet();
		
		ba[0] = s.add("a");
		ba[1] = s.add(new Integer(42)); //different type of objects
		ba[2] = s.add("b");
		ba[3] = s.add("a");
		ba[4] = s.add(new Object()); //different type of objects
		
		for(int x=0; x < ba.length; x++)
			System.out.print(ba[x] + " ");
		System.out.println("\n");
		for(Object o : s)
			System.out.println(o + " ");
	}

}
