import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * One of the 2 playable components - fishes purpose is to eat flies which incriminate the score and dodge the hooks that the fisherman is throwing
 * 
 * @author (Jan Botek) 
 * @version (1.0.0)
 */
public class Fish extends Actor
{
    private int speed;
    private int score;
    private int bonusSpeed;
    private int bonusSpeedDuration = 0;
    GreenfootImage image1;
    GreenfootImage image2;
    /**
     * Fish Constructor
     *
     * @param int speed - sets the speed at which the fish is going to move
     * @param int bonuspeed - the amount that the speed will increase when the fish
     *                          gets a bonus
     */
    public Fish(int speed, int bonusSpeed)
    {
        this.speed= speed;
        this.bonusSpeed = bonusSpeed;
        this.image1 = new GreenfootImage("images/fish1.png");
        this.image2 = new GreenfootImage("images/fish2.png");
        this.setImage(image1);

    }
    
    /**
     * Method act-
     *  runs the behavioral methods of the fish class
     */
    public void act()
    {
        movement();
        eatingFlies();
        bonusSpeed();
    }
    
    /**
     * Method eatAPizza
     *  this method is called by the pizza when the fish eats is and it sets
     *  the duration of the bonus speed
     *  
     *  @param int bonusDuration - duration of the bonus speed in game cycles
     */
    public void getBonusSpeed(int bonusDuration){
        bonusSpeedDuration = bonusDuration;
        speed = speed + bonusSpeed;
    }
    
    private void bonusSpeed(){
        if(bonusSpeedDuration > 0){
            bonusSpeedDuration--;
            if(bonusSpeedDuration == 0){
                speed = speed - bonusSpeed;
            }
        }
    }

    /**
     * Method movement-
     * ensures the movement of the fish
     * WASD
     *  
     */
    private void movement()
    {
        int x = getX();
        int y = getY();
        if(Greenfoot.isKeyDown("a"))
        {
            setImage(image1);
            setLocation(x - speed, y);
        } 
        if(Greenfoot.isKeyDown("d"))
        {
            setImage(image2);
            setLocation(x + speed, y);
        } 
        if(Greenfoot.isKeyDown("w"))
        {
            if(y > 280)
            {
                this.setLocation(x, y - speed);
            }
        }   
        if(Greenfoot.isKeyDown("s"))
        {
            setImage(image1);
            setLocation(x, y + speed);
        } 
    }
    
    /**
     * Method eatingFlies-
     * ensures that the fish can eat flies by touching them
     *
     */
    private void eatingFlies(){
        Fly fly = (Fly) getOneIntersectingObject(Fly.class);
        if(fly != null){
            Lake world = (Lake) getWorld();
            world.setScore(world.getScore() + fly.getValue());
            removeTouching(Fly.class);
        }
    }

}

