import java.util.Random;

/**
 * The scariest monster of all ( An extension of the Creature class with some field changes)
 * 
 * @author Tim Lee
 * @version 12.12.16
 */
public class Human extends Creature
{
    // instance variables - replace the example below with your own
    private int maxHP=25;
    private int maxStrength=13;

    /**
     * Constructor for objects of class Human. This overrides a few fields from the default 
     * constructor, changing the maximum health and strength of humans.
     */
    public Human()
    {
        super();
        Random rand = new Random();
        setHealth(rand.nextInt(maxHP)+minHP);
        setStrength(rand.nextInt(maxStrength)+minHP);
        
    }

}
