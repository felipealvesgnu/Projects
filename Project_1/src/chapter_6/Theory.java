package chapter_6;

public class Theory {

	public static void main(String[] args) {
		String s1 = "abc"; // na verdade mesmo q se utilize new String, String não é tratado como objeto no java, 
						   //devido ao fato da JVM utilizar um 'pool constatante de strings' p/ tratar Strings. 
		String s2 = s1;
		
		s1 += "d";
		System.out.println(s1 + " " + s2 + " " + (s1 == s2));

		StringBuffer sb1 = new StringBuffer("abc"); //cria um objeto propriamento dito
		StringBuffer sb2 = sb1;
		sb1.append("d");
		System.out.println(sb1 + " " + sb2 + " " + (sb1 == sb2));
	}
}
