package com.ubs.opsit.interviews;

import static org.junit.Assert.*;

import org.junit.Test;

public class MinuteConverterTest {

	@Test
	public void testMinute() {
		MinuteConverter minuteConverter = new MinuteConverter("16");
		assertTrue(("YYROOOOOOOO\r\nYOOO").equals(minuteConverter.toString()));
	}

}
