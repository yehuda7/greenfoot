import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameLoop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameLoop extends Actor
{
    /**
     * Act - do whatever the GameLoop wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int timer = 0;
    public void act() 
    {
        increaseTimer();
    }
    
    public int getTimer(){
        return timer;
    }
    
    public void setTimer(int t){
        timer = t;        
    }
    
    public void increaseTimer(){
        timer++;
    }
}
