import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author Orel Yehuda 
 * @version hehexd123
 */
public class Player extends Actor
{
   private final int SPEED = 4;
   private int facing  = 0;
   private int lives = 3;
   private int score = 0;
   
   
    public void act() 
    {
        movement();
        checkTouching();
    }
    
    private void checkTouching(){
      if(isTouching(Zombie.class)){
          removeTouching(Zombie.class);
          lives--;
       }
      if(isTouching(StandingZombie.class)){
          removeTouching(StandingZombie.class);
          lives--;
       }
       if(isTouching(Ball.class)){
          removeTouching(Ball.class);
          score++;
       }
    }
    
    public int getScore(){
        return score;
    }
    
    public int getLives(){
        return lives;
    }
    
    public void movement(){
        int x = getX();
        int y = getY();
        
        if(Greenfoot.isKeyDown("up") || Greenfoot.isKeyDown("w") && y > 10)  
        {  
            y -= SPEED;
            facing = 0;
        }
         if(Greenfoot.isKeyDown("down") || Greenfoot.isKeyDown("s") && y <560)  
        {  
            y += SPEED;
            facing = 1;
        }
         if(Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("a") && x > 3)  
        {  
            x -= SPEED;
            facing = 2;
        }
         if(Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("d") && x < 1020)  
        {  
            x += SPEED;
            facing = 3;
        }
         setLocation(x, y) ;
    }
    
    
}
