package edu.eci.cvds.tdd;

import org.junit.Assert;
import org.junit.Test;
import edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos;

public class TarifasTest {
	
	@Test
    	public void validateTarifa() {
		CalculadorDescuentos calculater= new 						CalculadorDescuentos();
		double d= 10455000;
    		Assert.assertEquals(d,calculater.calculoTarifa(12300000,21,20),0);
	}

	@Test
    	public void validateTarifa1() {
		CalculadorDescuentos calculater= new 						CalculadorDescuentos();
		double d= 11685000;
    		Assert.assertEquals(d,calculater.calculoTarifa(12300000,5,17),0);
	}

	@Test
    	public void validateTarifa2() {
		CalculadorDescuentos calculater= new 						CalculadorDescuentos();
		double d= 11685000;
    		Assert.assertEquals(d,calculater.calculoTarifa(12300000,0,0),0);
	}

	@Test
    	public void validateTarifa3() {
		CalculadorDescuentos calculater= new 						CalculadorDescuentos();
		double d= 12300000;
    		Assert.assertEquals(d,calculater.calculoTarifa(12300000,19,18),0);
	}

	@Test
    	public void validateTarifa4() {
		CalculadorDescuentos calculater= new 						CalculadorDescuentos();
		double d= 12300000;
    		Assert.assertEquals(d,calculater.calculoTarifa(12300000,19,65),0);
	}

	@Test
    	public void validateTarifa5() {
		CalculadorDescuentos calculater= new 						CalculadorDescuentos();
		double d= 11316000;
    		Assert.assertEquals(d,calculater.calculoTarifa(12300000,19,66),0);
	}

	@Test
    	public void validateTarifa6() {
		CalculadorDescuentos calculater= new 						CalculadorDescuentos();
		double d= 11316000;
    		Assert.assertEquals(d,calculater.calculoTarifa(12300000,19,95),0);
	}
}





