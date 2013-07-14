import java.util.Date;

import org.joda.time.DateTime;

import com.sourceallies.dateperiod.EndPeriodValidator;
import com.sourceallies.dateperiod.PeriodValidator;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		PeriodValidator validator = new EndPeriodValidator();

		Date d = new Date();
		Boolean valid1 = validator.validate(d, PeriodValidator.Period.MONTHLY);
		Boolean valid2 = validator
				.validate(d, PeriodValidator.Period.QUARTERLY);
		Boolean valid3 = validator.validate(d,
				PeriodValidator.Period.HALF_YEARLY);
		Boolean valid4 = validator.validate(d, PeriodValidator.Period.ANNUALLY);
		System.out.println(d.toGMTString() + " is =>" + valid1 + "," + valid2
				+ "," + valid3 + "," + valid4);

		DateTime endOfMarchQuar = new DateTime().withDate(2012, 3, 31);
		valid1 = validator.validate(endOfMarchQuar.toDate(),
				PeriodValidator.Period.MONTHLY);
		valid2 = validator.validate(endOfMarchQuar.toDate(),
				PeriodValidator.Period.QUARTERLY);
		valid3 = validator.validate(endOfMarchQuar.toDate(),
				PeriodValidator.Period.HALF_YEARLY);
		valid4 = validator.validate(endOfMarchQuar.toDate(),
				PeriodValidator.Period.ANNUALLY);
		System.out.println(endOfMarchQuar.toDate().toGMTString() + " is =>"
				+ valid1 + "," + valid2 + "," + valid3 + "," + valid4);
		
		
		DateTime endOfJuneHalf = new DateTime().withDate(2012, 6, 30);
		valid1 = validator.validate(endOfJuneHalf.toDate(),
				PeriodValidator.Period.MONTHLY);
		valid2 = validator.validate(endOfJuneHalf.toDate(),
				PeriodValidator.Period.QUARTERLY);
		valid3 = validator.validate(endOfJuneHalf.toDate(),
				PeriodValidator.Period.HALF_YEARLY);
		valid4 = validator.validate(endOfJuneHalf.toDate(),
				PeriodValidator.Period.ANNUALLY);
		System.out.println(endOfJuneHalf.toDate().toGMTString() + " is =>"
				+ valid1 + "," + valid2 + "," + valid3 + "," + valid4);
		

		DateTime endOfyear = new DateTime().withDate(2012, 12, 31);
		valid1 = validator.validate(endOfyear.toDate(),
				PeriodValidator.Period.MONTHLY);
		valid2 = validator.validate(endOfyear.toDate(),
				PeriodValidator.Period.QUARTERLY);
		valid3 = validator.validate(endOfyear.toDate(),
				PeriodValidator.Period.HALF_YEARLY);
		valid4 = validator.validate(endOfyear.toDate(),
				PeriodValidator.Period.ANNUALLY);
		System.out.println(endOfyear.toDate().toGMTString() + " is =>" + valid1
				+ "," + valid2 + "," + valid3 + "," + valid4);

		System.out.print("wwawa");

	}

}
