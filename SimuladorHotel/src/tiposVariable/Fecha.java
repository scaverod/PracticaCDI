package tiposVariable;

import java.util.Date;

public class Fecha {
	private final int DAY_MIN = 1;
	private final int MONTH_MIN = 1;
	private final int YEAR_MIN = 0;
	private final int MONTH_MAX = 12;
	private final int YEAR_MAX = Integer.MAX_VALUE;
	
	private int day;
	private int month;
	private int year;
	
	/* ************ */
	/* Constructors */
	/* ************ */
	
	public Fecha() {
		Date d = new Date(System.currentTimeMillis());
		initFecha(d);
	}
	
	public Fecha(long date) {
		Date d = new Date(date);
		initFecha(d);
	}
	
	/* ******* */
	/* Getters */
	/* ******* */
	
	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}
	
	/* *************** */
	/* Private methods */
	/* *************** */
	
	@SuppressWarnings("deprecation")
	private void initFecha(Date d) {
		day = d.getDate();
		month = d.getMonth() + 1;
		year = d.getYear() + 1900;
	}
	
	private boolean correctDay() {
		if (day >= DAY_MIN && day <= getMaxDay())
			return true;
		else
			return false;
		
//		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) { // Meses con 31 dias
//			if (day <= 31)
//				return true;
//			else
//				return false;
//		}
//		else if (month == 4 || month == 6 || month == 9 || month == 11) { // Meses con 30 dias
//			if (day <= 30)
//				return true;
//			else
//				return false;
//		}
//		else if (month == 2) { // Febrero
//			if ((year % 4 == 0) && (day <= 28)) // Con 28 dias (año bisiesto)
//				return true;
//			else if ((year % 4 != 0) && (day <= 27)) // Con 27 dias (año no bisiesto)
//				return true;
//			else
//				return false;
//		}
//		else
//			return false;
	}
	
	private void checkAndFixMaxDay() {
		if (!correctDay())
			day = getMaxDay();
	}
	
	/* ************** */
	/* Public methods */
	/* ************** */
	
	public void addDay() {
		if (day < getMaxDay())
			day++;
		else {
			addMonth();
			day = DAY_MIN;
		}
	}
	
	public void substractDay() {
		if (day > DAY_MIN)
			day--;
		else {
			substractMonth();
			day = getMaxDay();
		}
	}
	
	
	
	public void addMonth() {
		if (month < MONTH_MAX) {
			month++;
			checkAndFixMaxDay();
		}
		else {
			addYear();
			month = MONTH_MIN;
		}
	}
	
	public void substractMonth() {
		if (month > MONTH_MIN) {
			month--;
			checkAndFixMaxDay();
		}
		else {
			substractYear();
			month = MONTH_MAX;
		}
	}
	
	
	
	public void addYear() {
		if (year < YEAR_MAX)
			year++;
		
		checkAndFixMaxDay();
	}
	
	public void substractYear() {
		if (year > YEAR_MIN)
			year--;
		
		checkAndFixMaxDay();
	}
	
	
	
	
	public void setDay(int day) {
		if (day < DAY_MIN)
			this.day = DAY_MIN;
		else if (day > getMaxDay())
			this.day = getMaxDay();
		else
			this.day = day;
	}
	
	public void setMonth(int month) {
		if (month < MONTH_MIN)
			this.month = MONTH_MIN;
		else if (month > MONTH_MAX)
			this.month = MONTH_MAX;
		else
			this.month = month;
		
		checkAndFixMaxDay();
	}
	
	public void setYear(int year) {
		if (year < YEAR_MIN)
			this.year = YEAR_MIN;
		else if (year > YEAR_MAX)
			this.year = YEAR_MAX;
		else
			this.year = year;
		
		checkAndFixMaxDay();
	}
	
	
	
	
	public int getMinDay() {
		return DAY_MIN;
	}
	
	public int getMinMonth() {
		return MONTH_MIN;
	}
	
	public int getMinYear() {
		return YEAR_MIN;
	}
	
	
	
	public int getMaxDay() {
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
			return 31;
		else if (month == 4 || month == 6 || month == 9 || month == 11)
			return 30;
		else if (month == 2) {
			if (year % 4 == 0)
				return 28;
			else
				return 27;
		}
		else
			return -1;
	}
	
	public int getMaxMonth() {
		return MONTH_MAX;
	}
	
	public int getMaxYear() {
		return YEAR_MAX;
	}
}