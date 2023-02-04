package pl.convista.schedulerBeans.scheduler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
@Slf4j
public class BasicTaskOne {
    @Scheduled(initialDelay = 1000, fixedDelay = 1000)
    void printMessage() {
        log.info("test");
    }
}
