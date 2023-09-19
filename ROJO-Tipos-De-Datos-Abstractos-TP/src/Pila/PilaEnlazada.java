package Pila;

/**
 *
 * @author estudiante
 */
public class PilaEnlazada implements PilaInterface {

        private Nodo top; 
        
    public PilaEnlazada(Nodo top) {
        this.top = null;    
    }

    PilaEnlazada() {
           this.top = null;
    }

    @Override
    public void push(Object elemento) {
        
        Nodo nuevoNodo = new Nodo(elemento);
        if (isEmpty()) {
            top = nuevoNodo; 
        } else {
            nuevoNodo.setSiguiente(top);
            top = nuevoNodo;
        } 
    }

    @Override
    public Object pop() {
        
        if (isEmpty()) {
        throw new IllegalStateException("La pila está vacía"); 
        }
        Object elemento = top.getElemento(); 
        top = top.getSiguiente(); 
        return elemento;
    }
    
    @Override
    public Object peek() {
        
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía"); 
        }
        return top.getElemento(); 
    }
    
    @Override
    public boolean isEmpty() {
        return top == null; 
    }

    @Override
    public int size() {
        int count = 0;
        Nodo nodoActual = top;
        while (nodoActual != null) {
            count++;
            nodoActual = nodoActual.getSiguiente();
        }
        return count; 
        }
    }