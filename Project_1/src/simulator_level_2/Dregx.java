package simulator_level_2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dregx {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("\\.*xx");
		//Matcher m = p.matcher("22e5 1 u");
		Matcher m = p.matcher("yyxxxyxx");
		boolean b = false;
		
		while(b = m.find()){
			System.out.println(m.start() + " " + m.group());
		}
	}
}
// 4 aa
// 14 aa