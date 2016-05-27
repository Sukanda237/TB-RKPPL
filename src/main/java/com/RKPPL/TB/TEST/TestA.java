package com.RKPPL.TB.TEST;
import static org.junit.Assert.*;

import org.junit.Test;

import com.RKPPL.TB.A;

import junit.*;

//Ekky Fauzan Maulana

public class TestA {
	@Test
	public void testToString(){
		A a = new A();
		assertEquals("Must return toString di kelas A", "toString di kelas A", a.toString());
		assertNotEquals("toString di kelas A", a.toString());
	}
}
