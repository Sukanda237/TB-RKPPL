package com.RKPPL.TB.TEST;

import static org.junit.Assert.*;

import org.junit.Test;

import com.RKPPL.TB.Math;

//Revision Ekky Fauzan Maulana

public class TestMath {
	
	@Test
	public void testForMath(){
		
		com.RKPPL.TB.Math math = new Math();
		
		assertEquals(9%3, math.mod(9, 3));
		assertEquals(3.14, math.sqrt());

	}

}
