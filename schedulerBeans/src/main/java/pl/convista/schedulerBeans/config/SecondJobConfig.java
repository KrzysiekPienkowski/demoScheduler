package pl.convista.schedulerBeans.config;

import org.quartz.JobDetail;
import org.quartz.SimpleTrigger;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.JobDetailFactoryBean;
import org.springframework.scheduling.quartz.SimpleTriggerFactoryBean;
import pl.convista.schedulerBeans.scheduler.FirstJob;
import pl.convista.schedulerBeans.scheduler.SecondJob;

@Configuration
public class SecondJobConfig {
    @Bean(name = "second-job")
    public JobDetailFactoryBean jobDetail() {
        JobDetailFactoryBean jobDetailFactory = new JobDetailFactoryBean();
        jobDetailFactory.setJobClass(SecondJob.class);
        jobDetailFactory.setDurability(true);
        return jobDetailFactory;
    }
    @Bean(name = "second-trigger")
    public SimpleTriggerFactoryBean trigger(@Qualifier("second-job") JobDetail job) {
        SimpleTriggerFactoryBean trigger = new SimpleTriggerFactoryBean();
        trigger.setJobDetail(job);
        trigger.setRepeatInterval(10*1000);
        trigger.setRepeatCount(SimpleTrigger.REPEAT_INDEFINITELY);
        return trigger;
    }
}
