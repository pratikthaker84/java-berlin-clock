package com.ubs.opsit.interviews;

public class HourConverter {

	private Integer hour;
	
	public HourConverter(String hourPart) {
		hour = Integer.parseInt(hourPart);
	}
	
	private String getHours1() {
		String returnHrs = "";
		int row1 = (hour - (hour % 5)) / 5;
		int i = 0;
		while (i < 4) {
			if(i < row1) {
				returnHrs +="R";
			} else {
				returnHrs +="O";
			}
			i++;
		}
		
		return returnHrs;
	}
	
	private String getHours2() {
		String returnHrs = "";
		int row2 = hour % 5;
		
		int i = 0;
		while (i < 4) {
			if(i < row2) {
				returnHrs +="R";
			} else {
				returnHrs +="O";
			}
			i++;
		}
		
		return returnHrs;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(getHours1()).append("\r\n").append(getHours2()).append("\r\n");
		return sb.toString();
	}
}
