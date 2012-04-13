package chapter_8;

import java.util.LinkedHashSet;
import java.util.Set;

class Set2 {
	public static void main(String[] args) {
		Set st = new LinkedHashSet<String>();
		st.add(8.0);
		st.add(9.0);
		st.add(5.0);
		//st.add("ggrag"); //won't compile because of the Generics
		System.out.println(st);
	}

}
