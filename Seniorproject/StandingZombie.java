import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StandingZombie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StandingZombie extends Actor
{
    /**
     * Act - do whatever the StandingZombie wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void act() 
    {
        if(!getObjectsInRange(180, Player.class).isEmpty()){
            
        turnTowards(getWorld().getObjects(Player.class).get(0).getX(), getWorld().getObjects(Player.class).get(0).getY());
        move(2);
        }
    }   
    
}
