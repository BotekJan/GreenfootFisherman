import greenfoot.*;
/**
 * Write a description of class Fisherman here.
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
    public Fisherman(int speed,int maxHooks)
    {
        this.speed = speed;
        this.maxHooks = maxHooks;
        getImage().scale(250, 120);    

    }

    public void act() 
    {
        movement();
        throwingHooks();
        gameOver();
    }   

    public void decrementCurrentHooks(){
        currentHooks--;
    }

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

    private void throwingHooks(){
        if("m".equals(Greenfoot.getKey()) && currentHooks < maxHooks){
            getWorld().addObject(new Hook(5, this), this.getX(), this.getY());
            currentHooks++;
            interest = interest - 0.5;
        }   
    }

    private void gameOver(){
        if(interest <= 0){
            Greenfoot.setWorld(new GameOver("Fish"));
        }
    }
}
