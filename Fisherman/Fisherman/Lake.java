import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the world where the game is happening
 * 
 * @author (Jan Botek) 
 * @version (1.0.0)
 */
public class Lake extends greenfoot.World
{
    private Fisherman fisherman;
    private Fish fish;
    private ScoreCounter scoreboard;
    /**
     * Constructor for objects of class Lake.
     * 
     */
    public Lake()
    {   
        super(1100, 600, 1); 
        fisherman = new Fisherman(6, 2);
        addObject(fisherman, 550, 160);
        fish = new Fish(5);
        addObject(fish, 550, 300);
        scoreboard = new ScoreCounter();
        addObject(scoreboard, 550, 25);
    }
    /**
     * Method act
     *  every game tick there is a 1 in 100 chance that this method will spawn a new fly at a random position
     *
     */
    public void act()
    {
        if(Greenfoot.getRandomNumber(100) == 1){
            this.addObject(new Fly(Greenfoot.getRandomNumber(100) + 150),
            Greenfoot.getRandomNumber(1100), Greenfoot.getRandomNumber(420) + 280);
        }
    }
    /**
     * Method getScore-
     *  this method is used to interact with the score counter - get its value
     *
     * @return int score
     */
    public int getScore(){
        return scoreboard.getScore();
    }
    /**
     * Method setScore-
     *  this method is used to interact with the score counter - set its value
     *
     * @param score - int that the score counter will set as its value
     */
    public void setScore(int score){
        scoreboard.setScore(score);
    }
}

