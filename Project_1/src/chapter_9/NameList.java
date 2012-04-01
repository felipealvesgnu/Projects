package chapter_9;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class NameList {
	private List names = Collections.synchronizedList(new LinkedList());
	
	public synchronized void add(String name){
		names.add(name);
	}
	
	public synchronized String removeFirst(){
		if(names.size() > 0)
			return (String) names.remove(0);
		else
			return null;
	}
	
	public static void main(String[] args){
		final NameList n1 = new NameList();
		n1.add("Ozymandias");
		
		class NameDropper extends Thread{
			public void run(){
				String name = n1.removeFirst();
				System.out.println(name);
			}
		}
		Thread t1 = new NameDropper();
		Thread t2 = new NameDropper();
		t1.start();
		t2.start();
	}
}
