package simulator_level_extra;

import java.util.Arrays;

class SearchArray {
	public static void main(String[] args) {
		int[] a = { 9, 7, 5, 3, 1 };
		Arrays.sort(a);
		System.out.println(Arrays.binarySearch(a, 3) + " "
				+ (Arrays.binarySearch(a, 10)));
	}
}