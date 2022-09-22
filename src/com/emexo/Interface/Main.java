package com.emexo.Interface;

public class Main {

    public static void main(String[] args) {
        // we can use reference for interface name
        Animal a = new Cat();
        a.run();
        a.sound();
        a.print(); // calling default methodkon
        Animal.animalprint(); // calling static method
        System.out.println(Animal.noOfanimals); // calling static variable


        Animal d = new Dog();
        d.run();
        d.sound();
        d.print();
        Animal.animalprint();
        System.out.println(Animal.noOfanimals);

        Animal l = new Lion();
        l.run();
        l.sound();
        l.print();
        Animal.animalprint();
        System.out.println(Animal.noOfanimals);

        Animal c = new Cheetah();
        c.run();
        c.sound();
        c.print();
        Animal.animalprint();
        System.out.println(Animal.noOfanimals);


    }
}
