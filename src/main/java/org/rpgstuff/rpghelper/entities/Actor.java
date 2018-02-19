package org.rpgstuff.rpghelper.entities;

import java.util.ArrayList;
import java.util.List;

public abstract class Actor {

    private String name;
    private int health;
    private List<Item> items;

    protected Actor(String name, int health) {
        this.name = name;
        this.health = health;
        this.items = new ArrayList<>();
    }

    protected Actor(String name, int health, List<Item> items) {
        this.name = name;
        this.health = health;
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
