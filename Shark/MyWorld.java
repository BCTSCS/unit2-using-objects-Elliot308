import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        SlowFish slowFish = new SlowFish();
        addObject(slowFish,393,163);
        SlowFish slowFish2 = new SlowFish();
        addObject(slowFish2,199,163);
        SlowFish slowFish3 = new SlowFish();
        addObject(slowFish3,156,93);
        SlowFish slowFish4 = new SlowFish();
        addObject(slowFish4,124,263);
        SlowFish slowFish5 = new SlowFish();
        addObject(slowFish5,221,211);
        FastFish fastFish = new FastFish();
        addObject(fastFish,387,280);
        FastFish fastFish2 = new FastFish();
        addObject(fastFish2,267,184);
        shark shark = new shark("Daddy", 16);
        addObject(shark,248,129);
        shark.setLocation(349,91);
        shark shark2 = new shark("Mommy", 13);
        addObject(shark2, 129, 248);
        shark2.setLocation(91,349);
    }
}
