package com.company;

public class Cyborg extends Warrior implements CloseBattle, DistanceBattle {
    public Cyborg(String name, String type) {
        super(name, type);
    }

    @Override
    public void run() {
        System.out.println(name + " running with metal sounds");
    }

    @Override
    public void closeBattleAttack() {
        System.out.println(name + " squeezes his victim with his metal arms");
    }

    @Override
    public void closeBattleDefense() {
        System.out.println(name + " laughs in the face of his opponent. He's a freaking machine");
    }

    @Override
    public void distanceBattleAttack() {
        System.out.println(name + " shoots with laser");
    }

    @Override
    public void distanceBattleDefence() {
        System.out.println(type + " " + name + " doesn't give a shit");
    }
}
