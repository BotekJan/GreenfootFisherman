import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class is used so we can display images posing as actors in the game worlds without
 * creating a new class for each image
 * 
 * @author (Jan Botek) 
 * @version (1.0.0)
 */
public class Image extends Actor
{
    public Image(GreenfootImage image){
        setImage(image);
    }
}
