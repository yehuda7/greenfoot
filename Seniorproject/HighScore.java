import greenfoot.*;

/**
 * 
 */
public class HighScore extends Actor
{
    public int score;

    /**
     * 
     */
    public HighScore()
    {
        update();
    }

    /**
     * 
     */
    public void addScore(int pn)
    {
        score = score + pn;
        update();
    }

    /**
     * 
     */
    public int getScore()
    {
        return score;
    }

    /**
     * 
     */
    public void setScore(int s)
    {
        score = s;
        update ();
    }

    /**
     * 
     */
    public void update()
    {
        setImage ( new GreenfootImage ( "High Score: " + score , 14 , Color . BLACK , Color . WHITE ) );
    }
}
