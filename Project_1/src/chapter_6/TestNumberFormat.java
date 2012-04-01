package chapter_6;

import java.text.NumberFormat;

public class TestNumberFormat {
	
	public static void main(String args){
		float f1 = 123.45678f;
		NumberFormat nf = NumberFormat.getInstance();
		
		System.out.println(nf.getMaximumFractionDigits() + " ");
		System.out.println(nf.format(f1) + " ");
		
		nf.setMaximumFractionDigits(5);
		System.out.println(nf.format(f1) + " ");
		
		try {
			System.out.println(nf.parseObject("1234.567"));
			nf.setParseIntegerOnly(true);
			System.out.println(nf.parseObject("1234.567"));
		} catch (Exception e) {
			System.out.println("parse exc");
		}
	}
	
	
	
}
