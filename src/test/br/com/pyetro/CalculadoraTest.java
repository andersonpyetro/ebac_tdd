package test.br.com.pyetro;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.pyetro.Calculadora;


public class CalculadoraTest {
	
	Calculadora calc = new Calculadora();
	
	
	@Test
	public void testAdicionar() {
		int resultado = calc.adicionar(5,6);
		assertEquals(11, resultado);
	}
	
	@Test
	public void testSubtrair() {
		int resultado = calc.subtrair(10, 4);
		assertEquals(6, resultado);
		
	}
	@Test
	public void testMultiplicar() {
		int resultado = calc.multiplicar(5, 6);
		assertEquals(30, resultado);
		
	}
	
	@Test
	public void testDividir() {
		int resultado = calc.dividir(10, 2);
		assertEquals(5, resultado);
		
	}

}


