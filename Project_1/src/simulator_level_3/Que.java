package simulator_level_3;

import java.util.PriorityQueue;

class Que {

	public static void main(String[] args) {
		PriorityQueue<String> que = new PriorityQueue<String>();
		que.offer("Camilo");
		que.offer("Beni");
		que.offer("CAmilo");
		System.out.println(que.peek());
		System.out.println(que.element());
		System.out.println(que.remove());
		System.out.println(que.peek());
		System.out.println(que.remove("Lopes"));
		
	}

}
