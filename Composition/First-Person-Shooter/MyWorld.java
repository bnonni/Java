import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{   /** #2 Create a new player1 object and instantiate it in the MyWorld
    constructor*/
    private Player player1;
    public MyWorld()
    {    
        /** #1 Create a new world with 600x400 cells with a cell size 
        of 1x1 pixels */
        super(600, 400, 1); 
        /** #3 Use the built-in Greenfoot methods to add this player to your 
         * world*/
        player1 = new Player();
        addObject(player1, 300, 200);
    }
}
