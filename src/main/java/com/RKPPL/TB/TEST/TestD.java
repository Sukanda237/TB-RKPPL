package com.RKPPL.TB.TEST;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.RKPPL.TB.D;

//Author Ekky

class TestD {
	@Test
	public void testForD(){
		D d = new D();
		
		assertEquals("Must return 20 * 20 = 400 ", 20*20, d.mul(20,20));
		assertEquals("Must return 20 / 20 = 1 ", 20/20, d.div(20,20));
		
	}

}
