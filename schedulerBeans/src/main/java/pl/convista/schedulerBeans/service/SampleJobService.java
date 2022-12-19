package pl.convista.schedulerBeans.service;

import org.springframework.stereotype.Service;

@Service
public class SampleJobService {
    public void executeSampleJob() {
        System.out.println("----------First");
    }
}
