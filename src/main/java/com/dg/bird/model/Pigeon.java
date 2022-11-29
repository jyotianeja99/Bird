package com.dg.bird.model;

public class Pigeon extends Bird implements Flyable, Eater{

    public Pigeon(String name, String color, String type, int age) {
        super(name, color, type, age);
    }

    @Override
    public void eat() {
        System.out.println(this.getName()+" eats only Millet.");
    }

    @Override
    public void fly() {
        System.out.println(this.getName()+" flies more during day.");

    }
}
