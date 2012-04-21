package chapter_8;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
	public static void main(String[] args) {
		
//		Set ts = new TreeSet();	
//		ts.add(8);
//		ts.add("camilo"); // it will generate a classCastException, because we can add only one type and no many types in the same TreeSet.
		
		boolean [] ba = new boolean[5];
		
		Set s = new HashSet();
		
		ba[0] = s.add("a");		
		//ba[1] = s.add(new Integer(42));
		ba[2] = s.add("a");
		ba[3] = s.add(new Object());
		ba[4] = s.add(5);
		
		for (int x = 0; x < ba.length; x++) 
			System.out.println(ba[x] + " ");
		System.out.println("\n");//to try put on above line
		
		for(Object o : s)
			System.out.println(o +" ");
	}

}
