package chapter_8;

import java.util.Comparator;
import java.util.PriorityQueue;

class Queue {
	public static void main(String[] args) {
		
		PriorityQueue<Double> porque = new PriorityQueue<Double>();
		porque.offer(3.5);
		porque.offer(8.0);
		porque.offer(1.4);
	//	porque.offer(1.3);
		
		System.out.println(porque.poll() + "removido " +"\n");
		System.out.println(porque);
		System.out.println(porque.peek());
		
		Qcomp qc = new Qcomp();
		PriorityQueue<Double> pr = new PriorityQueue<Double>(2, qc);
		pr.offer(8.8);
		pr.offer(9.0);
		pr.offer(8.7);
		System.out.println(pr);
	}
}

class Qcomp implements Comparator<Double>{
	public int compare(Double a, Double b){
		return b.compareTo(a);
	}
}