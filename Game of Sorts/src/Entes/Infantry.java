package Entes;

/**
 * @author Chacón Campos
 */
public class Infantry extends Dragon{
    
    public Infantry(int dragonNumber, Dragon parentDragon, int wave, int x, int y, int dragonAge, int dragonAS){
        super(x, y, "Infantry", wave, dragonNumber, parentDragon, dragonAge, dragonAS);
        health = 3;
    }
}
