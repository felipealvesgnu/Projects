
public class TestChange {

	public static void main(String[] args) {
		int i[] = {1};
		String x[][] = new String[2][2];
		String y[]   = new String[15];		
		x[0] = y;		
		System.out.println(x[0].length);
		byte b = 3;
		b = (byte) (b + 7);
						
		change(i);
		//System.out.println(i[0]);			
	}

	static void change(int i[]){
		int j[]={2};
		i = j;	
	}
}
