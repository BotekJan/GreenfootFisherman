import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fish extends Actor
{
    private int speed;
    private int score;
    GreenfootImage image1;
    GreenfootImage image2;
    /**
     * Fish Constructor
     *
     * @param int speed - sets the speed at which the fish is going to move
     */
    public Fish(int speed)
    {
        this.speed= speed;
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
            MyWorld world = (MyWorld) getWorld();
            world.setScore(world.getScore() + fly.getValue());
            removeTouching(Fly.class);
        }
    }

}
