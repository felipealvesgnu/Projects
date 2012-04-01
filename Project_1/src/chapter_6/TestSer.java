package chapter_6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TestSer {
	public static void main(String[] args) {
		SpecialSerial s = new SpecialSerial();		
		try {
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("c://arq_1"));
			os.writeObject(s);
			os.close();
			System.out.println(s.z++ + " ");
			
			ObjectInputStream is = new ObjectInputStream(new FileInputStream("c://arq_1"));
			SpecialSerial s2 = (SpecialSerial) is.readObject();
			is.close();
			System.out.println(s2.y + " " + s2.z);
		} catch (Exception e) {
			System.out.println("exc");
		}
	}
}

class SpecialSerial implements Serializable{
	transient int y = 7;
	static int z = 9; 
}