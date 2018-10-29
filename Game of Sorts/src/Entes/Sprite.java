// Parte de este código se tomó de http://zetcode.com/tutorials/javagamestutorial/
package Entes;
import java.awt.Image;
/**
 * @author Chacón Campos
 */
public class Sprite {
    private boolean visible;
    private Image image;
    protected int x;
    protected int y;
    protected boolean dying;
    protected int movementX;
    protected int movementY;
    
    public Sprite(){
        visible = true;
    }
    public void die(){
        visible = false;
    }
    public boolean  isVisible(){
        return visible;
    }
    public void setImage(Image image){
        this.image = image;
    }
    public Image getImage(){
        return image;
    }
    
}
