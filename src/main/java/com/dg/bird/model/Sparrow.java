package com.dg.bird.model;

public class Sparrow extends Bird implements Flyable {
    public Sparrow(String name, String color, String type, int age) {
        super(name, color, type, age);
    }

    @Override
    public void fly() {
        System.out.println(this.getName()+" "+"does fly this manner.");
    }
}
