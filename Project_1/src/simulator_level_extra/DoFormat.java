package simulator_level_extra;
import java.io.PrintWriter;

class DoFormat {
	public static void main(String[] args) {
		int x = 42;
		int y = 12345;
		float z = 7633563;
		
		System.out.format("-%4d-", x);
		System.out.format("-%4d-", y);
		System.out.format("-%4.1d-", z); //this line throws an exception at runtime java.util.IllegalFormatPrecisionException
	}

}
