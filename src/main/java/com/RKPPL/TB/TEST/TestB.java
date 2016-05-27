package com.RKPPL.TB.TEST;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import com.RKPPL.TB.B;

//Author Ekky Fauzan Maulana
public class TestB{
	@Test
	public void testingForB(){
		B b = new B();
		assertEquals("Must return toString di kelas B", "toString di kelas B", b.toString());
		assertNotEquals("toString di kelas B", b.toString());
	}
 
}
