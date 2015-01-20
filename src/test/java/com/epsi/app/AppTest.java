package com.epsi.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
    	//arnaud
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( 1 == 2);
    }
    
	public void multiplicationPositive(){
        Operation op = new Operation();
		op.setNombre1(4);
		op.setNombre2(6);
		op.setOperation("*");
		assertTrue(24 == op.getResultat());
	}
	
	public void multiplicationNegative(){
        Operation op = new Operation();
		op.setNombre1(4);
		op.setNombre2(-6);
		op.setOperation("*");
		assertTrue(-24 == op.getResultat());
	}
	
	public void multiplicationNegative2(){
        Operation op = new Operation();
		op.setNombre1(-6);
		op.setNombre2(4);
		op.setOperation("*");
		assertTrue(-24 == op.getResultat());
	}
	
	public void multiplicationDoubleNegative(){
        Operation op = new Operation();
		op.setNombre1(-4);
		op.setNombre2(-6);
		op.setOperation("*");
		assertTrue(24 == op.getResultat());
	}
	
	public void multiplicationParZero(){
        Operation op = new Operation();
		op.setNombre1(0);
		op.setNombre2(6);
		op.setOperation("*");
		assertTrue(0 == op.getResultat());
	}
	
	public void multiplicationParZero2(){
        Operation op = new Operation();
		op.setNombre1(6);
		op.setNombre2(0);
		op.setOperation("*");
		assertTrue(0 == op.getResultat());
	}
}
