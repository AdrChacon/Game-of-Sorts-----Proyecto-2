package Entes;

import javax.swing.ImageIcon;
import java.awt.Rectangle;
/**
 *
 * @author Chacón Campos
 */
public class Dragon extends Sprite{
    protected int x;
    protected int y;
    protected int width;
    protected int height;
    protected int health;
    protected int age;
    protected String name;
    protected Dragon parent;
    protected String dragonClass;
    protected int attackSpeed;
    protected Fire shotDrake;
    protected final String dragonImg = "src/imagenes/wyvernDrake.png";
    protected Rectangle spriteRectangle;
    
    public Dragon(int X, int Y, String hierarchy, int wave, int dragonNumber, Dragon parentDragon, int dragonAge,int dragonAS){
        x = X;
        y = Y;
        age = dragonAge;
        
        ImageIcon ii = new ImageIcon(dragonImg);
        width = ii.getImage().getWidth(null);
        height = ii.getImage().getHeight(null);
        setImage(ii.getImage());
        name = wave + hierarchy + dragonNumber;
        attackSpeed = dragonAS; 
        if (parentDragon == null){
        parent = null;}
        else{
        parent = parentDragon;}
        
    }
    public void advance(){
        x -= 1;
    }
    public void scroll(){
        x -= 50;
    }
    public Fire shootFire(){
        shotDrake = new Fire(this.x, this.y, "Drake");
        return shotDrake;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public int getHealth(){
        return health;
    }
    public String getName(){
        return name;
    }
    public int getAttackSpeed(){
        return attackSpeed;
    }
    public Dragon getParent(){
        if(parent == null){
        return null;
        } else{
        return parent;
        }
    }
    public static void main(String[] args){
        Dragon fitz = new Dragon(10,10,"Infantry",3,24,null,5,2);
        Dragon fizz = new Dragon(5,5,"Commander",3,28,fitz,3,3);
        System.out.println(fizz.getHealth());
        System.out.println(fizz.getAttackSpeed());
        System.out.println(fizz.getX());
        System.out.println(fizz.getY());
        fizz.advance();
        fizz.advance();
        System.out.println(fizz.getX());
        System.out.println(fizz.getName());
        System.out.println(fizz.getParent().getName());
        System.out.println(fizz.width + " :W,H: " + fizz.height);
    }
}
