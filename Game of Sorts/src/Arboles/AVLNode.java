package Arboles;        
    public class AVLNode {
    public Comparable dato;      	 // el dato del nodo
    public AVLNode izquierdo;            // hijo izquierdo
    public AVLNode derecho;              // hijo derecho
    public int height;                   // altura
    public int x;
    public int y;

    // Constructors
    public AVLNode( Comparable dato, int x, int y ){
        this( dato, null, null, x, y );
    }

    public AVLNode( Comparable dato, AVLNode izq, AVLNode der, int x, int y ){
        this.dato = dato;
        this.izquierdo = izq;
        this.derecho = der;
        height   = 0;               // altura predeterminada
        this.x = x;
        this.y = y;
    }
}
