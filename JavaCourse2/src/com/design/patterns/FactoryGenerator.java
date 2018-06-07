package com.design.patterns;

public class FactoryGenerator {

    public static AbstractFactory factory(String s) {
        switch (s) {
            case "hero":
                return new HeroFactory();
            case "villian":
                return new VillianFactory();
            default:
                return null;
        }
    }
}
