package Sprite;

/**
 *
 * @author Ren
 */
public abstract class Entity extends Sprite {

    private Classification classification;
    private String name;
    private int level = 1;
    private int exp = 0;
    private int nextCap = 1000;
    private int health;
    private int currentHealth = 10;
    private int mana;
    private int currentMana = 10;
    private int stamina;
    private int currentStamina = 10;
    private int strength;
    private int currentStrength = 10;
    private int intelligence;
    private int currentIntelligence = 10;
    private int dexterity;
    private int currentDexterity = 10;
    private int luck;
    private int currentLuck = 10;
    private int defence;
    private int currentDefence = 10;
    private int magicDefence;
    private int currentMagicDefence = 10;
    private int critResistance;
    private int currentCritResistance = 10;

    public Entity() {
    }

    public Classification getClassification() {
        return classification;
    }

    public void setClassification(Classification classification) {
        this.classification = classification;
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

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public int getCurrentMana() {
        return currentMana;
    }

    public void setCurrentMana(int currentMana) {
        this.currentMana = currentMana;
    }

    public int getCurrentStamina() {
        return currentStamina;
    }

    public void setCurrentStamina(int currentStamina) {
        this.currentStamina = currentStamina;
    }

    public int getCurrentStrength() {
        return currentStrength;
    }

    public void setCurrentStrength(int currentStrength) {
        this.currentStrength = currentStrength;
    }

    public int getCurrentIntelligence() {
        return currentIntelligence;
    }

    public void setCurrentIntelligence(int currentIntelligence) {
        this.currentIntelligence = currentIntelligence;
    }

    public int getCurrentDexterity() {
        return currentDexterity;
    }

    public void setCurrentDexterity(int currentDexterity) {
        this.currentDexterity = currentDexterity;
    }

    public int getCurrentLuck() {
        return currentLuck;
    }

    public void setCurrentLuck(int currentLuck) {
        this.currentLuck = currentLuck;
    }

    public int getCurrentDefence() {
        return currentDefence;
    }

    public void setCurrentDefence(int currentDefence) {
        this.currentDefence = currentDefence;
    }

    public int getCurrentMagicDefence() {
        return currentMagicDefence;
    }

    public void setCurrentMagicDefence(int currentMagicDefence) {
        this.currentMagicDefence = currentMagicDefence;
    }

    public int getCurrentCritResistance() {
        return currentCritResistance;
    }

    public void setCurrentCritResistance(int currentCritResistance) {
        this.currentCritResistance = currentCritResistance;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getNextCap() {
        return nextCap;
    }

    public void setNextCap(int nextCap) {
        this.nextCap = nextCap;
    }

    public void checkExp() {
        System.out.println(exp);
        if (exp >= nextCap) {
            System.out.println("Level up!");
            level++;
            System.out.println("You are now level " + level);
            nextCap += 2000;
            this.updateStats();
        }
        System.out.println("Exp needed to " + (level + 1) + " is " + (nextCap - exp));

    }

    public void updateStats() {
        classification.levelUp(level);
        this.health = classification.getHealth();
        System.out.println("New Health = " + health);
        currentHealth = health;
        mana = classification.getMana();
        currentMana = mana;
        this.stamina = classification.getStamina();
        intelligence = classification.getIntelligence();
        currentIntelligence = intelligence;
        dexterity = classification.getDexterity();
        currentDexterity = dexterity;
        luck = classification.getLuck();
        currentLuck = luck;
        defence = classification.getDefence();
        currentDefence = defence;
        magicDefence = classification.getMagicDefence();
        currentMagicDefence = magicDefence;
        critResistance = classification.getCritResistance();
        currentCritResistance = critResistance;

    }

    public void printStats() {
        System.out.println(health);
        System.out.println(mana);
        System.out.println(stamina);
        System.out.println(intelligence);
        System.out.println(dexterity);
        System.out.println(luck);
        System.out.println(defence);
        System.out.println(magicDefence);
        System.out.println(critResistance);

    }

}
