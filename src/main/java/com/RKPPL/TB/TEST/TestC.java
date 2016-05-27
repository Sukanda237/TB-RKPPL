package com.RKPPL.TB.TEST;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

import com.RKPPL.TB.C;


public class TestC {

	@Test
	public void testForC(){
		C c = new C();
		c.setN1(20);
		c.setN2(20);
		
		assertEquals("Must return 20 * 20 = 400 ", 20*20, c.mul());
		assertEquals("Must return 20 / 20 = 1 ", 20/20, c.div());

	
	}
}
