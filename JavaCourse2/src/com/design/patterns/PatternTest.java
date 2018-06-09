package com.design.patterns;

public class PatternTest {

    public static void main(String[] args) {
        AbstractFactory villianFactory = FactoryGenerator.factory("villian");

        Villain villain1 = villianFactory.getVillain("Warrior");
        System.out.println("Warrior has been created");

        villain1.specialAbility();
        villain1.useAbility();

        Villain villain2 = villianFactory.getVillain("Sniper");
        System.out.println("Sniper has been created");

        villain2.specialAbility();
        villain2.useAbility();

        AbstractFactory heroGenerator = FactoryGenerator.factory("hero");

        Hero hero1 = heroGenerator.getHero("cop");
        hero1.specialAbility();
        System.out.println("Cop has been created");
        Hero hero2 = heroGenerator.getHero("judge");
        hero2.specialAbility();
        System.out.println("judge has been created");
    }
}
