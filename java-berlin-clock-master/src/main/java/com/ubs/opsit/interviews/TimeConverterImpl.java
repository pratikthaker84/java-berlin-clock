package com.ubs.opsit.interviews;

public class TimeConverterImpl implements TimeConverter {

	@Override
	public String convertTime(String aTime) {
		String[] time = aTime.split(":");
		SecondConverter secondConverter = new SecondConverter(time[2]);
		HourConverter hourConverter = new HourConverter(time[0]);
		MinuteConverter minuteConverter = new MinuteConverter(time[1]);
		return secondConverter.toString() + hourConverter.toString() + minuteConverter.toString();
	}

}
