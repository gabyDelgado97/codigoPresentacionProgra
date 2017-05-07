package LinkedList;
import java.util.*;

public class Cola {
    private LinkedList<Character> cola;
    
    public Cola(){
        cola = new LinkedList<Character>();
    }
    
    public boolean colaVacia(){
        return cola.isEmpty();
    }
    
    public void insertar(Character elemento){
        cola.addLast(elemento);
    }
    
    public Character eliminar (){
        return cola.removeFirst();
    }
}
