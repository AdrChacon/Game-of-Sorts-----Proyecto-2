package Entes;

import javax.swing.ImageIcon;

// Para probar import java.util.Scanner;

/**
 * @author Chacón Campos
 */

public class Fire extends Sprite{
    private int x;
    private int y;
    private int width;
    private int height;
    private int speed;
    private String bulletOwner;
    private final String imgFire = "src/imagenes/fire.png";
    public Fire(int xCoord, int yCoord, String owner){
        x = xCoord;
        y = yCoord;
        speed = 3;
        bulletOwner = owner;
        ImageIcon ii = new ImageIcon(imgFire);
        width = ii.getImage().getWidth(null);
        height = ii.getImage().getHeight(null);
        setImage(ii.getImage());
    }
    public void traverse(String dir){
        if(bulletOwner == "Drake"){
            x -= speed;
        }
        else{
            x += speed;
        }
        System.out.println(this.x);
    }
    public void removeSelf(){
        // Esta función debería eliminar al mismo disparo de la pantalla
    }
    /*
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("Presione 1");
        Fire bolaFuego = new Fire(0, 0);
        while(true){
        int Selection = read.nextInt();
        while(Selection == 1 && bolaFuego.x < 500){
            bolaFuego.traverse("Left");
        }
        break;
        }
    }*/
}
