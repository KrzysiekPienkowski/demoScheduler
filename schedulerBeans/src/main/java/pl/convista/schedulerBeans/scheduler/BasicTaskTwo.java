package pl.convista.schedulerBeans.scheduler;

import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;
import org.springframework.scheduling.annotation.Scheduled;

@Slf4j
public class BasicTaskTwo {
    @Scheduled(cron = "*/5 * * ? * *")
    void printMessage() {
        log.info("test2");
    }
}
