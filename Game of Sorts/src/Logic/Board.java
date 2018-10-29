// Parte de este código se tomó de http://zetcode.com/tutorials/javagamestutorial/
package Logic;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.util.ArrayList;
import java.util.Random;
import java.util.Iterator;

import Entes.*;

/**
 * @author Chacón Campos
 */
public class Board extends JPanel implements Runnable{
    private int winWidth = 800;
    private int winHeight = 600;
    private int enemyWave = 1;
    private int enemyWaveCount = 100;
    private ArrayList<Dragon> dragonsArray = new ArrayList(100);
    private Dimension d;
    private Random randomizer = new Random();
    private int initDrakeX = winWidth - 70;
    private int initDrakeY = winHeight/2;
    private Caballero knight;
    private boolean inGame = true;
    private int delay = 60;
    private Timer timer;
    private int DELAY = 17;
    private Thread animator;
    
    public Board(){
        initBoard();
    }
    
    public void initBoard(){
        addKeyListener(new TAdapter());
        setFocusable(true);
        d = new Dimension(winWidth, winHeight);
        setBackground(Color.white);
        gameInit();
        setDoubleBuffered(true);
    }
    public void addNotify(){
        super.addNotify();
        gameInit();
    }
    public void gameInit(){ //Aquí se crean instancias de los objetos del juego
        int drakeSpawnX = initDrakeX;
        for(int i = 0; i<enemyWaveCount; i++){
            Infantry drake = new Infantry(i, null, enemyWave, drakeSpawnX, initDrakeY, randomizer.nextInt(1000), randomizer.nextInt(100));
            drakeSpawnX = drakeSpawnX + 80;
            dragonsArray.add(drake);
            }
        knight = Caballero.getCaballero(75, winHeight/2);
        
        if (animator == null || !inGame){
            animator = new Thread(this);
            animator.start();
        }
        }
    public void drawDragons(Graphics g){ //Función de dibujo de los Dragones
        for(Dragon dragon: dragonsArray){
            g.drawImage(dragon.getImage(), dragon.getX(), dragon.getY(), this);
        }
    }
    public void drawPlayer(Graphics g){ //Función de dibujo del jugador
        g.drawImage(knight.getImage(),knight.getX(),knight.getY(),this);
    }
    public void paintComponent(Graphics g){ //Dibujado de objetos en la pantalla
        super.paintComponent(g);
        g.setColor(Color.white);
        g.fillRect(0, 0, d.width, d.height);
        g.setColor(Color.GREEN);
        if(inGame){
            drawPlayer(g);
            drawDragons(g);
        }
        Toolkit.getDefaultToolkit().sync();
        g.dispose();
    }
    public void animationCycle(){ //Función de manejo del movimiento de los Sprites
        knight.update();
        for(Dragon dragon: dragonsArray){
            dragon.advance();
            if(knight.getX()>256){
                dragon.scroll();
            }
        }
    }
    public void run(){
    /*Función principal del juego, aquí se llaman las funciones de dibujo y 
      animación de los objetos del juego  2*/
        long beforeTime, timeDiff, sleep;

        beforeTime = System.currentTimeMillis();

        while (inGame) {

            repaint();
            animationCycle();

            timeDiff = System.currentTimeMillis() - beforeTime;
            sleep = DELAY - timeDiff;

            if (sleep < 0) {
                sleep = 2;
            }

            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                System.out.println("interrupted");
            }
            
            beforeTime = System.currentTimeMillis();
        }
    }
    private class TAdapter extends KeyAdapter {
        /*Clase privada para el control de inputs del teclado mientras
          el juego está en ejecución.
        */

        public void keyReleased(KeyEvent e) {

            knight.keyReleased(e);
        }

        public void keyPressed(KeyEvent e) {

            knight.keyPressed(e);

        }
    }
    }
    
   