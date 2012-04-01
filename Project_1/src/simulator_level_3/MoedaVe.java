package simulator_level_3;

import java.text.NumberFormat;
import java.util.Locale;

public class MoedaVe {

	public static void main(String[] args) {
		Locale ve = new Locale("ve", "VE");
		Locale eua = Locale.US;
		NumberFormat num  = NumberFormat.getCurrencyInstance(ve);
		NumberFormat num2 = NumberFormat.getCurrencyInstance(eua);
		
		double valor = 2500;
		System.out.println(num.format(valor));
		System.out.println(ve.getDisplayCountry());
		System.out.println(ve.getDisplayLanguage());
		System.out.println(num2.format(valor) + eua.getDisplayLanguage());
		System.out.println(Integer.parseInt("forty "));
		
		try {
			System.out.println();
		}catch(NumberFormatException e){ 
			System.out.println("run time");
		}catch (RuntimeException e) {
			
		
		}

}
