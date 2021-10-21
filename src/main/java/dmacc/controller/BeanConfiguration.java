package dmacc.controller;

import dmacc.beans.Mission;
import java.util.Calendar;
import java.util.Date;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



/**
 * @author Dylan Thomas - djthomas4
 * CIS175 - Fall 2021
 * Oct 20, 2021
 */

@Configuration
public class BeanConfiguration {
	
	
	@Bean
	public Mission mission() {
		// Create date
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2011);
		cal.set(Calendar.MONTH, Calendar.AUGUST);
		cal.set(Calendar.DAY_OF_MONTH, 5);
		Date date = cal.getTime();
		
		// Create bean
		Mission bean = new Mission("JUNO");
		bean.setTarget("Jupiter's Orbit");
		bean.setType("Orbiter");
		bean.setIn_progress(true);
		bean.setLaunch_date(date);

		return bean;
	}

}
