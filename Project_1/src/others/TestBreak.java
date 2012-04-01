
public class TestBreak {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int counter = 0;
		outer: for (int i = 0; i < 4; i++)
 			middle:	for(int j = 0; j < 4; j++)
				inner: for(int k = 0; k < 4; k++){
					System.out.println("Hello - " + ++counter);
					if((k % 4) == 0 )
						break middle;
//						break;
						//assert(k != 0);
						//System.out.println("fe");
				}					 				
	}

}
