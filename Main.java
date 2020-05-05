package com.company;

public class Main {

    public static void main(String[] args) {
        Car honda = new Car("Accord","Honda",85000,2018,1.8);

        Animal dog = new Animal("dog");
        Animal cat = new Animal("cat");
        Animal unknown = new Animal("lion");

        dog.feed();
        dog.takeForAWalk();
        cat.feed();
        for (int i = 0; i < 6; i++) {
            cat.takeForAWalk();
        }
    }
}