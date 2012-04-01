package simulator_level_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.TreeSet;

class AddStuff {
	
	public static void main(String args[]){
		TreeSet<String> t = new TreeSet<String>();
		if(t.add("one"))
			if(t.add("two"))
				if(t.add("one"))
					t.add("two");
		for(String s : t)
			System.out.println(s);
		
	}
}
