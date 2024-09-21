package org.example;

public class Dog {

    private String name, color;
    private int age;

    public Dog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public static void main(String[] args){
        Dog myDog = new Dog("Sherlock", "Black", 12);
        System.out.println("Dog's name: " +myDog.name);
        System.out.println("Color: "+myDog.color);
        System.out.println("Age: "+myDog.age);
    }
}
