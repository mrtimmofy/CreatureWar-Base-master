import java.util.Random;

/**
 * An extension of the Creature class with an overridden damage function. May also be on fire.
 * 
 * @author Tim Lee  
 * @version 12.12.16
 */
public class Demon extends Creature
{


/**
 * Constructor for objects of class Demon. Calls the super from Creature.
 */
    public Demon()
    {
        super();
        setHealth(30);
        setStrength(25);
        
    }
/**
 * Overidden damage function which has the possibility to add an additional 50 damage 
 * to a damage roll.
 * @return int damage
 */   
    public int damage()
    {
       Random rand = new Random();
       int damage = rand.nextInt(strength)+1;
       int crit= rand.nextInt(100)+1;
       if(crit==5)
       {
           damage=damage+50;
        }
       
    
       return damage;
        
    }

}
