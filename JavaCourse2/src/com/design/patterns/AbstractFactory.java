package com.design.patterns;

public abstract class AbstractFactory {
    abstract Villain getVillain(String s);
    abstract Hero getHero(String s);
}
