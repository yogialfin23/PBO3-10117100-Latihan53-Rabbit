package com.company;

public class Rabbit extends Animal {
    private String name;
    private String color;

    public Rabbit(boolean vegetarian, String eats, int noOfLegs, String name, String color) {
        super(vegetarian, eats, noOfLegs);
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}
