package LinkedList;
import java.util.*;
public class Pila {
    
    private LinkedList<Character> pila;
    
    public Pila(){
        pila = new LinkedList<Character>();
    }
    
    public boolean pilaVacia(){
        return pila.isEmpty();
    }
    
    public void insertar(Character elemento){
        pila.addLast(elemento);
    }
    
    public Character eliminar (){
        return pila.removeLast();
    }
}
