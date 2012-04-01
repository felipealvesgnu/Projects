package simulator_level_3;

import javax.swing.JTextArea;

public class Impressora {
	private JTextArea txtDestino = null;

	private long linha = 0;

	private boolean pausado = false;

	public Impressora(JTextArea txtDestino) {
		if (txtDestino == null)
			throw new NullPointerException("Destino n�o pode ser nulo!");

		this.txtDestino = txtDestino;

		//Disparamos a thread da impressora.
		Thread t = new Thread(new ImpressoraRun(), "Thread da impressora");
		t.setDaemon(true);
		t.start();
	}

	/**
	 * Nesse m�todo, verificamos a condi��o que desejamos. Se a vari�vel pausada
	 * valer true, isso nos indica que a thread deve dormir. Portanto, damos um
	 * wait() nela. Caso contr�rio, ela deve continuar.
	 * 
	 * @throws InterruptedException
	 */
	private synchronized void verificaPausa() throws InterruptedException {
		// Esse while � necess�rio pois threads est�o sujeitas a spurious
		// wakeups, ou seja, elas podem acordar mesmo que nenhum notify tenha
		// sido dado.

		// Whiles diferentes podem ser usados para descrever condi��es
		// diferentes. Voc� tamb�m pode ter mais de uma condi��o no while
		// associada com um e. Por exemplo, no caso de um produtor/consumidor,
		// poderia ser while (!pausado && !fila.cheia()).

		// Nesse caso s� temos uma condi��o, que � dormir quando pausado.
		while (pausado) {
			wait();
		}
	}

	/**
	 * Nesse m�todo, permitimos a quem quer que use a impressora que controle
	 * sua thread. Definindo pausado como true, essa thread ir� parar e esperar
	 * indefinidamente. Caso pausado seja definido como false, a impressora
	 * volta a imprimir.
	 * 
	 * @param pausado
	 *            True para pausar, false para continuar.
	 */
	public synchronized void setPausado(boolean pausado) {
		this.pausado = pausado;

		// Caso pausado seja definido como false, acordamos a thread e pedimos
		// para ela verificar sua condi��o. Nesse caso, sabemos que a thread
		// acordar�, mas no caso de uma condi��o com v�rias alternativas, nem
		// sempre isso seria verdadeiro.
		if (!this.pausado)
			notifyAll();
	}
	
	private void imprime()
	{
		StringBuilder msg = new StringBuilder("Linha ");
		msg.append(Long.toString(linha++ % Long.MAX_VALUE));
		msg.append("\n");
		txtDestino.append(msg.toString());
	}

	/**
	 * Este � o runnable com a thread da impressora.
	 * 
	 * Est� � uma t�cnica interessante. Aqui, encapsulo o runnable e a cria��o
	 * da nova thread. Assim, classes que usem a impressora n�o ficam
	 * necessarimente sabendo que outra thread existe.
	 * 
	 * Note que isso torna a classe mais encapsulada, conforme descrito no meu 
	 * artigo Implementar interfaces tamb�m pode violar o encapsulamento.
	 * http://jvinicius.livejournal.com/2796.html
	 */
	private class ImpressoraRun implements Runnable {
		public void run() {
			try {
				while (true) {					
					verificaPausa(); 
					imprime();       
					Thread.sleep(500);
				}
			} catch (InterruptedException e) {
				txtDestino.append("Processamento da impressora interrompido.");
			}
		}
	}
}
