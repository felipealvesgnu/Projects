package simulator_level_extra;

import java.util.TreeSet;

class Stuff implements Comparable{
	int x;
	Stuff(int x){this.x = x;}
	
	public int compareTo(Object o){
		int thisVal = this.x;
		int xVal 	= ((Stuff)o).x;		
		return (thisVal < xVal ? -1 : (thisVal == xVal ? 0 : 1));
	}
}

class AddStuff {
	public static void main(String[] args) {
		TreeSet<Stuff> ts = new TreeSet<Stuff>();
		Stuff a = new Stuff(1);
		Stuff a2 = new Stuff(2);
		//ts.add(new Stuff(1));
		//ts.add(new Stuff(2));
		ts.add(a);
		ts.add(a2);
		
		System.out.println(ts.size()); //2, because the Stuff class implements compareTo of correct way
	}
}



