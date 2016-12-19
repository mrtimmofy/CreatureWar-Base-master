
import java.util.Random;

/**
 * I am a servant of the Secret Fire, wielder of the flame of Anor. You cannot pass. 
 * (Unless you're an extended version of the demon class, which, this is.)
 * 
 * @author Tim Lee    
 * @version 12.12.16
 */
public class Balrog extends Demon
{
    // instance variables - replace the example below with your own
        Random rand = new Random();
    /**
     * Constructor for objects of class Balrog. This extends the class Demon, which in turn is calling
     * the constructor from Creature.
     * 
     */
    public Balrog()
    {
        super();
        setHealth(50);
        setStrength(20);
        
        
    }
   /**
    * Another overrriden damage function. This time the Balrog class essentially doubles the times 
    * it attacks, without having to make two calls to the damage function.
    * @return damage
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
       
       damage= damage+rand.nextInt(strength)+1;
       crit=rand.nextInt(100)+1;
       if(crit==5)
       {
           damage=damage+50;
       }
        
       return damage;
        
    }

}
