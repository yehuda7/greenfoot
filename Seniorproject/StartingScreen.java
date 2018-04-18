import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartingScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartingScreen extends World
{

    /**
     * Constructor for objects of class StartingScreen.
     * 
     */
    public StartingScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1024, 576, 1); 
        Greenfoot.start();
    }


    public void act()
    {
        if (Greenfoot.isKeyDown("space")) Greenfoot.setWorld(new GameWorld());
    }

}