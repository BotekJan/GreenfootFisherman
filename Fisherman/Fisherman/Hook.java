import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hook here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
            Greenfoot.stop();
            gameOver();
        }
    }
    
    private void gameOver(){
        Greenfoot.setWorld(new GameOver("Fisherman"));
    }
}
