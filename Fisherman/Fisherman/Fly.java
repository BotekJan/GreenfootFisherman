import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fly here.
 * 
 * @author (Jan Botek) 
 * @version (1.0.0)
 */
public class Fly extends Actor
{
    private int lifespan;
    private int procentoVyskytu;

    /**
     * Fly Constructor
     *
     * @param lifespan A parameter- for how many game cycles will the fly live
     */
    public Fly(int lifespan)
    {
        this.lifespan= lifespan;
    }
    
    /**
     * Method act-
     *  ensures that the fly will disappear after the end of its lifespan
     */
    public void act()
    {
        this.lifespan--;
        if(lifespan <= 0)
        {
            this.getWorld().removeObject(this);
        }
    }

    /**
     * Method getValue-
     * returns the value of the fly based on its y coordinate
     * y < 380 = 3
     * y < 480 = 2
     * y < 600 = 1
     * 
     * @return int value
     */
    public int getValue() 
    {
        int y = this.getY();
        if(y > 380)
        {
            if(y >  480)
            {
                return 1;

            } else
            {
                return 2;
            } 
        }    
        return 3;
    }

}    
