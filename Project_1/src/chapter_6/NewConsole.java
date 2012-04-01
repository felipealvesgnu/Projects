package chapter_6;

import java.io.Console;

public class NewConsole {

	
	public static void main(String[] args) {
		Console c = System.console(); 			//obtem um console 
		char[] pw;
		
		pw = c.readPassword(" s", "pw: ");		//retorna um char
		for(char ch : pw){
			c.format("%s", ch);
		}
		c.format("\n");
	}
}
