import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class is used to represent the hook that the fisherman is catching the fish wih
 * 
 * @author (Jan Botek) 
 * @version (1.0.0)
 */
public class Hook extends Actor
{   
    private int speed;
    private Fisherman fisherman;
    /**
     * Hook Constructor
     *
     * @param speed - je to rychlost háku
     * @param fisherman A parameter
     */
    public Hook(int speed, Fisherman fisherman)
    {
        this.speed = speed;
        this.fisherman = fisherman;
        this.getImage().scale(25, 25);   
        setRotation(90);
    }
    /**
     * Method act
     *  this method ensures the falling of the hook and the possible setting of the GAME OVER screen when the hook hits the fish
     */
    public void act()
    {
        move(speed);
        if(isAtEdge())
        {
            fisherman.decrementCurrentHooks();
            getWorld().removeObject(this);
        }
        else if (this.isTouching(Fish.class))
        {
            Greenfoot.setWorld(new GameOver("Fisherman"));
        }
    }
}
