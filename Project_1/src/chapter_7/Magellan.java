package chapter_7;

import java.text.DateFormat;
import java.util.*;

public class Magellan {

	public static void main(String[] args) {
		TreeMap<String, String> myMap = new TreeMap<String, String>();
		myMap.put("a", "apple"); myMap.put("d", "date"); myMap.put("p", "pear"); 
		myMap.put("f", "fig"); myMap.put("q", "or");
		System.out.println("1st after mango: " + // sop 1
		 myMap.higherKey("f"));
		
		 System.out.println("1st after mango: " + // sop 2
		 myMap.ceilingKey("f"));
		 
		 System.out.println("1st after mango: " + // sop 3
		 myMap.floorKey("f"));
		 //myMap.lowerKey("f"));
		 SortedMap<String, String> sub = new TreeMap<String, String>();
		 sub = myMap.tailMap("f");
		 System.out.println("1st after mango: " + sub.firstKey()); // sop 4
	}
 }