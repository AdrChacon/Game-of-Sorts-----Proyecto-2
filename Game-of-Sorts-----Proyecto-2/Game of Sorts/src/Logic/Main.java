package Logic;
import java.awt.EventQueue;
import javax.swing.JFrame;
/**
 *
 * @author Chacón Campos
 */
public class Main extends JFrame{
    public Main(){
        initUI();
    }
    private void initUI(){
        add(new Board());
        setTitle("Game of Sorts");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800,600);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    public static void main(String[] args) {
        
        EventQueue.invokeLater(() -> {
            Main ex = new Main();
            ex.setVisible(true);
        });
    }
}
