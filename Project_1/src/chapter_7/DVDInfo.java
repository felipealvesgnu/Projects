package chapter_7;

public class DVDInfo implements Comparable<DVDInfo>{
	
	String title;
	String genre;
	String leadActor;

	public int compareTo(DVDInfo d){
		return title.compareTo(d.getTitle());
	}
	
	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	public String getLeadActor() {
		return leadActor;
	}


	public void setLeadActor(String leadActor) {
		this.leadActor = leadActor;
	}
}
