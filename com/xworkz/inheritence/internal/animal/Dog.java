package com.xworkz.inheritence.internal.animal;

public class Dog extends Animal {
    public Dog() {
        super();
        System.out.println("Running non-arg constructor Dog");
    }
    @Override
    public void eat() {
        System.out.println("dog is eating");
    }
    @Override
    public void sleep() {
        System.out.println("dog is sleeping");
    }
    @Override
    public void sound() {
        System.out.println("dog makes sound");
    }
    @Override
    public void run() {
        System.out.println("dog is running");
    }
    @Override
    public void breathe() {
        System.out.println("dog is breathing");
    }
}
