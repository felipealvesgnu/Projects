package simulator_ExamLab;

public class Gened{

    public static void main(String argv[]){
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
