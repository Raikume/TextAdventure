package Sprite;

/**
 *
 * @author Ren
 */
public abstract class Classification extends Sprite {
    
    private String name;
    private int health = 0;
    private int mana = 0;
    private int stamina = 0;
    private int strength = 0;
    private int intelligence = 0;
    private int dexterity = 0;
    private int luck = 0;
    private int defence = 0;
    private int magicDefence = 0;
    private int critResistance = 0;

    public Classification() {
    }

    public abstract void levelUp(int level);

}
