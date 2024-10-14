import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fish1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SlowFish extends Actor
{
    /**
     * Act - do whatever the fish1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setLocation(getX()+1, getY());
        move(5);
        if (isAtEdge())
        {
            turn(28);
        }
    }
}
