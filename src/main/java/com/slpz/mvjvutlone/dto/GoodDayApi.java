package com.slpz.mvjvutlone.dto;

public class GoodDayApi {

	public String getMorning(String msg) {
		
		String output = "Good Morning " + msg;
		
		return output;
	}

	public String getAfternoon(String msg) {
		
		String output = "Good Afternoon " + msg;
		
		return output;
	}
}
