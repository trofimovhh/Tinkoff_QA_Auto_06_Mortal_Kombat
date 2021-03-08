package com.company;

public abstract class Warrior {
    String name;
    String type;

    public Warrior(String name, String type) {
        this.name = name;
        this.type = type;
    }

    protected abstract void run();

    protected void die() {
        System.out.println(name + " dies!");
    }

}
