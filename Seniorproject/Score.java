
import greenfoot.*;

public class Score extends Actor
{
    public int score;
 
    public Score() 
    {
        update();
    }
 
    public void addScore(int pn)
    {
        score = score + pn;
        update();
    }
 
    public int getScore()
    {
        return score;
    }
 
    public void update()
    {
        setImage(new GreenfootImage("Score: "+score, 18, Color.BLACK, Color.WHITE));
    }
}