package ArrayList;
import java.util.*;

public class Ejercicio4ArrayList {
    
    
    public static void main(String[] args) {
        menu();
    }
    
    public static void menu(){
        Scanner entrada= new Scanner(System.in);
        List lista = new ArrayList();
        int opc;
        do{
            System.out.println("MENU OPERACIONES BASICAS EN ARRAYLIST");
            System.out.println("1) Ingresar un dato");
            System.out.println("2) Eliminar un dato");
            System.out.println("3) Buscar un dato");
            System.out.println("4) Modificar el dato del centro");
            System.out.println("5) Mostrar Lista");
            System.out.println("6) Recorrer la Lista a partir de un dato");
            System.out.println("7) Salir");
            opc=entrada.nextInt();
            switch(opc){
                    case 1: 
                        ingresarDato(lista);
                        break;
                    case 2:
                        eliminarDato(lista);
                        break;
                    case 3:
                        buscarDato(lista);
                        break;
                    case 4:
                        modCentro(lista);
                        break;
                    case 5: 
                        System.out.println("La lista completa es: "+lista);
                        break;
                    case 6:
                        recorrerLista(lista);
                        break;
                    case 7:
                        break;
            }
        }while(opc!=7);
    }
    
    public static void ingresarDato(List lista){
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese un dato: ");
        lista.add(entrada.next());
    }
    
    public static void eliminarDato(List lista){
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese el dato que desea eliminar: ");
        String eliminar=entrada.next();
        if(lista.remove(eliminar)){
            System.out.println("El dato se elimino de forma correcta");
        }else{
            System.out.println("El dato "+eliminar+" no fue encontrado");
        }
    }
    
    public static void buscarDato(List lista){
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese el dato que desea buscar: ");
        String buscar=entrada.next();
        int posicion_palabra=lista.indexOf(buscar);
        if(posicion_palabra>=0){
            System.out.println("El dato "+buscar+" se encuentra en la posicion "+(posicion_palabra+1));
        }else{
            System.out.println("El dato "+buscar+" no fue encontrado");
        }
    }
    
    public static void recorrerLista(List lista){
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese el dato que desea enlistar la lista: ");
        String dato=entrada.next();
        int posicion_palabra=lista.indexOf(dato);
        ListIterator ls = lista.listIterator(posicion_palabra);  //permite recorrer la lista
        while(ls.hasNext()){   //levuelve true si aun quedan elementos por visitar
            System.out.println((String)ls.next()+" ");
        }
    }
    
    public static void modCentro(List lista){
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese el nuevo dato que reemplazara al anterior: ");
        String nuevo=entrada.next();
        lista.set(lista.size()/2, nuevo);  
    }   
}