package com.company;

public class Jellybeans extends Sweet {

    private String figure;

    public Jellybeans(String name, double weight, double price, String figure) {
        super(name, weight, price);
        this.figure = figure;
    }

    public String getFigure() {
        return figure;
    }

    @Override
    public String toString() {
        return super.getName() + ": weight: " + super.getWeight() + " price: " + super.getPrice() + " figure: " + this.getFigure();
    }
}
