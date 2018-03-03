import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EndGameScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EndGameScreen extends World
{

    /**
     * Constructor for objects of class EndGameScreen.
     * 
     */
    public EndGameScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        drawScreen(Color.BLACK, Color.RED, "GAME OVER");
    }
    
    public EndGameScreen(Color bgColor, Color textColor, String message)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        drawScreen(bgColor, textColor, message);
    }
    public void drawScreen(Color bgColor, Color textColor, String message){
        GreenfootImage bg = new GreenfootImage(getWidth(), getHeight());
        bg.setColor(bgColor);
        bg.fillRect(0, 0, getWidth(), getHeight());
        setBackground(bg);
        Font f = new Font("SansSerif", 60);
        bg.setFont(f);
        bg.setColor(textColor);
        bg.drawString(message, getWidth()/2 - message.length()*20, getHeight()/2);
        
    }
}
