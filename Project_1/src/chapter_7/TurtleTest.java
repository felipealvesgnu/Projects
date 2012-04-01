package chapter_7;

import java.util.LinkedHashSet;

 class Turtle {
	 int size;
	 public Turtle(int s) { size = s; }

	 public boolean equals(Object o) { 	//use this equals method to differentiate one "o" from the other
		 return (this.size == ((Turtle)o).size); 
	 }
	 // insert code here
	 public int hashCode() { 
		 int b = size/5; 
		 return  b; }		
 }
 
public class TurtleTest {

	public static void main(String[] args) {
		LinkedHashSet<Turtle> t = new LinkedHashSet<Turtle>();
		t.add(new Turtle(1)); 	
		t.add(new Turtle(2)); 
		t.add(new Turtle(1)); 
		//the two elements(1, 1) did go to the same bucket because of the hashCode returns the same value 
		System.out.println(t.size()); //consequently returning 2 buckets
		
	}

}
