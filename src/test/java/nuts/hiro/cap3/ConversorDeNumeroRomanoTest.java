package nuts.hiro.cap3;


import static org.junit.Assert.*;

import org.junit.Test;

public class ConversorDeNumeroRomanoTest {

	@Test
	public void deveEntenderOSimbolo(){
		ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
		int numero = romano.converte("I");
		assertEquals(1,numero);
	}
	
	@Test
	public void deveEntenderOSimboloV() {
		ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
		int numero = romano.converte("V");
		assertEquals(5, numero);
	}
	
	@Test
	public void deveEntenderDoisSimbolosComoII(){
		ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
		int numero = romano.converte("II");
		assertEquals(2, numero);
	}
	
	@Test
	public void deveEntenderQuatroSimbolosDoisADoisCOMOXXII(){
		ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
		int numero = romano.converte("XXII");
		assertEquals(22, numero);
	}
	
	@Test
	public void deveEntederNumerosComoIX(){
		ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
		int numero = romano.converte("IX");
		assertEquals(9, numero);
	}
	
}
