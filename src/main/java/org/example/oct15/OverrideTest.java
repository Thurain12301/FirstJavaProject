package org.example.oct15;

class Animal {

    void sound() {
        System.out.println("Animals make sound");

    }
}

class Cat extends Animal {
    @Override
    void sound() {

        System.out.println("Cat meows");
    }

}

class Dog extends Cat {
    @Override
    void sound() {

        System.out.println("Dog barks");
    }

}

public class OverrideTest {

    static void main(String[] args) {
        Animal[] animals = {new Cat(), new Dog()};

        for (Animal a : animals) {
            a.sound();
        }
    }
}
