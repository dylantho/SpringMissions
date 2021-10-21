package dmacc;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import dmacc.beans.Mission;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.MissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

@SpringBootApplication
public class SpringMissionsApplication  implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringMissionsApplication.class, args);
	}
	
	@Autowired
	MissionRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		
		// Using an existing bean
		Mission m = appContext.getBean("mission", Mission.class);
		m.setTarget("Jupiter");
		repo.save(m);
		
		// Create date
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2020);
		cal.set(Calendar.MONTH, Calendar.JULY);
		cal.set(Calendar.DAY_OF_MONTH, 30);
		Date pers_date = cal.getTime();
		
		// Create bean
		Mission pers = new Mission("Perseverance", "Mars", "Rover", true, pers_date);
		repo.save(pers);
		
		// Create date
		cal.set(Calendar.YEAR, 1977);
		cal.set(Calendar.MONTH, Calendar.SEPTEMBER);
		cal.set(Calendar.DAY_OF_MONTH, 5);
		Date voy_date = cal.getTime();
		
		// Create second bean
		Mission voy1 = new Mission("Voyager 1", "Jupiter, Saturn", "Flyby", false, voy_date);
		repo.save(voy1);
		
		List<Mission> missionList = repo.findAll();
		for(Mission mis: missionList) {
			System.out.println(mis.toString());
		}
		
		((AbstractApplicationContext) appContext).close();
	}

}
