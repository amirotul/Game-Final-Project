import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ladybug here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ladybug extends Actor
{
    /**
     * Act - do whatever the Ladybug wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int skor;
    
    public void act() 
    {
        MyWorld myw1 = (MyWorld) getWorld();
        getWorld().showText("SKOR : "+myw1.getskorLadybug(),50,30);
        gerakAcak () ;
        kenaFlower ();
        kenaAnt ();
        kunciKontrol ();
       
    } 
 public void gerakAcak () {
        move (1);
        if (isAtEdge () ){
            turn (45);
        }
        
 
}
public void kenaFlower (){
    if (isTouching (Flower.class)){
            removeTouching (Flower.class);
            MyWorld myw1 = (MyWorld) getWorld();
            myw1.updskor (10);
    }
}
public void kenaAnt (){
    if (isTouching (Ant.class)){ 
            MyWorld myw1 = (MyWorld) getWorld();
            Greenfoot.setWorld(new GameOver ());

}
}
public void kunciKontrol (){
if (Greenfoot.isKeyDown("left")){
            turn(-10);
    }
    if (Greenfoot.isKeyDown ("right")){
       turn(10);
    }
    if (Greenfoot.isKeyDown ("up")){
        turn(-10);
    }
    if (Greenfoot.isKeyDown ("down")){
        turn(10);
    }
}
}