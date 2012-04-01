package chapter_7;

import java.util.Arrays;
import java.util.List;

public class Array_to_List {

	public static void main(String[] args) {
		String[] sa = {"one", "two", "three", "four"};
		List lista = Arrays.asList(sa);
		System.out.println("size " + lista.size());
		System.out.println("content of index 2 " + lista.get(2));
		
		lista.set(3, "six");
		sa[1] = "five";
		for(String s : sa)
		 System.out.println(s + " ");
		System.out.println("\nlista1[1] " + lista.get(1));
	}

}
