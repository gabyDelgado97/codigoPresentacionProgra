package LinkedList;
import java.util.Scanner;
public class NumeroCapicua {
    
    public static void main(String[] args) {
        menu();
    }
    
    public static void menu(){
        Scanner entrada = new Scanner(System.in);
        String numero;
        do{
            System.out.println("Ingrese el numero que desea saber si es capicua");
            numero = entrada.next();
            if(!esCapicua(numero)){
                System.out.println("El numero "+numero+" NO es capicua");
            }else{
                System.out.println("El numero "+numero+" SI es capicua");
                break;
            }
        }while(true);
    } 
    
    static boolean esCapicua(String numero){
        Cola cola = new Cola();
        Pila pila = new Pila();
        for(int i=0; i<numero.length(); i++){
            cola.insertar(new Character(numero.charAt(i)));
            pila.insertar(new Character(numero.charAt(i)));
        }
        boolean es = true;
        while(es && !cola.colaVacia()){
            Character c1, c2;
            c1 = cola.eliminar();
            c2 = pila.eliminar();
            es = es && (c1.equals(c2));
        }
        return es;
    }
}
