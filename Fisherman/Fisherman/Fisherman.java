import greenfoot.*;
/**
 * One of the two playable components - fisherman moves by "a" and "d" and throws down hooks by "m"
 * his purpose is to try to hit the fish with the hooks that he throws
 * 
 * @author (Jan Botek) 
 * @version (1.0.0)
 */
public class Fisherman extends Actor
{
    private int speed;     
    private int maxHooks;  
    private double interest = 100;      
    private int currentHooks = 0;    
    /**
     * Fisherman Constructor
     *
     * @param speed int the speed that the fisherman will move at
     * @param maxHooks int the maximum amount of hooks the fisherman can have at the same time
     */
    public Fisherman(int speed,int maxHooks)
    {
        this.speed = speed;
        this.maxHooks = maxHooks;
        getImage().scale(250, 120);    

    }
    
    /**
     * Method act-
     *  runs the behavioral methods of the Fisherman class
     */
    public void act() 
    {
        movement();
        throwingHooks();
        gameOver();
    }   

    /**
     * Method decrementCurrentHooks
     *  this method is here for when the hooks hits the edge so it can decrement the currenthooks when its deleted
     *
     */
    public void decrementCurrentHooks(){
        currentHooks--;
    }

    /**
     * Method movement
     *  this method ensures the movement of the fisherman
     *  a- left
     *  d- right
     */
    private void movement()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            this.move(speed);
        } 
        else
        {
            if(Greenfoot.isKeyDown("left"))
            {
                this.move(-speed);
            }
        }
    }

    /**
     * Method throwingHooks
     *  this method ensures that by pressing "m" the fisherman can possibly throw a hook
     */
    private void throwingHooks(){
        if("m".equals(Greenfoot.getKey()) && currentHooks < maxHooks){
            getWorld().addObject(new Hook(5, this), this.getX(), this.getY());
            currentHooks++;
            interest = interest - 0.5;
        }   
    }

    /**
     * Method gameOver
     *  this method sets the GAME OVER screen when the fishermans interest is less or equal to 0
     */
    private void gameOver(){
        if(interest <= 0){
            Greenfoot.setWorld(new GameOver("Fish"));
        }
    }
}
