package com.noobinprog.format.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateStringFormat {
	public DateStringFormat() {
		System.out.println("constructor DateStringFormat class ");
	}
	
	private static String dateNow;
	
	public String getDateNow() {
		return dateNow;
	}
	public void setDateNow(String dateNow) {
		DateStringFormat.dateNow = dateNow;
	}
	
	public static String giveDateInStringFormat() {
		DateStringFormat dsf = new DateStringFormat();
		Date date = new Date();//2018-05-32
		SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
		dateNow=ft.format(date);
		dsf.setDateNow(dateNow);
		System.out.println("ustawiona data to : "+dsf.getDateNow());
		return dsf.getDateNow();
	}
}
