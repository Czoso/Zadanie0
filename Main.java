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

        Car honda = new Car("Accord", "Honda", 3000, 2018, 1.8);
        Human mike = new Human("Mike", 4000.0, dog, honda);

        mike.setSalary(-100);
        mike.setSalary(200);
        mike.getSalary();
        mike.setCar(honda);
        System.out.println(mike.getCar());
    }
}