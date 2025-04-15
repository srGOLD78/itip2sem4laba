package org.example;

public class KidsBike implements Bicycle {
    private String type;

    public KidsBike(String type) {
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
