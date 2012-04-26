package others;

import java.awt.Dimension;


public class ReferenceTest {

	public static void main(String[] args) {
		Dimension d = new Dimension(5, 10);
		ReferenceTest rt = new ReferenceTest();
		System.out.println("Antes do método " + d.height);
		rt.modify(d);
		System.out.println("d= " + d.height);
	}

	private void modify(Dimension dim) {
		dim.height = dim.height + 1;
		//dim = new Dimension();
		System.out.println("dim= " + dim.height);
	}

}
