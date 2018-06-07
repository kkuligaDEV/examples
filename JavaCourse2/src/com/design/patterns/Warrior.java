package com.design.patterns;

public class Warrior implements Villain {
    @Override
    public void specialAbility() {
        System.out.println("I can use my special sword");
    }

    @Override
    public void useAbility() {
        System.out.println("Feel my sword power");
    }
}
