package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean(name = "mountainBike")
    public Bicycle mountainBike() {
        return new MountainBike();
    }

    @Bean(name = "kidsBike")
    public Bicycle kidsBike() {
        return new KidsBike();
    }

    @Bean(name = "bmxBike")
    public Bicycle bmxBike() {
        return new BMXBike();
    }
}
