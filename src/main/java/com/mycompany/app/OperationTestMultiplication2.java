/**
 * 
 */
package fr.logic.git;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author gui
 *
 */
public class OperationTestMultiplication2 {
	protected Operation op;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.op = new Operation();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void multiplicationPositive(){
		this.op.setNombre1(4);
		this.op.setNombre2(6);
		this.op.setOperation("*");
		assertTrue(24 == op.getResultat());
	}
	
	@Test
	public void multiplicationNegative(){
		this.op.setNombre1(4);
		this.op.setNombre2(-6);
		this.op.setOperation("*");
		assertTrue(-24 == op.getResultat());
	}
	
	@Test
	public void multiplicationNegative2(){
		this.op.setNombre1(-6);
		this.op.setNombre2(4);
		this.op.setOperation("*");
		assertTrue(-24 == op.getResultat());
	}
	
	@Test
	public void multiplicationDoubleNegative(){
		this.op.setNombre1(-4);
		this.op.setNombre2(-6);
		this.op.setOperation("*");
		assertTrue(24 == op.getResultat());
	}
	
	@Test
	public void multiplicationParZero(){
		this.op.setNombre1(0);
		this.op.setNombre2(6);
		this.op.setOperation("*");
		assertTrue(0 == op.getResultat());
	}
	
	@Test
	public void multiplicationParZero2(){
		this.op.setNombre1(6);
		this.op.setNombre2(0);
		this.op.setOperation("*");
		assertTrue(0 == op.getResultat());
	}

}
