package lesson5;

public class Animal {
    int eyes;

    void animal() {
        System.out.println("I am animal");
    }

    void eat() {
        System.out.println("Animal eats");
    }

    void drink() {
        System.out.println("Animal drinks");
    }

    void sleep() {
        System.out.println("Cat sleeps");
    }
}

class Pet extends Animal {
    int eyes = 2;
    String name;
    int tail = 1;
    int paw = 4;

    void pet() {
        System.out.println("I am pet");

    }

    void tail() {
        System.out.println("Dog has 1 tail");
    }

    void run() {
        System.out.println("Pet runs");
    }

    void jump() {
        System.out.println("Pet run << jumps");
    }
}

class Dog extends Pet {
    String dogName = "Beethoven";

    void showName() {
        System.out.println("I am dog and my name is: +Beethoven+");

    }
}

class Cat extends Pet {
    String catName = "Lisa";

    void catName() {
        System.out.println("I am cat and my name is: +Lisa+");
    }
}