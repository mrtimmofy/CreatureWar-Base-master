import java.util.*;

/**
 * This class creates two arrays of creatures and has them "battle" one vs one
 * 
 * @author Tim Lee 
 * @version 12.12.16
 */
public class CreatureWar
{
    public CreatureWar()
    {
        
    }

    /**
     * Creates two seperate arrays of creatures and has them "battle" each other via methods. 
     * Winner is displayed after the results are printed and calculated.
     * 
    */
    public void battle()
    {
        int i=0;
        Random rand = new Random();
        ArrayList<Creature> team1 = new ArrayList<Creature>();
        ArrayList<Creature> team2 = new ArrayList<Creature>();
        
        for( i=0; i<20; i++)
        {
            team1.add(i,new Human());
            team2.add(i,new Human());
        }
        team1.add(10,new CyberDemon());
        team2.add(10,new CyberDemon()); 
        team2.add(20,new Balrog()); 
        team2.add(20,new Balrog()); 
  
        int teamOneIndex=0;
        int teamTwoIndex=0;
    System.out.println("The battle begins!");
    
    while( teamOneIndex < team1.size() && teamTwoIndex < team2.size())
    {
        
        {
            team1.get(teamOneIndex).takeDamage(team2.get(teamTwoIndex).damage());
            team2.get(teamTwoIndex).takeDamage(team1.get(teamOneIndex).damage());

        }
        if(team1.get(teamOneIndex).getHealth()<0 && team2.get(teamTwoIndex).getHealth()<0)
            {
                teamOneIndex++; 
                teamTwoIndex++;
                System.out.println("Both creatures died!");
            }
            else if(team1.get(teamOneIndex).getHealth()<0)
            {
                teamOneIndex++;
                System.out.println("A creature from Team One died");
            }
            else if(team2.get(teamTwoIndex).getHealth()<0)
            {
                teamTwoIndex++;
                System.out.println("A creature from Team Two died");
            }
            
    }
    
    String result=""; 
    System.out.println("Team One Casualties: "+teamOneIndex);
    System.out.println("Team Two Casualties: "+teamTwoIndex);  
    if(teamOneIndex<21 && teamOneIndex<21)
        result="Nobody!";
    if(teamOneIndex<21)
        result="Team Two!";
    if(teamTwoIndex<21)
        result="Team One!" ;       
    System.out.println("And the winner is...." + result);
    
    }
}
        
