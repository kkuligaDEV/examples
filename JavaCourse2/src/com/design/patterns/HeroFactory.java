package com.design.patterns;

public class HeroFactory extends AbstractFactory {
    @Override
    Villain getVillain(String s) {
        return null;
    }

    @Override
    Hero getHero(String heroType) {
        switch(heroType) {
            case "cop":
                return new Cop();
            case "judge":
                return new Judge();
            default:
                return null;
        }
    }
}
