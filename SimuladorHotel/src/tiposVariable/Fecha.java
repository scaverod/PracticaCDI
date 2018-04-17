package tiposVariable;

import java.util.Date;

public class Fecha {
	public static final int DAY_MAX = 31;
	public static final int MONTH_MAX = 12;
	public static final int DAY_MIN = 1;
	public static final int MONTH_MIN = 1;
	public static final int YEAR_MIN = 1900;
	
	private int day;
	private int month;
	private int year;
	
	public Fecha() {
		Date d = new Date(System.currentTimeMillis());
		initFecha(d);
	}
	
	public Fecha(long date) {
		Date d = new Date(date);
		initFecha(d);
	}
	
	@SuppressWarnings("deprecation")
	private void initFecha(Date d) {
		day = d.getDate();
		month = d.getMonth() + 1;
		year = d.getYear() + YEAR_MIN;
	}
	
	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}
	
	public boolean setDay(int day) {
		if (day >= DAY_MIN && day <= DAY_MAX) {
			this.day = day;
			return true;
		}
		else {
			System.out.println("Days can't be less than " + DAY_MIN + " or more than " + DAY_MAX);
			return false;
		}
	}
	
	public boolean setMonth(int month) {
		if (month >= MONTH_MIN && month <= MONTH_MAX) {
			this.month = month;
			return true;
		}
		else {
			System.out.println("Months can't be less than " + MONTH_MIN + " or more than " + MONTH_MAX);
			return false;
		}
	}
	
	public boolean setYear(int year) {
		this.year = year;
		return true;
	}
}