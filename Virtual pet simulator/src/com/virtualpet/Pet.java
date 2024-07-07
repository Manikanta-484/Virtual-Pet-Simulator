package com.virtualpet;

public class Pet {
    private String name;
    private int health;
    private int happiness;
    private int hunger;

    public Pet(String name) {
        this.name = name;
        this.health = 100;
        this.happiness = 100;
        this.hunger = 0;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getHappiness() {
        return happiness;
    }

    public int getHunger() {
        return hunger;
    }

    public void feed() {
        hunger = Math.max(hunger - 20, 0);
        health = Math.min(health + 10, 100);
    }

    public void play() {
        happiness = Math.min(happiness + 20, 100);
        hunger = Math.min(hunger + 10, 100);
        health = Math.max(health - 5, 0);
    }

    public void train() {
        happiness = Math.max(happiness - 10, 0);
        hunger = Math.min(hunger + 15, 100);
        health = Math.min(health + 10, 100);
    }

    public void passTime() {
        hunger = Math.min(hunger + 5, 100);
        if (hunger >= 50) {
            health = Math.max(health - 5, 0);
        }
        happiness = Math.max(happiness - 5, 0);
    }
}
