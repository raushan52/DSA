package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal animal = new Dog();
        animal.run();
        animal.eat();
    }
}

abstract class Animal{
    void run(){
        System.out.println("animal is running.");
    }
    abstract void eat();
}
class Dog extends Animal{

    void run(){
        System.out.println("Dog is running");
    }
    void eat(){
        System.out.println("Dog is eating.");
    }
}
