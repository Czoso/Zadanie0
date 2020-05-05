package com.company;

public class Main {

    public static void main(String[] args) {

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