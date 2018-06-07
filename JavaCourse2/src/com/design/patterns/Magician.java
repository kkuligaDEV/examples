package com.design.patterns;

public class Magician implements Villain {

    @Override
    public void specialAbility() {
        System.out.println("I can use my magic stick");
    }

    @Override
    public void useAbility() {
        System.out.println("Taste power of magic");
    }
}
