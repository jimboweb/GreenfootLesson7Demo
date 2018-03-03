import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private int score = 0;
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
        Car car = new Car();
        addObject(car,300,200);

        Pizza pizza = new Pizza();
        addObject(pizza,117,303);
        Pizza pizza2 = new Pizza();
        addObject(pizza2,453,46);
        Pizza pizza3 = new Pizza();
        addObject(pizza3,156,78);
        Pizza pizza4 = new Pizza();
        addObject(pizza4,482,270);
        Bomb bomb = new Bomb();
        addObject(bomb,394,334);
        Bomb bomb2 = new Bomb();
        addObject(bomb2,524,204);
        Bomb bomb3 = new Bomb();
        addObject(bomb3,326,79);
        Bomb bomb4 = new Bomb();
        addObject(bomb4,238,42);
        Bomb bomb5 = new Bomb();
        addObject(bomb5,92,268);
        Bomb bomb6 = new Bomb();
        addObject(bomb6,25,129);
        Bomb bomb7 = new Bomb();
        addObject(bomb7,221,356);
        Bomb bomb8 = new Bomb();
        addObject(bomb8,237,261);
        Bomb bomb9 = new Bomb();
        addObject(bomb9,59,372);
    }
    
    public void act(){
        showText("Score = " + score, 100, 20);
        if(getObjects(Pizza.class).isEmpty()){
            Greenfoot.setWorld(new EndGameScreen(Color.GREEN, Color.BLUE, "YOU WON"));
        }
    }
    
    public void increaseScore(){
        score = score + 1;
    }
}













