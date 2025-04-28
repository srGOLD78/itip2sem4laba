package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== XML Configuration ===");
        ClassPathXmlApplicationContext xmlContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Bicycle bicycle = xmlContext.getBean("mountainBike",Bicycle.class);
        BicycleShop xmlShop = new BicycleShop(bicycle);
        xmlShop.showBicycle();
        xmlContext.close();

        System.out.println("\n=== Annotation Configuration ===");
        AnnotationConfigApplicationContext annotationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        Bicycle annotaionBicycle = annotationContext.getBean("kidsBike", Bicycle.class);
        BicycleShop annotationShop = new BicycleShop(annotaionBicycle);
        annotationShop.showBicycle();
        annotationContext.close();
    }
}
