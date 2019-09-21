package com.company;

public class Marshmallows extends Sweet{

    private String color;

    public Marshmallows(String name, double weight, double price, String color) {
        super(name, weight, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return super.getName() + ": weight: " + super.getWeight() + " price: " + super.getPrice() + " color: " + this.getColor();
    }
}
