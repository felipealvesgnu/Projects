package chapter_6;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Writer2 {
	
	public static void main(String[] args) {
		char[] in = new char[50];
		int size = 0;
		
		try {
			File arquivo = new File("c://arquivo_de_teste.txt");
			FileWriter escritor = new FileWriter(arquivo);
			escritor.write("escrevendoooooooo no arquivo pelas classes FileWriterrrrrrr!!!!");
			escritor.flush();
			escritor.close();
			FileReader leitor = new FileReader(arquivo);
			size = leitor.read(in);
			System.out.println(size + " ");
			
			for (char c : in) {
				System.out.print(c);
			}
				
			
		} catch (IOException e) {

		}
		
	}

}
