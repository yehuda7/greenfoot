import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameWorld extends World
{

    /**
     * Constructor for objects of class GameWorld.
     * 
     */
    private GameLoop loop = new GameLoop();
    private Player player = new Player();
    
    private Heart h1 = new Heart();
    private Heart h2 = new Heart();
    private Heart h3 = new Heart();
    
    private int gate = -1;
    
    public GameWorld()
    {    
        super(1024, 576, 1, false);
        setUp(); 
    }
    
    private void setUp(){
        addObject(player,640,360);
        
        addObject(h1,50,50);
        addObject(h2,110,50);
        addObject(h3,170,50);
        
        addObject(loop,-20,0);
        
        StandingZombie z = new StandingZombie();
        addObject(z,Greenfoot.getRandomNumber(1000),Greenfoot.getRandomNumber(550));
        StandingZombie z1 = new StandingZombie();
        addObject(z1,Greenfoot.getRandomNumber(1000),Greenfoot.getRandomNumber(550));
        StandingZombie z2 = new StandingZombie();
        addObject(z2,Greenfoot.getRandomNumber(1000),Greenfoot.getRandomNumber(550));
    }
    
    public void act(){
        timerLoop();
        updateHearts();
        addBalls();
    }
    
    private void addBalls(){
        int s = getObjects(Ball.class).size();
        if(s == 0){
            Ball b = new Ball();
            addObject(b,Greenfoot.getRandomNumber(1000),Greenfoot.getRandomNumber(550));
        }
    }
    
    private void updateHearts(){
        int x = player.getLives();
        switch(x){
            case 3: 
                h1.setLocation(50,50);
                h2.setLocation(110,50);
                h3.setLocation(170,50);
            break;
             case 2: 
                h1.setLocation(50,50);
                h2.setLocation(110,50);
                h3.setLocation(-170,50); 
            break;
            case 1: 
                h1.setLocation(50,50);
                h2.setLocation(-110,50);
                h3.setLocation(-170,50); 
            break;
            case 0:
                playerDead();
                h1.setLocation(-50,50);
            break;
         
        }
    }
    private void playerDead(){
        Greenfoot.setWorld(new StartingScreen());
    }
   
    private void timerLoop(){
        if(loop.getTimer() > 300){
            if(gate == 1){
                addZombie();
            }
            addStandingZombie();
            loop.setTimer(100);
            gate = gate*-1;
        }
    }
    private void addZombie(){
        Zombie z = new Zombie();
        addObject(z,Greenfoot.getRandomNumber(1000),Greenfoot.getRandomNumber(550));
    }
    private void addStandingZombie(){
        StandingZombie z = new StandingZombie();
        addObject(z,Greenfoot.getRandomNumber(1000),Greenfoot.getRandomNumber(550));
    }
}
