package chapter_7;
import java.util.*;

public class GeoCache {
	public static void main(String[] args) {

		String[] s = {"map", "pen", "marble", "key"};
		
		//Othello o = new Othello();
		Othello o = null;
		Arrays.sort(s,o);
		for(String s2: s) System.out.print(s2 + " ");
		
		//System.out.println(Arrays.binarySearch(s, "map")); //will return -1
		System.out.println(Arrays.binarySearch(s,"map",o));
 	}
 	
	static class Othello implements Comparator<String> {
		public int compare(String a, String b) { 
			return b.compareTo(a); 
		}
	}
 }