package com.ubs.opsit.interviews;

public class MinuteConverter {

	private Integer minute;
	
	public MinuteConverter(String minutePart) {
		minute = Integer.parseInt(minutePart);
	}
	
	private String getMinute1() {
		String returnMins = "";
		int row1 = (minute - (minute % 5)) / 5;
		int i = 1;
		while (i <= 11) {
			if(i <= row1) {
				if(i % 3 == 0) {
					returnMins +="R";
				} else {
					returnMins +="Y";
				}
			} else {
				returnMins +="O";
			}
			i++;
		}
		return returnMins;
	}
	
	private String getMinute2() {
		String returnMins = "";
		int row2 = minute % 5;
		int i = 0;
		while (i < 4) {
			if(i < row2) {
				returnMins +="Y";
			} else {
				returnMins +="O";
			}
			i++;
		}
		return returnMins;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(getMinute1()).append("\r\n").append(getMinute2());
		return sb.toString();
	}
}
