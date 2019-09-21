package com.company;

public interface GiftBox {

    public void addSweet(Sweet sweet);
    public void removeSweet(int id);
    public void removeLastSweet();
    public void printSweetsList();
    public double printBoxWeight();
    public double printBoxPrice();
    public void reduceWeight(double weight);
    public void reducePrice(double price);

}
