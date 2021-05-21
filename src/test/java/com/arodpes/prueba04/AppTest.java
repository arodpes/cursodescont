package com.arodpes.prueba04;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void Pruebasuma1()
    {
    	assertEquals(7,App.suma(4,3));
    }
    @Test
    public void Pruebasuma2()
    {
    	assertEquals(8,App.suma(4,4));
    }
    @Test
    public void Pruebasuma3()
    {
    	//se pueden poner varios
    	//se para en el primer error
    	assertEquals("incorrecta primera",App.suma(4,4),8);
    	assertEquals("incorrecta segunda",App.suma(4,9),13);
    }
}
