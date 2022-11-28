package com.dg.bird.model;

public class Crow extends Bird implements Flyable, Eater {

    public Crow(String name, String color, String type, int age) {
        super(name, color, type, age);
    }

    @Override
    public void fly() {
        System.out.println("This bird can fly");
    }

    @Override
    public void eat() {
        System.out.println("This bird can eat.");
    }
}
