package com.dg.bird.model;

public class Penguin extends Bird implements Eater{

    public Penguin(String name, String color, String type, int age) {
        super(name, color, type, age);
    }

    @Override
    public void eat() {
        System.out.println(this.getName()+" eats very slow.!");
    }
}
