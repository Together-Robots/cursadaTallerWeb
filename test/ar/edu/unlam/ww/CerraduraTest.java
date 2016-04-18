package ar.edu.unlam.ww;

import org.junit.Assert;
import org.junit.Test;


public class CerraduraTest {
	
	@Test
	public void testAbrirTrue(){
		Integer claveATestear = 1234;
		Cerradura miCerradura = new Cerradura(claveATestear,2);
		Assert.assertTrue(miCerradura.abrir(claveATestear));
	}
	
	@Test
	public void testAbrirFalse(){
		Integer claveATestear = 1234;
		Integer claveFalsa = 4444;
		
		Cerradura miCerradura = new Cerradura(claveATestear,2);
		Assert.assertFalse(miCerradura.abrir(claveFalsa));
	}
	
	@Test
	public void testEstaAbierta(){
		Integer claveATestear = 1234;
		Cerradura miCerradura = new Cerradura(claveATestear,2);
		miCerradura.abrir(claveATestear);
		Assert.assertTrue(miCerradura.estaAbierta());
	}
	
	@Test
	public void testEstaCerrada(){
		Integer claveATestear = 1234;
		Cerradura miCerradura = new Cerradura(claveATestear,2);
		Assert.assertFalse(miCerradura.estaAbierta());
	}
	
	@Test
	public void testEstaBloqueada(){
		Integer claveATestear = 1234;
		Integer claveATestearErronea = 1111; 
		Cerradura miCerradura = new Cerradura(claveATestear,2);
		miCerradura.abrir(claveATestearErronea);
		miCerradura.abrir(claveATestearErronea);
		
		Assert.assertFalse(miCerradura.abrir(claveATestear));
	}
	
	
	
}
