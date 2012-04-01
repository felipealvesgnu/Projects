package simulator_level_4;

public class Tsleep extends Thread {
    Tsleep(String s){
        super(s);
    }
    public void run(){
        for(int z=0;z<5;z++){
	        System.out.println(Thread.currentThread().getName());
	        System.out.println("----");
	        try{
	            Thread.sleep(1000);
	        }catch(InterruptedException e){e.printStackTrace();}
        }
    }
    

    public static void main(String[] args) {
        Tsleep ts = new Tsleep("Carlos");
        Tsleep ts2 = new Tsleep("maria");
            ts.start();
            ts2.start();			
    }
/* o resultado aqui n�o � garantido, quando um thread � despertado
 * ele pode ou n�o pode voltar � execu��o, mas ele fica no estado
 * execut�vel aguardando ser chamado pelo agendador. Mas todos os
 * threads s�o executados alternados
 */
}
