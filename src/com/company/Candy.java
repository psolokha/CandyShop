package com.company;

public class Candy extends Sweet {

    private String color;

    public Candy(String name, double weight, double price, String color) {
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
