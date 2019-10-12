import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * #1 Give your player a Bullet object creating a has-a relationship between the
 * Player and the Bullet
 */
public class Player extends Actor
{
    private Bullet bullet;
    /** #2 Create a Player constructor for your Player class */
    public Player(){
        bullet = new Bullet(10);
    }
    /** #3 Use Greenfoot methods to make your Player respond to user inputs. 
       Keep in mind the difference between static and non-static methods*/
    public void act() 
    {
        if ( Greenfoot.isKeyDown("space") ){
            /** #4 Use methods to add the bullet object to your world */
            getWorld().addObject(bullet, this.getX(), this.getY());
        }
    }     
}
