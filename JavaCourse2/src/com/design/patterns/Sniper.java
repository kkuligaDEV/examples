package com.design.patterns;

public class Sniper implements Villain {
    @Override
    public void specialAbility() {
        System.out.println("I can use my Dragunov rifle");
    }

    @Override
    public void useAbility() {
        System.out.println("Cal .50 shots fired!");
    }
}
