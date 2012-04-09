package simulator_level_extra;

import java.text.NumberFormat;

class FormatationTest {
	public static void main(String[] args) {
		double data[] = { 0, 1, 22d / 7, 100.2345678 };
	    NumberFormat form = NumberFormat.getInstance();

	    // Set it to look like 999.99[99]
	    form.setMinimumIntegerDigits(3);
	    form.setMinimumFractionDigits(2);
	    form.setMaximumFractionDigits(4);

	    // Now print using it.
	    for (int i = 0; i < data.length; i++)
	      System.out.println(data[i] + "\tformats as " + form.format(data[i]));
		
	}

}
