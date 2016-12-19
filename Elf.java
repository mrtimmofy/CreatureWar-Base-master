import java.util.Random;

/**
 * The elf class contains data regarding the elf creature, with an overridden damage() function. 
 * Pointy ears not included.
 * 
 * @author Tim Lee 
 * @version 12.12.16
 */
public class Elf extends Creature
{
    // instance variables - replace the example below with your own
        Random rand = new Random();
/**
 * Constructor which calls the superclass constructor ( Creature ) 
 */
    public Elf()
    {
        super();
        setHealth(7);
        setStrength(3);
    }
/**
 * Damage function which returns an int, but has the chance to critical for twice as much damage.
 * This is based on a conditional which checks the crit field.
 * @return int damage
 */    
    public int damage()
    {
       Random rand = new Random();
       int damage = rand.nextInt(strength)+1;
       int crit= rand.nextInt(10)+1;
       if(crit==10)
       {
           damage=damage*2;
        }
       
    
       return damage;
        
    }

}

