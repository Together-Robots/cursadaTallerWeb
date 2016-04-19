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
	public void testAbrirBloqueada(){
		Integer claveATestear = 1234;
		Integer claveFalsa = 1111; 
		Cerradura miCerradura = new Cerradura(claveATestear,2);
		miCerradura.abrir(claveFalsa);
		miCerradura.abrir(claveFalsa);
		miCerradura.abrir(claveFalsa);
		Assert.assertFalse(miCerradura.abrir(claveATestear));
	}
	
	
	
}
