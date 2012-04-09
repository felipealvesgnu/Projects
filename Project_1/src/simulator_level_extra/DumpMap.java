package simulator_level_extra;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

class DumpMap{
	public static void main(String[] args) {
		HashMap h = new HashMap();
		h.put("a", "aa");
		h.put("b", "bb");
		h.put("c", "cc");
		Set ks = h.keySet();
		Object [] ka1 = ks.toArray();
		ks = new TreeSet(ks);
		Object [] ka2 = ks.toArray();
		System.out.println(Arrays.equals(ka1, ka2));		
	}	
}