package com.dg.bird.model;

public abstract class Bird {
    private String name;
    private String color;
    private String type;
    private int age;

    public Bird(String name, String color, String type, int age) {
        this.name = name;
        this.color = color;
        this.type = type;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private void walk(){
        System.out.println(this.name+" "+" walks this way.");
    }
}
