package org.rpgstuff.rpghelper.utils;

import java.util.Random;

public class DieRoller {

    public static Random random = new Random();

    public int rollD3(){
        return rollDice(3);
    }

    public int rollD6(){
        return rollDice(6);
    }

    public int rollD10(){
        return rollDice(10);
    }

    public int rollD20(){
        return rollDice(20);
    }

    private int rollDice(int sides){
        return random.nextInt(sides) + 1;
    }
}
