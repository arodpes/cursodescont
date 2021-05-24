package com.arodpes.prueba04;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class OperacionesTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void Pruebaresta1()
    {
    	assertEquals(1,Operaciones.resta(4,3));
    }
    @Test
    public void Pruebamultiplicacion1()
    {
    	assertEquals(16,Operaciones.multiplicacion(4, 4));
    }
    @Test
    public void Pruebamultiplicacion2()
    {
    	assertEquals(50,Operaciones.multiplicacion(5, 10));
    }    
   
    @Test
    public void Pruebamultiplicacion3()
    {
    	assertEquals(24,Operaciones.multiplicacion(3, 8));
    }
    
    
    
    @Test
    public void Pruebadivision1()
    {

    	assertEquals("incorrecta primera",Operaciones.division(10, 2),5);
    	assertEquals("incorrecta segunda",Operaciones.division(10, 5),2);
    	try {
    		assertEquals("incorrecta segunda",Operaciones.division(4,0),0);
    	}
    	catch (ArithmeticException e)
    	{
    		assertTrue(true);
    	}
    }
}
