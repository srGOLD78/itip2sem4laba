package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== XML Configuration ===");
        ClassPathXmlApplicationContext xmlContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        BicycleShop shopFromXml = xmlContext.getBean("bicycleShop", BicycleShop.class);
        shopFromXml.showBicycle();
        xmlContext.close();

        System.out.println("\n=== Annotation Configuration ===");
        AnnotationConfigApplicationContext annotationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        BicycleShop shopFromAnnotation = annotationContext.getBean("bicycleShop", BicycleShop.class);
        shopFromAnnotation.showBicycle();
        annotationContext.close();
    }
}
