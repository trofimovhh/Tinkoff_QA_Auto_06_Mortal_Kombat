package com.company;

public class Battle {
    public static void start() {
        Ninja ninja = new Ninja("Black diamond", "Ninja");
        Cyborg t1000 = new Cyborg("T-1000", "Cyborg");
        ninja.distanceBattleAttack();
        t1000.distanceBattleDefence();
        t1000.distanceBattleAttack();
        ninja.distanceBattleDefence();
        ninja.run();
        ninja.closeBattleAttack();
        t1000.closeBattleDefense();
        t1000.closeBattleAttack();
        ninja.die();
    }
}
