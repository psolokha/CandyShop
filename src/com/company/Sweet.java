package com.company;

public abstract class Sweet {

    public static int SWEET_COUNTER = 0;


    private int id;
    private String name;
    private double weight;
    private double price;

    public Sweet(String name, double weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.id = ++Sweet.SWEET_COUNTER;
    }

    public int compareByWeight(Sweet rValue) {
        if ((this.getWeight() - rValue.getWeight()) < 0) return 1;
        else if ((this.getWeight() - rValue.getWeight()) > 0) return -1;
        return 0;
    }

    public int compareByPrice(Sweet rValue) {
        if ((this.getPrice() - rValue.getPrice()) < 0) return 1;
        else if ((this.getPrice() - rValue.getPrice()) > 0) return -1;
        return 0;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }
}
