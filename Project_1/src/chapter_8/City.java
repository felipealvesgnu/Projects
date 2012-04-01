package chapter_8;

import java.io.IOException;

public class City {
	class Manhattan{
		void doStuff() throws Exception {System.out.println("X "); }
	}
	class TimesSquare extends Manhattan{
		void doStuff() throws Exception{}
	}
	public static void main(String[] args) throws Exception{
		new City().go();
		//throw new IOException();
	}
	void go() throws Exception{ new TimesSquare().doStuff();}
}

