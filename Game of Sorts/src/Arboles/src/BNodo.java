
public class BNodo
{
    public int []valores;
    public BNodo []nodo;
    public static int numValores;
    public boolean tengoHijos = false;
    public int ocupados = 0;
    public BNodo padre;
    
    public BNodo(){
       nodo = new BNodo [B.grado * 2 + 3];
       valores = new int [B.grado * 2 + 1];
    }
    
}
    

