package Sprite;

/**
 *
 * @author Ren
 */
public abstract class Sprite {

    private String name = "";
    private int level = 1;
    int health = 10;
    int mana = 10;
    int stamina = 10;
    private int strength = 10;
    int intelligence = 10;
    int dexterity = 10;
    int luck = 10;
    int defence = 10;
    int magicDefence = 10;
    int critResistance = 10;

    public Sprite() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
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

}
