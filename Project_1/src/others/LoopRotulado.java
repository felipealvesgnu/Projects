class LoopRotulado{


   public static void main(String[] args){
      /*
         Loop Externo, express�o rotulado
         
      */
      //loopExterno:
    	for (int i = 0; i < 3; i++) {
			  loopExterno:
		  for(int contador = 0; contador < 5; contador++){
            for(int auxiliar = 0; auxiliar < 5; auxiliar++){
               System.out.println("Auxiliar : "+auxiliar);
               System.out.println("Contador : "+contador);
               /*
                  Aqui ocorre a m�gica, as instru��es break e continue
                  fazem com que o loop seja reavalidado ou lido novamente
               */
             /*  if (auxiliar == 2) {
            	   break;
               }*/
               if(auxiliar == 3){
            	   continue loopExterno;
               }
              // continue loopExterno;
            }
         }
    	}
   }
}
