package simulator_ExamLab;

public class Gened{
	static final int[] a = new int[]{100,100};
	//or
	static final int[] a2 = {2,3,4};
	//or
	static final int[] a3 = new int[2];	
	//or
	static final int[] a4;
	
	static{
		a4 = new int[2];
		a4[0] = 100;
		a4[1] = 200;
	}
	
	static int x[][] = {{2,2},
			     {3,4,5},
			     {6,7,8,9},
			     {4,5},
			     {4,4}
	};
	
    public static void main(String argv[]){
    	 System.out.println(x[2][3]);
         doNumber(2);
         doNumber(2L);	
         doNumber(new int[]{1,5,3,4});
         doNumber(new Integer(2));
         doNumber(new Integer[2]); //cria somente um objeto com 2 dimensoes 
    }

    public static void doNumber(int dn){
         System.out.print("a");
    }   

    public static void doNumber(Integer dn){
         System.out.print("c");
    }

    public static void doNumber(Integer... dn){
         System.out.print("d");
    }
    
    public static void doNumber(Object dn){
         System.out.print("e");
    }

}
