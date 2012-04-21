package chapter_8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionTest {

	private static final String[] colors={"BLUE ", "YELLOW ", "WHITE "};
	private static final String[] removeColors={"BLACK ", "YELLOW ", "PINK "};
	
	public CollectionTest() {
		List<String> list = new ArrayList<String>();
		List<String> removelist = new ArrayList<String>();
		
		for(String color : colors)
			list.add(color);
		for(String recolor : removeColors)
			removelist.add(recolor);
		
		System.out.println("Arrays list: ");
		
		for (int c = 0; c < list.size(); c++) 
			System.out.printf("%s", list.get(c));
		removeColors(list, removelist);
		
		System.out.println("\n\n Arraylist after removeColors: ");

		for(String color : list)
			System.out.printf("%s ", color);		
	}
	
	private void removeColors (Collection<String> collection1, Collection<String> collection2) {
		Iterator<String> it = collection1.iterator();		
		
		while(it.hasNext())			
			if(collection2.contains(it.next()))
				it.remove();

	}
	
	public static void main(String [] args){
		new CollectionTest();
	}

}
