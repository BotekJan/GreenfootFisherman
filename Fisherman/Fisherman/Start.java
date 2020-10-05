import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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

    public void act(){
        if(Greenfoot.isKeyDown("s")){
            Greenfoot.setWorld(new MyWorld());
            Greenfoot.delay(60);
        }
    }
}
