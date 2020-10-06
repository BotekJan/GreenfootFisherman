import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This greenfoot world initiates when the game ends
 * 
 * @author (Jan Botek) 
 * @version (1.0.0)
 */
public class GameOver extends World
{
    /**
     * GameOver Constructor
     *
     * @param winner String - later displayed as "Winner: " + winner + "!"
     */
    public GameOver(String winner)
    {    
        super(1100, 600, 1); 
        addObject(new Image(new GreenfootImage("GAME OVER", 100, Color.BLUE, Color.WHITE)), 550, 150);
        addObject(new Image(new GreenfootImage("Winner: " + winner + "!", 70, Color.CYAN, Color.WHITE)), 550, 250);
        addObject(new Image(new GreenfootImage("Press \"t\" to play again. ", 40, Color.BLACK, Color.WHITE)), 550, 500);
        Greenfoot.start();
    }

    /**
     * Method act-
     *  when the player presses t - the they will start a new game
     *
     */
    public void act(){
        if(Greenfoot.isKeyDown("t")){
            Greenfoot.setWorld(new Lake());
            Greenfoot.delay(60);
        }
    }
}
