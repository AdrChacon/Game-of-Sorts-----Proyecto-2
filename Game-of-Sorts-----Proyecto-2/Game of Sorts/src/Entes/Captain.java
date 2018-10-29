package Entes;

/**
 * @author Chacón Campos
 */
public class Captain extends Dragon{
    private String captainOf = "";
    
    public Captain(int dragonNumber, Dragon parentDragon, int wave, int x, int y, int dragonAge, int dragonAS){
        super(x, y, "Captain", wave, dragonNumber, parentDragon, dragonAge, dragonAS);
        health = 3;
    }
    public void addSubordinate(String subordinate){
        if(captainOf == ""){
        captainOf = subordinate;
        }else{
        captainOf += ", " + subordinate;
        }
        
    }
    public String getSubordinates(){
        return captainOf;
    }
    
}
