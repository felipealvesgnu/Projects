package chapter_6;

import java.io.File;
import java.io.IOException;

public class Writer {

	public static void main(String[] args) {
		File mydir = new File("c://meu_diretorio");
		mydir.mkdir();
		
		File file = new File(mydir, "arquivoooo2");
		
		try {
			file.createNewFile();
		} catch (IOException e) {
			System.out.println("Erro ao criar arquivo.");
			e.printStackTrace();
		}
	}

}
