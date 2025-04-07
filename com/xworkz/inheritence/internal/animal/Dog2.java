package com.xworkz.inheritence.internal.animal;

public class Dog2 {
    public Dog2(){
        System.out.println("Dog 2 constructor");
    }

    public void Barki(Animal animal){
        animal.breathe();
        animal.eat();
        animal.sleep();
        animal.run();
        animal.sleep();

        if(animal instanceof Dog){
            System.out.println("animal is instance of Dog");
            Dog d=(Dog)animal;
        }
    }
}
