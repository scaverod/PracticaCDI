package tiposVariable;

import java.util.Date;

public class Fecha {
	private final int DAY_MAX = 31;
	private final int MONTH_MAX = 12;
	private final int DAY_MIN = 1;
	private final int MONTH_MIN = 1;
	private final int YEAR_MIN = 1900;
	
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
		if (day > DAY_MIN && day < DAY_MAX) {
			this.day = day;
			return true;
		}
		else
			return false;
	}
	
	public boolean setMonth(int month) {
		if (month > MONTH_MIN && month < MONTH_MAX) {
			this.month = month;
			return true;
		}
		else
			return false;
	}
	
	public boolean setYear(int year) {
		this.year = year;
		return true;
	}
}