import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PocitadloSkore here.
 * 
 * @author (Jan Botek) 
 * @version (1.0.0)
 */
public class ScoreCounter extends Actor
{
    private int score = 0;
    public ScoreCounter(){
        setImage(new GreenfootImage("Score: " + score ,50, Color.CYAN, Color.BLUE));
    }
    /**
     * Method act-
     *  Keeps the score counter updated.
     */
    public void act(){
        setImage(new GreenfootImage("Score: " + score ,50, Color.CYAN, Color.BLUE));
    }
    /**
     * Method getScore-
     *  Returns the current score.
     * @return int
     */
    public int getScore(){
        return score;
    }
    /**
     * Method setScore- 
     *  Sets the score to the passed int.
     * @param int score
     */
    public void setScore(int score){
        this.score = score;
    }
}
