package com.ubs.opsit.interviews;

import static org.junit.Assert.*;

import org.junit.Test;

public class HourConverterTest {

	@Test
	public void testHour() {
		HourConverter hourConverter = new HourConverter("05");
		assertTrue("ROOO\r\nOOOO\r\n".equals(hourConverter.toString()));
	}

}
