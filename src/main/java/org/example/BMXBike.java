package org.example;

public class BMXBike implements Bicycle {
    private String type;

    public BMXBike(String type) {
        this.type = type;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Bicycle type: " + type;
    }
}
