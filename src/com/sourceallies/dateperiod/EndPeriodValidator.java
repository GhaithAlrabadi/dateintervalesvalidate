package com.sourceallies.dateperiod;

import java.util.Date;

import org.joda.time.DateTime;

public class EndPeriodValidator implements PeriodValidator {
	
	
	
	
	/**
	 * validate that current date is end of month
	 * 
	 * @param date
	 *            represent current date
	 */
	private boolean validate(Date date) {
		DateTime now = new DateTime(date);
		DateTime lastDayOfMonth = now.dayOfMonth().withMaximumValue();
		if (now.getDayOfMonth() == lastDayOfMonth.getDayOfMonth()) {
			return true;
		} else {
			return false;
		}
	}
	
	
	public boolean validate(Date date, Period period) {
		if(period.equals(Period.MONTHLY)){
			return validate(date);
		}
		// if required period is not monthly
		else if (validate(date, Period.MONTHLY)) {
			DateTime dateTime = new DateTime(date);
			for (int month : period.getMonthsList()) {
				if (month == dateTime.getMonthOfYear()) {
					return true;
				}
			}
		}
		return false;
	}
}
