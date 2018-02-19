package org.rpgstuff.rpghelper.entities;

import java.util.List;

public class Hero extends Actor{
    private String playerName;

    public Hero(String name, int health, String playerName) {
        super(name, health);
        this.playerName = playerName;
    }

    public Hero(String name, int health, List<Item> items, String playerName) {
        super(name, health, items);
        this.playerName = playerName;
    }
}
