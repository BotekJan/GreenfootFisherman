import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{
    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public GameOver(String winner)
    {    
        super(1100, 600, 1); 
        addObject(new Image(new GreenfootImage("GAME OVER", 100, Color.BLUE, Color.WHITE)), 550, 150);
        addObject(new Image(new GreenfootImage("Winner: " + winner + "!", 70, Color.CYAN, Color.WHITE)), 550, 250);
        addObject(new Image(new GreenfootImage("Press \"t\" to play again. ", 40, Color.BLACK, Color.WHITE)), 550, 500);
        Greenfoot.start();
    }
    public void act(){
        if(Greenfoot.isKeyDown("t")){
            Greenfoot.setWorld(new MyWorld());
            Greenfoot.delay(60);
        }
    }
}
