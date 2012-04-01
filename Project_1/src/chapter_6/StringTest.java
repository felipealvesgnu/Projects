package chapter_6;

public class StringTest {

	public static void main(String[] args) {
		String s = new String("aei");
		s.concat("ou");
		System.out.println(s);
		
		StringBuffer h = new StringBuffer("abc");
		h.append("iop").reverse().insert(3, "---");
		System.out.println(h);
	}

}
