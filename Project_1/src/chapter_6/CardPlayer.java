package chapter_6;

import java.io.*;

class Player{	
	public Player() {System.out.println("p");}
	
}

public class CardPlayer extends Player implements Serializable{
	CardPlayer(){ System.out.println("c");} //construtor nao executa em classe que seja Serializable
	
	public static void main(String[] args) {
		CardPlayer c1 = new CardPlayer();
		try{			
			FileOutputStream fos  = new FileOutputStream("c://play.txt");
			ObjectOutputStream os = new ObjectOutputStream(fos);
			os.writeObject(c1);
			os.close();
			
			FileInputStream fis  = new FileInputStream("c://play.txt");
			ObjectInputStream is = new ObjectInputStream(fis);
			CardPlayer c2	 	 = (CardPlayer) is.readObject();
			is.close();
		}catch (Exception x) {x.printStackTrace(); }
		
	}

}
