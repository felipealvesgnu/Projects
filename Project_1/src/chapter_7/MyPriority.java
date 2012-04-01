package chapter_7;

import java.util.PriorityQueue;

public class MyPriority {

	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<String>();
		//String[] ia = {"2","4","9","7","1"};
		pq.add("2");
		pq.add("4");
		pq.add("9");
		pq.add("7");
//		for(String x :ia)
//			pq.offer(x);
		System.out.print(pq.peek() + " ");
		pq.offer("1");
		pq.add("3");
		pq.remove("1");
		System.out.print(pq.poll() + " ");
		pq.remove("2");		
//		for(String x : ia)
//			System.out.println(pq.poll());			
		pq.poll();
			if(pq.remove("2")) System.out.print(pq.poll() + " ");
		pq.poll();
		pq.peek();
		System.out.println(pq.poll() + " " + pq.peek());
	}

}
// 2 4 -> sysout = 2 
// 2 4 1 3 -> 2 4 3
//poll() -> 2 4 
// 