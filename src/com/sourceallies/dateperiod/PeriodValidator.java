package com.sourceallies.dateperiod;

import java.util.Date;


public interface PeriodValidator {

	public enum Period {
		MONTHLY, QUARTERLY, HALF_YEARLY, ANNUALLY;
		public int[] getMonthsList() {
			switch (this) {
			case ANNUALLY: {
				/**
				 * December
				 */
				int[] ANNUALLY_MONTHS = { 12 };
				return ANNUALLY_MONTHS;
			}

			case QUARTERLY: {
				/**
				 * March, June, September, December
				 */
				int[] QUARTERLY_MONTHS = { 3, 6, 9, 12 };
				return QUARTERLY_MONTHS;
			}
			case HALF_YEARLY: {
				/**
				 * September, December
				 */
				int[] HALF_YEARLY_MONTHS = { 6, 12 };
				return HALF_YEARLY_MONTHS;
			}
			case MONTHLY: {
				// return empty List
				int[] MONTHS = {};
				return MONTHS;
			}
			default:
				return null;
			}

		}
	}

	boolean validate(Date date, Period period);
}
