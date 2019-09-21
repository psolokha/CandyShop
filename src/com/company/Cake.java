package com.company;

public class Cake extends Sweet {

    private String type;

    public Cake(String name, double weight, double price, String type) {
        super(name, weight, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return super.getName() + ": weight: " + super.getWeight() + " price: " + super.getPrice() + " type: " + this.getType();
    }
}
