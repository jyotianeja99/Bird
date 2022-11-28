package com.dg.bird.model;

public class Parrot extends Bird implements Flyable{

    public Parrot(String name, String color, String type, int age) {
        super(name, color, type, age);
    }

    @Override
    public void fly() {
        System.out.println(this.getName()+" does fly like other parrots.");
    }
}
