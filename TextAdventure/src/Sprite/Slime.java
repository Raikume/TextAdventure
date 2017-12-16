/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sprite;

/**
 *
 * @author Ren
 */
public class Slime extends Classification {

    private String name = "Slime";
    private int health = 10;
    private int mana = 10;
    private int stamina = 10;
    private int strength = 10;
    private int intelligence = 10;
    private int dexterity = 10;
    private int luck = 10;
    private int defence = 20;
    private int magicDefence = 5;
    private int critResistance = 10;

    public Slime() {
        
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

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getLuck() {
        return luck;
    }

    public void setLuck(int luck) {
        this.luck = luck;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getMagicDefence() {
        return magicDefence;
    }

    public void setMagicDefence(int magicDefence) {
        this.magicDefence = magicDefence;
    }

    public int getCritResistance() {
        return critResistance;
    }

    public void setCritResistance(int critResistance) {
        this.critResistance = critResistance;
    }
    

    @Override
    public void levelUp(int level) {
        health += 15 * level;
        mana += 50 * level;
        stamina += 50 * level;
        strength += 15 * level;
        intelligence += 10 * level;
    }
    

}
