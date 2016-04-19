package ar.edu.unlam.ww;

import org.junit.Assert;
import org.junit.Test;


public class CerraduraTest {
	
	@Test
	public void testAbrirTrue(){
		Integer claveATestear = 1234;
		Integer cantidadDeAperturasPosibles = 2;
		Cerradura miCerradura = new Cerradura(claveATestear,cantidadDeAperturasPosibles);
		Assert.assertTrue(miCerradura.abrir(claveATestear));
	}
	
	@Test
	public void testAbrirFalse(){
		Integer claveATestear = 1234;
		Integer claveFalsa = 4444;
		Integer cantidadDeAperturasPosibles = 2;
		Cerradura miCerradura = new Cerradura(claveATestear,cantidadDeAperturasPosibles);
		Assert.assertFalse(miCerradura.abrir(claveFalsa));
	}
	
	@Test
	public void testAbrirBloqueada(){
		Integer claveATestear = 1234;
		Integer claveFalsa = 1111; 
		Integer cantidadDeAperturasPosibles = 2;
		Cerradura miCerradura = new Cerradura(claveATestear,cantidadDeAperturasPosibles);
		miCerradura.abrir(claveFalsa);
		miCerradura.abrir(claveFalsa);
		miCerradura.abrir(claveFalsa);
		Assert.assertFalse(miCerradura.abrir(claveATestear));
	}
	
	@Test
	public void testEstaAbierta(){
		Integer claveATestear = 1234;
		Integer cantidadDeAperturasPosibles = 2;
		Cerradura miCerradura = new Cerradura(claveATestear,cantidadDeAperturasPosibles);
		miCerradura.abrir(claveATestear);
		Assert.assertTrue(miCerradura.estaAbierta());
	}
	
	@Test
	public void testEstaCerrada(){
		Integer claveATestear = 1234;
		Integer cantidadDeAperturasPosibles = 2;
		Cerradura miCerradura = new Cerradura(claveATestear,cantidadDeAperturasPosibles);
		Assert.assertFalse(miCerradura.estaAbierta());
	}
	
	@Test
	public void testGetAperturasExitosas(){
		Integer claveATestear = 1234;
		Integer cantidadDeAperturas = 4;
		Integer cantidadDeAperturasPosibles = 4;
		Integer contador = 0;
		Cerradura miCerradura = new Cerradura(claveATestear,cantidadDeAperturasPosibles);
		for(contador = 0;contador < cantidadDeAperturas; contador++){
			miCerradura.abrir(claveATestear);
		}
		Assert.assertEquals(cantidadDeAperturas,miCerradura.cantidadDeAperturasExitosas());
	}
	
	@Test public void testGetAperturasFallidas(){
		Integer claveATestear = 1234;
		Integer claveFalsa = 2345;
		Integer cantidadDeAperturasPosibles = 4;
		Integer cantidadDeAperturas = cantidadDeAperturasPosibles;
		Integer contador = 0;
		Cerradura miCerradura = new Cerradura(claveATestear,cantidadDeAperturasPosibles);
		for(contador = 0;contador < cantidadDeAperturas; contador++){
			miCerradura.abrir(claveFalsa);
		}
		Assert.assertEquals(cantidadDeAperturas,miCerradura.cantidadDeAperturasFallidas());
	}
}
