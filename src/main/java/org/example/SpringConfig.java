package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public Bicycle mountainBike() {
        return new MountainBike("Горный велосипед");
    }

    @Bean
    public Bicycle kidsBike() {
        return new KidsBike("Детский велосипед");
    }

    @Bean
    public Bicycle bmxBike() {
        return new BMXBike("BMX велосипед");
    }

    @Bean
    public BicycleShop bicycleShop() {
        return new BicycleShop(mountainBike());
    }
}
