package org.example;

public class BicycleShop {
    private Bicycle bicycle;

    // IoC через конструктор
    public BicycleShop(Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    public void showBicycle() {
        System.out.println("В магазине есть: " + bicycle.getType());
    }
}
