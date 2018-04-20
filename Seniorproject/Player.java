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
   
   private boolean moving = false;
   
   private int rightFrame = 0;
   private int leftFrame = 0;
   private int upFrame = 0;
   private int downFrame = 0;
   
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
        
        if(Greenfoot.isKeyDown("up") && y > 10 || Greenfoot.isKeyDown("w") && y > 10)  
        {  
            y -= SPEED;
            facing = 0;
            animateUp();
            moving = true;
        }
         if(Greenfoot.isKeyDown("down") && y <560 || Greenfoot.isKeyDown("s") && y <560)  
        {  
            y += SPEED;
            facing = 1;
            animateDown();
            moving = true;
        }
         if(Greenfoot.isKeyDown("left") && x > 3 || Greenfoot.isKeyDown("a") && x > 3)  
        {  
            x -= SPEED;
            facing = 2;
            animateLeft();
            moving = true;
        }
         if(Greenfoot.isKeyDown("right") && x < 1020 || Greenfoot.isKeyDown("d") && x < 1020)  
        {  
            x += SPEED;
            facing = 3;
            animateRight();
            moving = true; 
        }
        else{
            moving = false;
        }
         setLocation(x, y) ;
    }
    private void animateUp(){
        if(upFrame == 1){
            
        }
        else if(upFrame == 2){
            
        }
        else if(upFrame == 3){
            upFrame = 1; 
        }
        upFrame++;
    }
    
    private void animateDown(){
        if(downFrame == 1){
            
        }
        else if(downFrame == 2){
            
        }
        else if(downFrame == 3){
            downFrame = 1; 
        }
        downFrame++;
    }
    
    private void animateRight(){
        if(rightFrame == 1){
            
        }
        else if(rightFrame == 2){
            
        }
        else if(rightFrame == 3){
            rightFrame = 1; 
        }
        rightFrame++;
    }
    
    private void animateLeft(){
        if(leftFrame == 1){
            
        }
        else if(leftFrame == 2){
            
        }
        else if(leftFrame == 3){
            leftFrame = 1; 
        }
        leftFrame++;
    }
}
