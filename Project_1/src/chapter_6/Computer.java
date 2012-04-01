package chapter_6;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
	
class Keyboard {};

public class Computer implements Serializable{
	private Keyboard k = new Keyboard(); //Keyboard não é Serializable então lança exceção, se fosse criaria 2 objetos.
	
	public static void main(String[] args) {
		Computer c = new Computer();
		c.storeIt(c);
	}
	
	void storeIt(Computer c){
		try {
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("c://myFile.txt"));
			os.writeObject(c);
			os.close();
			System.out.println("done");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("exc");
		}
	}
	
}
