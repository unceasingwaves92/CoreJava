package com.emexo.Polymorphism;

public class Main {

    public static void main(String[] args) {
        training tra = new training();
        Animal dog = new Dog();
        Animal fish = new Fish();
        Animal lion = new Lion();
        Animal snake = new Snake();
        tra.teach(lion, 50);
        tra.teach(dog, 30);
        tra.teach(fish, 45);
        tra.teach(snake, 10);

        tra.test(dog, 5);
    }
}
