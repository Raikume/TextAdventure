package AdventureControl;

import AdventureModel.Player;
import Sprite.Slime;

/**
 *
 * @author Ren
 */
public class Control {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Welcome to Text Adventure!");
        System.out.println("Character Created");
        Player one = new Player();
        System.out.println("Choose a Race");
        //if statements later
        Slime blue = new Slime();
        System.out.println(blue.getName());
        System.out.println(blue.getHealth());
        one.setClassification(blue);
        
        System.out.println("You are a " + one.getClassification().getName());
        one.setName("Rimuru");
        System.out.println("You shall be called Rimuru");
        one.printStats();
        one.setExp(5000);
        for (int i = 0; i < 10; i++) {
            one.checkExp();
        }
        one.printStats();
        
    }

}
