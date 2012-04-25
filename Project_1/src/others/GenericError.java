package others;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class GenericError {

	public static void main(String[] args) {
		List lista = new ArrayList<Integer>();
		lista.add(1);
		lista.add(2);
		sum(lista);
		//System.out.println(GenericError.sum());
	}

	public static int sum(List<Integer> intList){
		int sum = 0;
		
		for(Iterator iter = intList.iterator(); iter.hasNext();){		
			int i = ((Integer) iter.next()).intValue();
			sum += i;
		}
		return sum;
	}
}
