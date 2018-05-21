package com.example.myproject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

	public static void main(String[] args) throws ParseException {
		getDate(1524672000000L);
		getDate(1524558971820L);
		getDate(1524758399000L);
		getDate(1524818171821L);
		System.out.println( new SimpleDateFormat("yyyy-MM-dd").parse(new SimpleDateFormat("yyyy-MM-dd").format(new Date())));
		System.out.println( new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())));
	}
	
	private static void getDate(Long dateTime){
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(dateTime)));
	}
}
