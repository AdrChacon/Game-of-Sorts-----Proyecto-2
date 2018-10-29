public class BinarioNodo {
    
    /* Declaraciones de variables */
    private int valor;
    private BinarioNodo padre;
    private BinarioNodo hojaIzquierda;
    private BinarioNodo hojaDerecha;
    private int x;
    private int y;
    
    /* Constructor */
    public BinarioNodo(int valor, int x, int y) {
        this.valor = valor;
    }

    /* Setters y Getters */
    public int getValor() {
        return valor;
    }
    public int getx(){
        return x;
    }
    public int gety(){
        return y;
    }
    
    public int setValor(int valor){
        this.valor = valor;
        return 0;
        //revisar
    }

    public BinarioNodo getPadre() {
        return padre;
    }

    public void setPadre(BinarioNodo padre) {
        this.padre = padre;
    }

    public BinarioNodo getHojaIzquierda() {
        return hojaIzquierda;
    }

    public void setHojaIzquierda(BinarioNodo hojaIzquierda) {
        this.hojaIzquierda = hojaIzquierda;
    }

    public BinarioNodo getHojaDerecha() {
        return hojaDerecha;
    }

    public void setHojaDerecha(BinarioNodo hojaDerecha) {
        this.hojaDerecha = hojaDerecha;
    }

    
}
