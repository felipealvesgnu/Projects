package chapter_7;

import java.util.Comparator;

public class GenreSort implements Comparator<DVDInfo>{
	public int compare(DVDInfo one, DVDInfo two){
		return one.getGenre().compareTo(two.getGenre());		
	}
}
