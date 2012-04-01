package simulator_level_4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class Arquivo {
	public static void main(String[] args) {
		File file = new File("C:\\arquivo_texto.txt");
		
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			int line;
			
		//	while(line = br.read())
				System.out.println(br.read());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
