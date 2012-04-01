package chapter_7;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class TestBefore {
	
	public static void main(String[] args) {
		TestBefore test = new TestBefore(); 
		test.before();
	}
	
	public static void before(){
		Set set = new TreeSet(); //because here don't use generics, in other words the compiler don't care.
		set.add("2");
		set.add(3); //auto-boxing to Integer, so ocurred RunTime error here, because TreeSet(don't implements compareTo) 
		set.add("1");
		
		Iterator it = set.iterator();
		
		while(it.hasNext())
			System.out.print(it.next() + " ");
	}

}
