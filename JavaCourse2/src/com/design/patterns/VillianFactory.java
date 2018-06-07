package com.design.patterns;

public class VillianFactory extends AbstractFactory {
    @Override
    Villain getVillain(String villianType) {
        switch(villianType) {
            case "Warrior":
                return  new Warrior();
            case "Sniper":
                return new Sniper();
            case "Magician":
                return new Magician();
            default:
                return null;

        }
    }

    @Override
    Hero getHero(String s) {
        return null;
    }
}
