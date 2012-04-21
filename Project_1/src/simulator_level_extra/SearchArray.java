package simulator_level_extra;

import java.util.Arrays;

class SearchArray {
	public static void main(String[] args) {
		int[] a = { 9, 7, 5, 3, 1 };
		//Arrays.sort(a); // 1, 3, 5, 7, 9 
		System.out.println(Arrays.binarySearch(a, 3) + " "
				+ (Arrays.binarySearch(a, 20))); // -(insertion point) -1, in this case -(5) -1 = -6  
	}
}