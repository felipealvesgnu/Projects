package Tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {
	private Calculadora calc;
	
	@Before
	public void criarCalculadora(){
		calc = new Calculadora();
	}
	
	@After
	public void destruirCalculadora(){
		calc = null;
	}
	
	@Test
	public void testSoma() {
		//fail("Not yet implemented");
		//Calculadora calc = new Calculadora();
		assertEquals("Deve retornar 50", 50, calc.soma(25, 25));
	}

	@Test
	public void testSubtrai() {
		//fail("Not yet implemented");
		  // Calculadora calc = new Calculadora();
		   assertEquals("Deve retorna 9", 9, calc.subtrai(100, 91));
	}

	@Test
	public void testMultiplica() {
		//fail("Not yet implemented");
		//Calculadora calc = new Calculadora();
	    assertEquals("Deveria ter retornado 500", 500, calc.multiplica(50, 10));
	}

	@Test
	public void testDivide() {
		 //Calculadora calc = new Calculadora();
		 assertEquals("Deveria ter retornado 1", 1, calc.divide(50, 50));
	}

}
