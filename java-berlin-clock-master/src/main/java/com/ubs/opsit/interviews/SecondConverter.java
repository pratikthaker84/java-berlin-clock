package com.ubs.opsit.interviews;

public class SecondConverter {

	private Integer second;
	
	public SecondConverter(String secondPart) {
		second = Integer.parseInt(secondPart);
	}
	
	private String getSeconds() {
		if(second % 2 == 0) {
			return "Y";
		} else {
			return "O";
		}
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(getSeconds()).append("\r\n");
		return sb.toString();
	}
}
