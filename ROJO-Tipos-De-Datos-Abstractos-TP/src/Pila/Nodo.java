package Pila;

/**
 *
 * @author estudiante
 */
public class Nodo {
    
    private Object elemento;
    private Nodo siguiente; 

    public Nodo(Object elemento) {
        this.elemento = elemento;
        this.siguiente = null;
    }

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
