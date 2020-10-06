import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This screen represents the main manu
 * 
 * @author (Jan Botek) 
 * @version (1.0.0)
 */
public class Start extends World
{

    /**
     * Constructor for objects of class Start.
     * 
     */
    public Start()
    {    
        super(1100, 600, 1); 
        addObject(new Image(new GreenfootImage("Fisherman", 200, Color.BLUE, Color.WHITE)), 550, 150);
        addObject(new Image(new GreenfootImage("fisherman.png")), 550, 300);
        addObject(new Image(new GreenfootImage("Press \"s\" to start the game. ", 40, Color.BLACK, Color.WHITE)), 550, 500);
        Greenfoot.start();
    }

    /**
     * Method act-
     *  if the player presses "s" it will initialize the lake world
     *
     */
    public void act(){
        if(Greenfoot.isKeyDown("s")){
            Greenfoot.setWorld(new Lake());
            Greenfoot.delay(60);
        }
    }
}
