import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**A first person shooter, arcade game with an Actor inside of MyWorld, 
 * a bullet extending that actor.
 * @author Bryan Nonni [Original credit: Craig Sapp, Sav School of Arts]
 * @version 2.0*/
public class Bullet extends Actor
{
    /** #1 Create an instance variable called speed to be used in the bullet
       constructor*/
    private int speed;
    
    /** #2 Create a Bullet constructor and pass an argument setting the 
       class instance variable equal to the argument*/
    public Bullet(int s){
        this.speed = s;
        /** #4 Use the built-in Greenfoot methods to get the image and scale 
         * it to another size*/
        getImage().scale(20,20);
    }
     
    /** Use the act method to move the bullet @ the speed set in your #1 
       instance variable*/
    public void act() 
    {   /** Set a conditional to move all bullets on a spacebar key press */
       if ( Greenfoot.isKeyDown("space") ){
           move(speed);
       }
       /** Set a conditional to remove bullets once they reach the edge */
       if( isAtEdge() ){
           getWorld().removeObject(this);
        }
    }
}