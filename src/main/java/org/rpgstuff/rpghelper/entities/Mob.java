package org.rpgstuff.rpghelper.entities;

import java.util.List;

public class Mob extends Actor{
    public Mob(String name, int health) {
        super(name, health);
    }

    public Mob(String name, int health, List<Item> items) {
        super(name, health, items);
    }
}
