package org.example;

public class MountainBike implements Bicycle {
    private String type;

    public MountainBike(String type) {
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
