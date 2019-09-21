package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        NewYearBox nyBox = new NewYearBox();

        nyBox.addSweet(new Candy("Chupa-chups", 10,0.31,"pink"));
        nyBox.addSweet(new Candy("Lolipop", 10,0.42,"rainbow"));
        nyBox.addSweet(new Jellybeans("Haribo", 60,0.63,"Teddy Bear"));
        nyBox.addSweet(new Cake("ChokoPie", 25,0.55,"Snack"));
        nyBox.addSweet(new Chocolate("Toblerone", 125,3.5,"Dark Chocolate"));
        nyBox.addSweet(new Marshmallows("Haribo", 40,2.17,"White"));
        nyBox.addSweet(new Chocolate("Milka", 90,1.53,"Milk Chocolate"));
        nyBox.addSweet(new Candy("Mentos", 35,0.75,"Blue"));
        nyBox.addSweet(new Marshmallows("Bonjour", 150,3,"White"));
        nyBox.addSweet(new Jellybeans("Frutella", 60,1,"Fruits"));
        nyBox.addSweet(new Candy("Tic Tak", 15,0.58,"pink"));
        nyBox.addSweet(new Cake("Chipicao", 20,0.22,"Croissant"));
        nyBox.addSweet(new Cake("Kinder Delice", 25,0.47,"Snack"));



        nyBox.printBoxPrice();
        nyBox.printBoxWeight();

        nyBox.printSweetsList();

        System.out.println("\nRemove last sweet");
        nyBox.removeLastSweet();
        nyBox.printSweetsList();
        nyBox.printBoxPrice();
        nyBox.printBoxWeight();

        System.out.println("\nReduce weight to 600");
        nyBox.reduceWeight(600);
        nyBox.printSweetsList();
        nyBox.printBoxPrice();
        nyBox.printBoxWeight();

        System.out.println("\nReduce price to 12");
        nyBox.reducePrice(12);
        nyBox.printSweetsList();
        nyBox.printBoxWeight();
        nyBox.printBoxPrice();


    }
}
