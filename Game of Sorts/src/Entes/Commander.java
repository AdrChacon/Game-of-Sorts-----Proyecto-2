package Entes;

/**
 *
 * @author Chacón Campos
 */
public class Commander extends Dragon{
    private static Commander boss;
    public static Commander getCommander(int dragonNumber, Dragon parentDragon, int wave, int x, int y, int dragonAge, int dragonAS){
        /*
            Singleton para la creación del dragon Comandante
        */
        if(boss == null){
        boss = new Commander(dragonNumber,parentDragon, wave, x, y, dragonAge, dragonAS);
        }
        return boss;
        
    }
    private Commander(int dragonNumber, Dragon parentDragon, int wave, int x, int y, int dragonAge, int dragonAS){
       super(x, y, "Commander", wave, dragonNumber, parentDragon, dragonAge, dragonAS);
       health = 5;
}
    
}
