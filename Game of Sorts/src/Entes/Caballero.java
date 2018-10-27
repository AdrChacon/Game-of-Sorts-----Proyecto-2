package Entes;

import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

/**
 * @author Chacón Campos
 */
public class Caballero extends Sprite{
    private int x;
    private int y;
    private int width;
    private int height;
    private int health;
    private static Caballero knight;
    private final String caballeroImg = "src/imagenes/Griffin.png";
    private Fire playerShot;
    
    public static Caballero getCaballero(int X, int Y){
        if(knight == null){
        knight = new Caballero(X, Y);
        }
        return knight;
    }
    private Caballero(int X, int Y){
        ImageIcon ii = new ImageIcon(caballeroImg);
        setImage(ii.getImage());
        width = ii.getImage().getWidth(null);
        height = ii.getImage().getHeight(null);
        setImage(ii.getImage());
        x = X;
        y = Y;
        health = 5;        
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
    public Fire shootFire(){
        playerShot = new Fire(this.x, this.y, "Player");
        return playerShot;
    }
    public void update(){
        if(x+movementX > 256+5){
            x = 0;
        }else if(x+movementX < 0){
            x = 0;
        }else{
        x += movementX;
        }
        if(y+movementY > 600-height){
            y = 600-height;
        }else if(y+movementY < 0){
            y = 0;
        }else{
        y += movementY;
        }
    }
    
    // Controles del Caballero
    public void keyPressed(KeyEvent e){
        int key = e.getKeyCode();
        if(key == KeyEvent.VK_LEFT){
            movementX = -4;
        }
        if(key == KeyEvent.VK_RIGHT){
            movementX = 4;
        }
        if(key == KeyEvent.VK_UP){
            movementY = -4;
        }
        if(key == KeyEvent.VK_DOWN){
            movementY = 4;
        }
        if(key == KeyEvent.VK_SPACE){
            shootFire();
        }
    }
    public void keyReleased(KeyEvent e){
        int key = e.getKeyCode();
        if(key == KeyEvent.VK_LEFT || key == KeyEvent.VK_RIGHT){
            movementX = 0;
        }
        if(key == KeyEvent.VK_DOWN || key == KeyEvent.VK_UP){
            movementY = 0;
        }
    }
    /* MAIN de prueba
    public static void main(String[] args){
        Caballero knight = Caballero.getCaballero();
        System.out.println(knight.getX());
        System.out.println(knight.getY());
        System.out.println(knight.getHealth());
        knight.moveRIGHT();
        knight.moveRIGHT();
        knight.moveRIGHT();
        System.out.println(knight.getX());
        
    } */
}
