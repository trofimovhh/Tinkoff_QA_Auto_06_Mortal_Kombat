package com.company;

public class Ninja extends Warrior implements CloseBattle, DistanceBattle {
    public Ninja(String name, String type) {
        super(name, type);
    }

    @Override
    public void run() {
        System.out.println(name + " silently running towards his opponent");
    }

    @Override
    public void closeBattleAttack() {
        System.out.println(name + " stabbes his opponent with his sai");
    }

    @Override
    public void closeBattleDefense() {
        System.out.println(name + " uses pair of tonfas to defend against opponent's weapon");
    }

    @Override
    public void distanceBattleAttack() {
        System.out.println(type + " " + name + " throws a shuriken");
    }

    @Override
    public void distanceBattleDefence() {
        System.out.println(name + " uses pair of metal nunchaks");
    }
}
