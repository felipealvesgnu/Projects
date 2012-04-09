package simulator_level_extra;

import java.util.TreeSet;

class Stuff implements Comparable{
	int x;
	Stuff(int x){this.x = x;}
	
	public int compareTo(Object o){
		return 0;
	}
}

class AddStuff {
	public static void main(String[] args) {
		TreeSet<Stuff> ts = new TreeSet<Stuff>();
		Stuff a = new Stuff(1);
		Stuff a2 = new Stuff(1);
		//ts.add(new Stuff(1));
		//ts.add(new Stuff(2));
		ts.add(a);
		ts.add(a2);
		
		System.out.println(ts.size());
	}
}



