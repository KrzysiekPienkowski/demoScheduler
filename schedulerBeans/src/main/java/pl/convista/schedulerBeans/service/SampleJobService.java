package pl.convista.schedulerBeans.service;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SampleJobService {
    public void executeSampleJob() {
        log.info("----------First");
    }

    public void executeSampleSecondJob() {
        log.info("Second----------");
    }
}
