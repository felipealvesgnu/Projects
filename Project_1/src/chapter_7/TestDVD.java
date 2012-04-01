package chapter_7;

import java.util.ArrayList;
import java.util.Collections;

public class TestDVD {
	ArrayList<DVDInfo> dvdlist = new ArrayList<DVDInfo>();
	
	public static void main(String[] args) {
		//pag 612
		new TestDVD().go();
	}
	
	public void go(){
		populateList();
		System.out.println("Not sorted: " + dvdlist); // Not sorted
		for (DVDInfo i : dvdlist) {
			System.out.print(i.getGenre() + ",");
		}
		System.out.println();
		
		Collections.sort(dvdlist);
		System.out.println("sorted by genre: " + dvdlist); // output sorted by title
		for (DVDInfo i : dvdlist) {
			System.out.print(i.getTitle() + ",");
		}
		System.out.println();
		
		GenreSort gs = new GenreSort();
		Collections.sort(dvdlist, gs);
		System.out.println("sorted by genre: " + dvdlist); // output sorted by genre
		for (DVDInfo i : dvdlist) {
			System.out.print(i.getGenre() + ",");
		}
	}
	
	public void populateList(){		
		DVDInfo item = new DVDInfo();
		item.setTitle("Donnie Darko");
		item.setGenre("comedy");
		item.setLeadActor("Gyllenhall, Jake");
		
		DVDInfo item2 = new DVDInfo();
		item2.setTitle("X-men");
		item2.setGenre("comedy");
		item2.setLeadActor("Wolverine");
		
		DVDInfo item3 = new DVDInfo();
		item3.setTitle("Lost in Translation");
		item3.setGenre("action");
		item3.setLeadActor("Murray, Bill");
		
		dvdlist.add(item);
		dvdlist.add(item2);
		dvdlist.add(item3);
	}
}
