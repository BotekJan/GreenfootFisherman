import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * When the fish touches the pizza, the pizza will dissapear and the fish will get a bonus speed for a certain time.
 * 
 * @author (Jan Botek) 
 * @version (1.0.0)
 */
public class Pizza extends Actor
{
    public void act() 
    {
        gettingEaten();
        if(getWorld() == null)
            return;
        falling();
    }
    private void falling(){
        setLocation(getX(), getY() + 5);
        if(isAtEdge()){
            getWorld().removeObject(this);
        }
    }
    private void gettingEaten(){
        Fish fish = (Fish) getOneIntersectingObject(Fish.class);
        if(fish != null){
            fish.getBonusSpeed(100);
            getWorld().removeObject(this);
        }
    }
}
