package com.arodpes.prueba04;


import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * Hello world!
 *
 */
public class App 
	
{
	static final  Logger logger= Logger.getLogger("com.arodpes.prueba04.App");
			
	public static int suma(int num1, int num2) {
		return num1+num2;
	}
	
	public static int suma2(Integer num1, Integer num2) {
		num2= null;
		return num1.intValue()+num2.intValue();
	}
	
    public static void main( String[] args )
    {
        //System.out.println((suma(8,4)));
        logger.log(Level.INFO ,"Suma: {0}" , suma(8,4));
    }
}
