package simulator_level_extra; 

class Foo{
	public static void main(String[] args){
		int x = 0;
		int y = 4;
		
		for(int z=0; z <3; z++, x++){ //  expression of evaluation and expressions of iteration are the 2 things that occur in a for loop
			if(x>1 & ++y<10)
				y++;
			System.out.println("z= " + z);
		}
		System.out.println(x);
		System.out.println(y);
		System.out.println(y);
	}
}