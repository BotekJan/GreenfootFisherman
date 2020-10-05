import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (Jan Botek) 
 * @version (1.0.0)
 */
public class MyWorld extends greenfoot.World
{
    private Fisherman fisherman;
    private Fish fish;
    private ScoreCounter scoreboard;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {   
        super(1100, 600, 1); 
        fisherman = new Fisherman(6, 2);
        addObject(fisherman, 550, 160);
        fish = new Fish(5);
        addObject(fish, 550, 300);
        scoreboard = new ScoreCounter();
        addObject(scoreboard, 550, 25);
    }
    public void act()
    {
        if(Greenfoot.getRandomNumber(100) == 1){
            this.addObject(new Fly(Greenfoot.getRandomNumber(100) + 150),
            Greenfoot.getRandomNumber(1100), Greenfoot.getRandomNumber(420) + 280);
        }
    }
    public int getScore(){
        return scoreboard.getScore();
    }
    public void setScore(int score){
        scoreboard.setScore(score);
    }
}

