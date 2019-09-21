package com.company;

import java.util.Arrays;

public class NewYearBox implements GiftBox {

    private int boxCounter = 10;
    public Sweet[] sweets = new Sweet[boxCounter];


    @Override
    public void addSweet(Sweet sweet) {
        if (boxCounter > 0) {
            sweets[sweets.length-boxCounter] = sweet;
            boxCounter --;
        }
        else {
            Sweet[] tmpBox = sweets;
            boxCounter = 5;
            sweets = new Sweet[tmpBox.length + boxCounter];
            for (int i = 0; i < tmpBox.length; i++) {
                sweets[i] = tmpBox[i];
            }
            System.out.println("Box was upgraded: " + sweets.length);
            addSweet(sweet);
        }
    }

    @Override
    public void removeSweet(int id) {
        for (int i = 0; i < sweets.length; i++) {
            if (sweets[i].getId() == 0) sweets[i] = null;
        }
    }

    @Override
    public void removeLastSweet() {
        int i = sweets.length-1;
        for (; sweets[i] == null ;i--){

        }
        sweets[i] = null;
    }

    @Override
    public void printSweetsList() {

        System.out.println("\n====================================================\n");
        for (int i = 0; i < sweets.length; i++) {
            if (!(sweets[i] == null)) System.out.println(sweets[i].toString());;

        }
        System.out.println("\n====================================================\n");
    }

    @Override
    public double printBoxWeight() {
        double sumWeight = 0;
        for (int i = 0; i < sweets.length; i++) {
            if (!(sweets[i] == null)) sumWeight += sweets[i].getWeight();
        }
        System.out.println("Box weight is " + sumWeight);
        return sumWeight;
    }

    @Override
    public double printBoxPrice() {
        double sumPrice = 0;
        for (int i = 0; i < sweets.length; i++) {
            if (!(sweets[i] == null)) sumPrice += sweets[i].getPrice();
        }
        System.out.println("Box price is " + sumPrice);
        return sumPrice;
    }

    @Override
    public void reduceWeight(double weight) {
        trimBox();
        Arrays.sort(sweets, (s1, s2) -> {
            return s1.compareByWeight(s2);
        });

        double tmpWeight = 0;
        for (int i = 0; i < sweets.length; i++) {
            if (tmpWeight + sweets[i].getWeight() <= weight) {
                tmpWeight += sweets[i].getWeight();
            } else sweets[i] = null;
        }


    }

    @Override
    public void reducePrice(double price) {
        trimBox();
        Arrays.sort(sweets, (s1, s2) -> {
            return s1.compareByPrice(s2);
        });

        double tmpPrice = 0;
        for (int i = 0; i < sweets.length; i++) {
            if (tmpPrice + sweets[i].getPrice() <= price) {
                tmpPrice += sweets[i].getPrice();
            } else sweets[i] = null;
        }
    }

    public void trimBox() {
        int counter = 0;

        for (int i = 0; i < sweets.length; i++) {
            if (sweets[i] != null) counter++;
        }

        Sweet[] tmp = new Sweet[counter];
        int j = 0;
        for (int i = 0; i < sweets.length; i++) {
            if (sweets[i] != null) {
                tmp[j] = sweets[i];
                j++;
            }
        }

        sweets = tmp;
    }
}
