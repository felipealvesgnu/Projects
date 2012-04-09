package simulator_level_extra;

enum Days {MONDAY, TUESDAY, WEDNESDAY, THURSDAY}

class EnumTest {
	public static void main(String[] args) {
		int x = 0;
		Days d = Days.TUESDAY;
		switch(d){
			case MONDAY: x++;			
			case TUESDAY: x = x + 10;
			case WEDNESDAY: x = x + 100;
			case THURSDAY: x = x + 1000;		
		}
		System.out.println("x= " + x); //print: x = 1110, because it's without reserved word 'break' after each case block 
	}
}
