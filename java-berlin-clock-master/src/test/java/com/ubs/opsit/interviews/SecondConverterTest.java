package com.ubs.opsit.interviews;

import static org.junit.Assert.*;

import org.junit.Test;

public class SecondConverterTest {

	@Test
	public void testSecond() {
		SecondConverter secondConverter = new SecondConverter("01");
		assertTrue("O\r\n".equals(secondConverter.toString()));
		secondConverter = new SecondConverter("02");
		assertTrue("Y\r\n".equals(secondConverter.toString()));
	}

}
