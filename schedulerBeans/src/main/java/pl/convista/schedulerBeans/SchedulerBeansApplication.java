package pl.convista.schedulerBeans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import pl.convista.schedulerBeans.scheduler.BasicTaskOne;
import pl.convista.schedulerBeans.scheduler.BasicTaskTwo;

@SpringBootApplication
public class SchedulerBeansApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchedulerBeansApplication.class, args);
	}

	@Configuration
	@EnableScheduling
	class SchedulingConfig{

		@Bean
		@ConditionalOnProperty(value = "scheduler.taskOne", havingValue = "true")
		public BasicTaskOne scheduledTaskOne() {
			return new BasicTaskOne();
		}

		@Bean
		@ConditionalOnProperty(value = "scheduler.taskTwo", havingValue = "true")
		public BasicTaskTwo scheduledTaskTwo() {
			return new BasicTaskTwo();
		}


	}

}
